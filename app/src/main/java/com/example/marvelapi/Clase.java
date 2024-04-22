/*



package com.example.marvelapi;
import java.util.List;

public class Clase {
    private String copyright;
    private long code;
    private Data data;
    private String attributionHTML;
    private String attributionText;
    private String etag;
    private String status;

    public String getCopyright() { return copyright; }
    public void setCopyright(String value) { this.copyright = value; }

    public long getCode() { return code; }
    public void setCode(long value) { this.code = value; }

    public Data getData() { return data; }
    public void setData(Data value) { this.data = value; }

    public String getAttributionHTML() { return attributionHTML; }
    public void setAttributionHTML(String value) { this.attributionHTML = value; }

    public String getAttributionText() { return attributionText; }
    public void setAttributionText(String value) { this.attributionText = value; }

    public String getEtag() { return etag; }
    public void setEtag(String value) { this.etag = value; }

    public String getStatus() { return status; }
    public void setStatus(String value) { this.status = value; }
}

// Data.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

class Data {
    private long total;
    private long offset;
    private long limit;
    private long count;
    private List<Result> results;

    public long getTotal() { return total; }
    public void setTotal(long value) { this.total = value; }

    public long getOffset() { return offset; }
    public void setOffset(long value) { this.offset = value; }

    public long getLimit() { return limit; }
    public void setLimit(long value) { this.limit = value; }

    public long getCount() { return count; }
    public void setCount(long value) { this.count = value; }

    public List<Result> getResults() { return results; }
    public void setResults(List<Result> value) { this.results = value; }
}

// Result.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

class Result {
    private Thumbnail thumbnail;
    private List<URL> urls;
    private Stories stories;
    private Comics series;
    private Comics comics;
    private String name;
    private String description;
    private String modified;
    private long id;
    private String resourceURI;
    private Comics events;

    public Thumbnail getThumbnail() { return thumbnail; }
    public void setThumbnail(Thumbnail value) { this.thumbnail = value; }

    public List<URL> getUrls() { return urls; }
    public void setUrls(List<URL> value) { this.urls = value; }

    public Stories getStories() { return stories; }
    public void setStories(Stories value) { this.stories = value; }

    public Comics getSeries() { return series; }
    public void setSeries(Comics value) { this.series = value; }

    public Comics getComics() { return comics; }
    public void setComics(Comics value) { this.comics = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    public String getModified() { return modified; }
    public void setModified(String value) { this.modified = value; }

    public long getid() { return id; }
    public void setid(long value) { this.id = value; }

    public String getResourceURI() { return resourceURI; }
    public void setResourceURI(String value) { this.resourceURI = value; }

    public Comics getEvents() { return events; }
    public void setEvents(Comics value) { this.events = value; }
}

// Comics.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

class Comics {
    private String collectionURI;
    private long available;
    private long returned;
    private List<ComicsItem> items;

    public String getCollectionURI() { return collectionURI; }
    public void setCollectionURI(String value) { this.collectionURI = value; }

    public long getAvailable() { return available; }
    public void setAvailable(long value) { this.available = value; }

    public long getReturned() { return returned; }
    public void setReturned(long value) { this.returned = value; }

    public List<ComicsItem> getItems() { return items; }
    public void setItems(List<ComicsItem> value) { this.items = value; }
}

// ComicsItem.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

class ComicsItem {
    private String name;
    private String resourceURI;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getResourceURI() { return resourceURI; }
    public void setResourceURI(String value) { this.resourceURI = value; }
}

// Stories.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

class Stories {
    private String collectionURI;
    private long available;
    private long returned;
    private List<StoriesItem> items;

    public String getCollectionURI() { return collectionURI; }
    public void setCollectionURI(String value) { this.collectionURI = value; }

    public long getAvailable() { return available; }
    public void setAvailable(long value) { this.available = value; }

    public long getReturned() { return returned; }
    public void setReturned(long value) { this.returned = value; }

    public List<StoriesItem> getItems() { return items; }
    public void setItems(List<StoriesItem> value) { this.items = value; }
}

// StoriesItem.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

class StoriesItem {
    private String name;
    private String resourceURI;
    private ItemType type;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getResourceURI() { return resourceURI; }
    public void setResourceURI(String value) { this.resourceURI = value; }

    public ItemType getType() { return type; }
    public void setType(ItemType value) { this.type = value; }
}

// ItemType.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation


public enum ItemType {
    COVER, EMPTY, INTERIOR_STORY;

    public String toValue() {
        switch (this) {
            case COVER: return "cover";
            case EMPTY: return "";
            case INTERIOR_STORY: return "interiorStory";
        }
        return null;
    }

    public static ItemType forValue(String value) throws IOException {
        if (value.equals("cover")) return COVER;
        if (value.equals("")) return EMPTY;
        if (value.equals("interiorStory")) return INTERIOR_STORY;
        throw new IOException("Cannot deserialize ItemType");
    }
}

// Thumbnail.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

class Thumbnail {
    private String path;
    private Extension extension;

    public String getPath() { return path; }
    public void setPath(String value) { this.path = value; }

    public Extension getExtension() { return extension; }
    public void setExtension(Extension value) { this.extension = value; }
}

// Extension.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation



public enum Extension {
    GIF, JPG;

    public String toValue() {
        switch (this) {
            case GIF: return "gif";
            case JPG: return "jpg";
        }
        return null;
    }

    public static Extension forValue(String value) throws IOException {
        if (value.equals("gif")) return GIF;
        if (value.equals("jpg")) return JPG;
        throw new IOException("Cannot deserialize Extension");
    }
}

// URL.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

class URL {
    private URLType type;
    private String url;

    public URLType getType() { return type; }
    public void setType(URLType value) { this.type = value; }

    public String geturl() { return url; }
    public void seturl(String value) { this.url = value; }
}

// URLType.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation



public enum URLType {
    COMICLINK, DETAIL, WIKI;

    public String toValue() {
        switch (this) {
            case COMICLINK: return "comiclink";
            case DETAIL: return "detail";
            case WIKI: return "wiki";
        }
        return null;
    }

    public static URLType forValue(String value) throws IOException {
        if (value.equals("comiclink")) return COMICLINK;
        if (value.equals("detail")) return DETAIL;
        if (value.equals("wiki")) return WIKI;
        throw new IOException("Cannot deserialize URLType");
    }
}

*/
