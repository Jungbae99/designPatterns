package com.me.designPatterns._05_prototype._01_before;

public class GithubIssue {

    private int id;

    private String title;

    private GithubRepository repository;

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public GithubIssue(GithubRepository repository) {
        this.repository = repository;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }
}
