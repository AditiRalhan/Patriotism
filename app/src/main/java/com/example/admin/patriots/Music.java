package com.example.admin.patriots;

public class Music
{
    private String SongsName;
    private String Singer;
    private String Uri;

    public Music()
    {

    }

    public Music(String SongsName, String Singer, String Uri) {
        this.SongsName = SongsName;
        this.Singer = Singer;
        this.Uri =Uri;
    }

    public String getSongsName() {
        return SongsName;
    }

    public void setSongsName(String songsName) {
        SongsName = songsName;
    }

    public String getSinger() {
        return Singer;
    }

    public void setSinger(String singer) {
        Singer = singer;
    }

    public String getUri() {
        return Uri;
    }

    public void setUri(String uri) {
        Uri = uri;
    }


}
