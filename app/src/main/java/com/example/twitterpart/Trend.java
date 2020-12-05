package com.example.twitterpart;

public class Trend {

    private String name;
    private String url;
    private String query;


    public Trend(String name, String url, String query) {
        this.name = name;
        this.url = url;
        this.query = query;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}