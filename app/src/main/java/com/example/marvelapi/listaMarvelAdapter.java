package com.example.marvelapi;


import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory;
import com.example.marvelapi.models.Comics;
import com.example.marvelapi.models.Data;
import com.example.marvelapi.models.MarvelCharacter;
import com.example.marvelapi.models.Thumbnail;


import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import retrofit2.Call;

public class listaMarvelAdapter extends RecyclerView.Adapter<listaMarvelAdapter.ViewHolder> {
    private ArrayList<MarvelCharacter> dataMarvel;
    private ArrayList<MarvelCharacter> filtradoSearch;
    private ArrayList<Comics> filtradoComics;
    private ArrayList<Comics> datacomics;

    final listaMarvelAdapter.OnItemClickListener listener;
    private Context context;
    private int lastPosition=-1;

    public listaMarvelAdapter(Context context,  listaMarvelAdapter.OnItemClickListener listener) {
        this.context = context;
        dataMarvel = new ArrayList<>();
        datacomics= new ArrayList<>();
        this.listener= listener;
        filtradoSearch = new ArrayList<>();
        filtradoComics = new ArrayList<>();

    }



    public interface OnItemClickListener {
        void onItemClick( MarvelCharacter item);

        void onItemClicks(Comics item2);
    }


    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.marvel_list,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
        if (!datacomics.isEmpty()) {
            Comics c = datacomics.get(position);
            holder.nameCharacter.setText(c.getTitle());
            holder.binData2(datacomics.get(position));
            String imageUrl = c.getThumbnail().getPath() + "." + c.getThumbnail().getExtension();
            Glide.with(context).load(imageUrl).diskCacheStrategy(DiskCacheStrategy.ALL)
                    .transition(withCrossFade()).into(holder.imageCharacter);

        } else {
            MarvelCharacter m = dataMarvel.get(position );
            holder.nameCharacter.setText(m.getName());
            holder.binData(dataMarvel.get(position));
            setAnimation(holder.itemView,position);
            String imageUrl = m.getThumbnail().getPath() + "." + m.getThumbnail().getExtension();
            Glide.with(context).load(imageUrl).centerCrop().circleCrop().diskCacheStrategy(DiskCacheStrategy.ALL)
                    .transition(withCrossFade()).into(holder.imageCharacter);
        }




    }
    public void filtrado( String txtBuscar) {
        int longitud = txtBuscar.length();
        if (longitud == 0) {
            if (!datacomics.isEmpty()) {
                datacomics.clear();
                datacomics.addAll(filtradoComics);
            }
             if (!dataMarvel.isEmpty()){
                dataMarvel.clear();
                dataMarvel.addAll(filtradoSearch);

            }

        } else {
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
               if (!datacomics.isEmpty()){
                   List<Comics> comicColeecion = datacomics.stream()
                           .filter(i -> i.getTitle().toLowerCase().contains(txtBuscar.toLowerCase()))
                           .collect(Collectors.toList());
                   datacomics.clear();
                   datacomics.addAll(comicColeecion);
               }
                if(!dataMarvel.isEmpty()) {
                    List<MarvelCharacter> collecion = dataMarvel.stream()
                           .filter(i -> i.getName().toLowerCase().contains(txtBuscar.toLowerCase()))
                           .collect(Collectors.toList());
                   dataMarvel.clear();
                   dataMarvel.addAll(collecion);
               }

            } else {
                if (!datacomics.isEmpty()){
                    filtradoComics.clear();
                    for (Comics c : datacomics) {
                        if (c.getTitle().toLowerCase().contains(txtBuscar.toLowerCase())) {
                            filtradoComics.add(c);
                        }
                    }
                    datacomics.clear();
                    datacomics.addAll(filtradoComics);
                } if (!dataMarvel.isEmpty()){
                    filtradoSearch.clear();
                    for (MarvelCharacter c : dataMarvel) {
                        if (c.getName().toLowerCase().contains(txtBuscar.toLowerCase())) {
                            filtradoSearch.add(c);
                        }
                    }
                    dataMarvel.clear();
                    dataMarvel.addAll(filtradoSearch);

                }

            }
        }
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {

        if (!datacomics.isEmpty()){
            return datacomics.size();

        } else {
            return dataMarvel.size();

        }

    }

    public void adicionarListaMarvel(ArrayList<MarvelCharacter> hero) {
        dataMarvel.addAll(hero);
        filtradoSearch.addAll(hero);
        notifyDataSetChanged();


    }

    public void actualizarMarve(){
        datacomics.clear();
        dataMarvel.clear();
        notifyDataSetChanged();
    }

    public void adicionarListaComicsl(ArrayList<Comics> c) {
        datacomics.addAll(c);
        notifyDataSetChanged();


    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageCharacter;
        TextView  nameCharacter;

        public ViewHolder( View itemView) {
            super(itemView);

            imageCharacter=itemView.findViewById(R.id.imagemarvel);
            nameCharacter=itemView.findViewById(R.id.textname);

        }

        public void binData(MarvelCharacter item) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }

        public void binData2(Comics item2) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClicks(item2);
                }
            });
        }

    }
    private void setAnimation(View viewToAnimate, int position){
        if (position>lastPosition){
            Animation slideIn = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(slideIn);
            lastPosition = position;
        }


    }


}