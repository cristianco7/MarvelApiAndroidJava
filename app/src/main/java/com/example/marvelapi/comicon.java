/*
// Comicon.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

package com.example.marvelapi;
import java.util.List;

public class Comicon {
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
    private Creators creators;
    private long issueNumber;
    private Isbn isbn;
    private Description description;
    private List<Series> variants;
    private String title;
    private DiamondCode diamondCode;
    private Characters characters;
    private List<URL> urls;
    private String ean;
    private List<Object> collections;
    private String modified;
    private long id;
    private List<Price> prices;
    private Characters events;
    private List<Series> collectedIssues;
    private long pageCount;
    private Thumbnail thumbnail;
    private List<Thumbnail> images;
    private Stories stories;
    private List<TextObject> textObjects;
    private long digitalId;
    private Format format;
    private String upc;
    private List<Date> dates;
    private String resourceURI;
    private String variantDescription;
    private String issn;
    private Series series;

    public Creators getCreators() { return creators; }
    public void setCreators(Creators value) { this.creators = value; }

    public long getIssueNumber() { return issueNumber; }
    public void setIssueNumber(long value) { this.issueNumber = value; }

    public Isbn getIsbn() { return isbn; }
    public void setIsbn(Isbn value) { this.isbn = value; }

    public Description getDescription() { return description; }
    public void setDescription(Description value) { this.description = value; }

    public List<Series> getVariants() { return variants; }
    public void setVariants(List<Series> value) { this.variants = value; }

    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }

    public DiamondCode getDiamondCode() { return diamondCode; }
    public void setDiamondCode(DiamondCode value) { this.diamondCode = value; }

    public Characters getCharacters() { return characters; }
    public void setCharacters(Characters value) { this.characters = value; }

    public List<URL> getUrls() { return urls; }
    public void setUrls(List<URL> value) { this.urls = value; }

    public String getEan() { return ean; }
    public void setEan(String value) { this.ean = value; }

    public List<Object> getCollections() { return collections; }
    public void setCollections(List<Object> value) { this.collections = value; }

    public String getModified() { return modified; }
    public void setModified(String value) { this.modified = value; }

    public long getid() { return id; }
    public void setid(long value) { this.id = value; }

    public List<Price> getPrices() { return prices; }
    public void setPrices(List<Price> value) { this.prices = value; }

    public Characters getEvents() { return events; }
    public void setEvents(Characters value) { this.events = value; }

    public List<Series> getCollectedIssues() { return collectedIssues; }
    public void setCollectedIssues(List<Series> value) { this.collectedIssues = value; }

    public long getPageCount() { return pageCount; }
    public void setPageCount(long value) { this.pageCount = value; }

    public Thumbnail getThumbnail() { return thumbnail; }
    public void setThumbnail(Thumbnail value) { this.thumbnail = value; }

    public List<Thumbnail> getImages() { return images; }
    public void setImages(List<Thumbnail> value) { this.images = value; }

    public Stories getStories() { return stories; }
    public void setStories(Stories value) { this.stories = value; }

    public List<TextObject> getTextObjects() { return textObjects; }
    public void setTextObjects(List<TextObject> value) { this.textObjects = value; }

    public long getDigitalId() { return digitalId; }
    public void setDigitalId(long value) { this.digitalId = value; }

    public Format getFormat() { return format; }
    public void setFormat(Format value) { this.format = value; }

    public String getUpc() { return upc; }
    public void setUpc(String value) { this.upc = value; }

    public List<Date> getDates() { return dates; }
    public void setDates(List<Date> value) { this.dates = value; }

    public String getResourceURI() { return resourceURI; }
    public void setResourceURI(String value) { this.resourceURI = value; }

    public String getVariantDescription() { return variantDescription; }
    public void setVariantDescription(String value) { this.variantDescription = value; }

    public String getIssn() { return issn; }
    public void setIssn(String value) { this.issn = value; }

    public Series getSeries() { return series; }
    public void setSeries(Series value) { this.series = value; }
}

// Characters.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

class Characters {
    private String collectionURI;
    private long available;
    private long returned;
    private List<Series> items;

    public String getCollectionURI() { return collectionURI; }
    public void setCollectionURI(String value) { this.collectionURI = value; }

    public long getAvailable() { return available; }
    public void setAvailable(long value) { this.available = value; }

    public long getReturned() { return returned; }
    public void setReturned(long value) { this.returned = value; }

    public List<Series> getItems() { return items; }
    public void setItems(List<Series> value) { this.items = value; }
}

// Series.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

class Series {
    private String name;
    private String resourceURI;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getResourceURI() { return resourceURI; }
    public void setResourceURI(String value) { this.resourceURI = value; }
}

// Creators.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

class Creators {
    private String collectionURI;
    private long available;
    private long returned;
    private List<CreatorsItem> items;

    public String getCollectionURI() { return collectionURI; }
    public void setCollectionURI(String value) { this.collectionURI = value; }

    public long getAvailable() { return available; }
    public void setAvailable(long value) { this.available = value; }

    public long getReturned() { return returned; }
    public void setReturned(long value) { this.returned = value; }

    public List<CreatorsItem> getItems() { return items; }
    public void setItems(List<CreatorsItem> value) { this.items = value; }
}

// CreatorsItem.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

class CreatorsItem {
    private Role role;
    private String name;
    private String resourceURI;

    public Role getRole() { return role; }
    public void setRole(Role value) { this.role = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getResourceURI() { return resourceURI; }
    public void setResourceURI(String value) { this.resourceURI = value; }
}

// Role.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

import java.io.IOException;

public enum Role {
    COLORIST, EDITOR, INKER, LETTERER, PENCILER, PENCILLER, PENCILLER_COVER, WRITER;

    public String toValue() {
        switch (this) {
            case COLORIST: return "colorist";
            case EDITOR: return "editor";
            case INKER: return "inker";
            case LETTERER: return "letterer";
            case PENCILER: return "penciler";
            case PENCILLER: return "penciller";
            case PENCILLER_COVER: return "penciller (cover)";
            case WRITER: return "writer";
        }
        return null;
    }

    public static Role forValue(String value) throws IOException {
        if (value.equals("colorist")) return COLORIST;
        if (value.equals("editor")) return EDITOR;
        if (value.equals("inker")) return INKER;
        if (value.equals("letterer")) return LETTERER;
        if (value.equals("penciler")) return PENCILER;
        if (value.equals("penciller")) return PENCILLER;
        if (value.equals("penciller (cover)")) return PENCILLER_COVER;
        if (value.equals("writer")) return WRITER;
        throw new IOException("Cannot deserialize Role");
    }
}

// Date.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

class Date {
    private String date;
    private DateType type;

    public String getDate() { return date; }
    public void setDate(String value) { this.date = value; }

    public DateType getType() { return type; }
    public void setType(DateType value) { this.type = value; }
}

// DateType.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

import java.io.IOException;

public enum DateType {
    DIGITAL_PURCHASE_DATE, FOC_DATE, ONSALE_DATE, UNLIMITED_DATE;

    public String toValue() {
        switch (this) {
            case DIGITAL_PURCHASE_DATE: return "digitalPurchaseDate";
            case FOC_DATE: return "focDate";
            case ONSALE_DATE: return "onsaleDate";
            case UNLIMITED_DATE: return "unlimitedDate";
        }
        return null;
    }

    public static DateType forValue(String value) throws IOException {
        if (value.equals("digitalPurchaseDate")) return DIGITAL_PURCHASE_DATE;
        if (value.equals("focDate")) return FOC_DATE;
        if (value.equals("onsaleDate")) return ONSALE_DATE;
        if (value.equals("unlimitedDate")) return UNLIMITED_DATE;
        throw new IOException("Cannot deserialize DateType");
    }
}

// Description.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

import java.io.IOException;

public enum Description {
    EMPTY, N_A;

    public String toValue() {
        switch (this) {
            case EMPTY: return "";
            case N_A: return "#N/A";
        }
        return null;
    }

    public static Description forValue(String value) throws IOException {
        if (value.equals("")) return EMPTY;
        if (value.equals("#N/A")) return N_A;
        throw new IOException("Cannot deserialize Description");
    }
}

// DiamondCode.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

import java.io.IOException;

public enum DiamondCode {
    EMPTY, JUL190068;

    public String toValue() {
        switch (this) {
            case EMPTY: return "";
            case JUL190068: return "JUL190068";
        }
        return null;
    }

    public static DiamondCode forValue(String value) throws IOException {
        if (value.equals("")) return EMPTY;
        if (value.equals("JUL190068")) return JUL190068;
        throw new IOException("Cannot deserialize DiamondCode");
    }
}

// Format.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

import java.io.IOException;

public enum Format {
    COMIC, DIGEST, EMPTY, TRADE_PAPERBACK;

    public String toValue() {
        switch (this) {
            case COMIC: return "Comic";
            case DIGEST: return "Digest";
            case EMPTY: return "";
            case TRADE_PAPERBACK: return "Trade Paperback";
        }
        return null;
    }

    public static Format forValue(String value) throws IOException {
        if (value.equals("Comic")) return COMIC;
        if (value.equals("Digest")) return DIGEST;
        if (value.equals("")) return EMPTY;
        if (value.equals("Trade Paperback")) return TRADE_PAPERBACK;
        throw new IOException("Cannot deserialize Format");
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

import java.io.IOException;

public enum Extension {
    JPG;

    public String toValue() {
        switch (this) {
            case JPG: return "jpg";
        }
        return null;
    }

    public static Extension forValue(String value) throws IOException {
        if (value.equals("jpg")) return JPG;
        throw new IOException("Cannot deserialize Extension");
    }
}

// Isbn.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

import java.io.IOException;

public enum Isbn {
    EMPTY, THE_0785111298, THE_0785114513, THE_0785115609;

    public String toValue() {
        switch (this) {
            case EMPTY: return "";
            case THE_0785111298: return "0-7851-1129-8";
            case THE_0785114513: return "0-7851-1451-3";
            case THE_0785115609: return "0-7851-1560-9";
        }
        return null;
    }

    public static Isbn forValue(String value) throws IOException {
        if (value.equals("")) return EMPTY;
        if (value.equals("0-7851-1129-8")) return THE_0785111298;
        if (value.equals("0-7851-1451-3")) return THE_0785114513;
        if (value.equals("0-7851-1560-9")) return THE_0785115609;
        throw new IOException("Cannot deserialize Isbn");
    }
}

// Price.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

class Price {
    private double price;
    private PriceType type;

    public double getPrice() { return price; }
    public void setPrice(double value) { this.price = value; }

    public PriceType getType() { return type; }
    public void setType(PriceType value) { this.type = value; }
}

// PriceType.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

import java.io.IOException;

public enum PriceType {
    DIGITAL_PURCHASE_PRICE, PRINT_PRICE;

    public String toValue() {
        switch (this) {
            case DIGITAL_PURCHASE_PRICE: return "digitalPurchasePrice";
            case PRINT_PRICE: return "printPrice";
        }
        return null;
    }

    public static PriceType forValue(String value) throws IOException {
        if (value.equals("digitalPurchasePrice")) return DIGITAL_PURCHASE_PRICE;
        if (value.equals("printPrice")) return PRINT_PRICE;
        throw new IOException("Cannot deserialize PriceType");
    }
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

import java.io.IOException;

public enum ItemType {
    COVER, INTERIOR_STORY, PROMO;

    public String toValue() {
        switch (this) {
            case COVER: return "cover";
            case INTERIOR_STORY: return "interiorStory";
            case PROMO: return "promo";
        }
        return null;
    }

    public static ItemType forValue(String value) throws IOException {
        if (value.equals("cover")) return COVER;
        if (value.equals("interiorStory")) return INTERIOR_STORY;
        if (value.equals("promo")) return PROMO;
        throw new IOException("Cannot deserialize ItemType");
    }
}

// TextObject.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

class TextObject {
    private Language language;
    private String text;
    private TextObjectType type;

    public Language getLanguage() { return language; }
    public void setLanguage(Language value) { this.language = value; }

    public String getText() { return text; }
    public void setText(String value) { this.text = value; }

    public TextObjectType getType() { return type; }
    public void setType(TextObjectType value) { this.type = value; }
}

// Language.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

import java.io.IOException;

public enum Language {
    EN_US;

    public String toValue() {
        switch (this) {
            case EN_US: return "en-us";
        }
        return null;
    }

    public static Language forValue(String value) throws IOException {
        if (value.equals("en-us")) return EN_US;
        throw new IOException("Cannot deserialize Language");
    }
}

// TextObjectType.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

import java.io.IOException;

public enum TextObjectType {
    ISSUE_SOLICIT_TEXT;

    public String toValue() {
        switch (this) {
            case ISSUE_SOLICIT_TEXT: return "issue_solicit_text";
        }
        return null;
    }

    public static TextObjectType forValue(String value) throws IOException {
        if (value.equals("issue_solicit_text")) return ISSUE_SOLICIT_TEXT;
        throw new IOException("Cannot deserialize TextObjectType");
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

import java.io.IOException;

public enum URLType {
    DETAIL, IN_APP_LINK, PURCHASE, READER;

    public String toValue() {
        switch (this) {
            case DETAIL: return "detail";
            case IN_APP_LINK: return "inAppLink";
            case PURCHASE: return "purchase";
            case READER: return "reader";
        }
        return null;
    }

    public static URLType forValue(String value) throws IOException {
        if (value.equals("detail")) return DETAIL;
        if (value.equals("inAppLink")) return IN_APP_LINK;
        if (value.equals("purchase")) return PURCHASE;
        if (value.equals("reader")) return READER;
        throw new IOException("Cannot deserialize URLType");
    }
}
*/
