package com.example.marvelapi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SearchView;

import com.example.marvelapi.marvelapi.MarvelApiService;
import com.example.marvelapi.models.Comics;
import com.example.marvelapi.models.MarvelCharacter;
import com.example.marvelapi.models.Root;
import com.example.marvelapi.models.Root2;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.listener.CarouselListener;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;
import org.imaginativeworld.whynotimagecarousel.model.CarouselType;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    private Retrofit retrofit;
    private MarvelApiService marvelApiService;
    final String TAG = "MARVEL";
    final String apikey = "2e7b336e68e0fab8c40dcca28139dde6";
    final String hash = "4eb45b4fdd3bd92029057d403cebe315";
    final int ts = 1;
    Button button, button2;

    private RecyclerView recyclerView;
    private listaMarvelAdapter listaMarvelAdapter;
    ArrayList<MarvelCharacter> filtrado = new ArrayList<>();
    ArrayList<Comics> filtrado2 = new ArrayList<>();


    SearchView search;
    private int offset;
    private boolean aptoParaCargar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search = findViewById(R.id.search);
        search.clearFocus();
        search.setOnQueryTextListener(this);
        button = findViewById(R.id.button);
        button2= findViewById(R.id.button2);
        recyclerView = findViewById(R.id.recyclerView);
        listaMarvelAdapter = new listaMarvelAdapter(this, new listaMarvelAdapter.OnItemClickListener() {


            @Override
            public void onItemClick(MarvelCharacter item) {
                moveToDescription(item);

            }

            @Override
            public void onItemClicks(Comics item2) {
                moveToDescription2(item2);
            }
        });
        recyclerView.setAdapter(listaMarvelAdapter);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                if (dy > 0) {
                    int visibleItemCount = layoutManager.getChildCount();
                    int totalItemCount = layoutManager.getItemCount();
                    int pastVisibleItems = layoutManager.findFirstCompletelyVisibleItemPosition();

                    if (aptoParaCargar) {
                        if ((visibleItemCount + pastVisibleItems) >= totalItemCount) {
                            Log.i(TAG, "llegamos al final");

                            aptoParaCargar = false;
                            offset += 20;
                            if (!filtrado2.isEmpty()) {
                                obtenerListaComics(offset);
                            } else {
                                obtenerDatos(offset);
                            }

                        }
                    }
                }
            }
        });


        retrofit = new Retrofit.Builder()
                .baseUrl("https://gateway.marvel.com/v1/public/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        aptoParaCargar = true;
        offset = 0;
        obtenerDatos(offset);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.scrollToPosition(0);
                aptoParaCargar = true;
                filtrado2.clear();
                obtenerDatos(offset);
                offset = 0;
                listaMarvelAdapter.actualizarMarve();



            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.scrollToPosition(0);
                offset=0;
                obtenerListaComics(offset);


            }
        });



    }

    private void moveToDescription(MarvelCharacter item) {

        Intent intent = new Intent(this, Description.class);
        intent.putExtra("name", item.getName());
        intent.putExtra("description", item.getDescription());
        intent.putExtra("image", item.getThumbnail().getPath() + "." + item.getThumbnail().getExtension());

        startActivity(intent);
    }

    private void moveToDescription2(Comics item2) {

        Intent intent = new Intent(this, Description.class);
        intent.putExtra("name", item2.getTitle());
        intent.putExtra("description", item2.getUpc());
        intent.putExtra("image", item2.getThumbnail().getPath() + "." + item2.getThumbnail().getExtension());

        startActivity(intent);
    }


    private void obtenerDatos(int offset) {
        MarvelApiService service = retrofit.create(MarvelApiService.class);
        Call<Root> rootCall = service.obtenerListaMarvel(20, offset, apikey, hash, ts);

        rootCall.enqueue(new Callback<Root>() {
            @Override
            public void onResponse(Call<Root> call, Response<Root> response) {
                aptoParaCargar = true;
                if (response.isSuccessful()) {
                    Root root = response.body();
                    ArrayList<MarvelCharacter> hero = root.getData().getResults();
                    filtrado.clear();
                    for (MarvelCharacter heroes : hero) {
                        String imageUrl = heroes.getThumbnail().getPath() + "." + heroes.getThumbnail().getExtension();
                        if (!imageUrl.toLowerCase().contains("image_not_available")) {
                            filtrado.add(heroes);
                        }
                    }
                    listaMarvelAdapter.adicionarListaMarvel(filtrado);
                    obtenerCarrousel(filtrado,filtrado2);


                } else {
                    Log.e(TAG, "error en la respuesta: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<Root> call, Throwable t) {
                aptoParaCargar = true;
                Log.i(TAG, "error en la solicitud" + t.getMessage());
            }
        });
    }

    private void obtenerListaComics(int offset) {
        MarvelApiService service = retrofit.create(MarvelApiService.class);
        Call<Root2> rootCall2 = service.obtenerListaComics(20, offset, apikey, hash, ts);
        rootCall2.enqueue(new Callback<Root2>() {
            @Override
            public void onResponse(Call<Root2> call, Response<Root2> response) {
                aptoParaCargar = true;
                if (response.isSuccessful()) {
                    Root2 root2 = response.body();
                    ArrayList<Comics> comics = root2.getData().getResults();
                    filtrado2.clear();
                    for (Comics c : comics) {
                            String imageUrl = c.getThumbnail().getPath() + "." + c.getThumbnail().getExtension();
                            if (!imageUrl.toLowerCase().contains("image_not_available")) {
                                filtrado2.add(c);
                            }
                        }
                    listaMarvelAdapter.adicionarListaComicsl(filtrado2);
                        obtenerCarrousel(filtrado,filtrado2);
                } else {
                    Log.e(TAG, "Error en la respuesta: " + response.message());
                }
            }


            @Override
            public void onFailure(Call<Root2> call, Throwable t) {
                aptoParaCargar = true;
                Log.i(TAG, "error en la solicitud" + t.getMessage());
            }
        });



    }

    private void obtenerCarrousel(ArrayList<MarvelCharacter> hero, ArrayList<Comics> comics) {
        ImageCarousel carousel = findViewById(R.id.carousel);
        List<CarouselItem> list = new ArrayList<>();
        carousel.registerLifecycle(getLifecycle());
        if (!filtrado2.isEmpty()) {
            for (Comics c : comics) {
                String imageUrl = c.getThumbnail().getPath() + "." + c.getThumbnail().getExtension();
                if (!imageUrl.toLowerCase().contains("image_not_available")) {
                    CarouselItem carouselItem = new CarouselItem(imageUrl);
                    list.add(carouselItem);

                }
            }
        }
        else{
            for (MarvelCharacter character : hero) {
                String imageUrl = character.getThumbnail().getPath() + "." + character.getThumbnail().getExtension();
                if (!imageUrl.toLowerCase().contains("image_not_available")) {
                    CarouselItem carouselItem = new CarouselItem(imageUrl);
                    list.add(carouselItem);
                }

            }
        }


        carousel.setCarouselType(CarouselType.SHOWCASE);

        carousel.setData(list);
        carousel.setAutoPlay(true);
        carousel.setCarouselListener(new CarouselListener() {
            @Nullable
            @Override
            public ViewBinding onCreateViewHolder(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
                return null;
            }

            @Override
            public void onBindViewHolder(@NonNull ViewBinding viewBinding, @NonNull CarouselItem carouselItem, int i) {

            }

            @Override
            public void onClick(int position, @NonNull CarouselItem carouselItem) {
                if (!filtrado2.isEmpty()){
                    Comics c = filtrado2.get(position);
                    moveToDescription2(c);
                } else {
                    MarvelCharacter marvelCharacter = filtrado.get(position);
                    moveToDescription(marvelCharacter);
                }


            }

            @Override
            public void onLongClick(int i, @NonNull CarouselItem carouselItem) {

            }
        });

    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        listaMarvelAdapter.filtrado(s);
        return false;
    }

}

