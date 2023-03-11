package com.sedmelluq.discord.lavaplayer.source.nico;

public class SessionFormat {
    public SessionFormat(String url, String json){
        this.url = url;
        this.json = json;
    }
    private final String url;
    private String json;

    public void  setJson(String json){
        this.json = json;
    }

    public String getJson() {
        return json;
    }

    public String getUrl() {
        return url;
    }
}
