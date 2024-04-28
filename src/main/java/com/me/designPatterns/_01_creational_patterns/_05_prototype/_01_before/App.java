package com.me.designPatterns._01_creational_patterns._05_prototype._01_before;

public class App {
    public static void main(String[] args) {

        GithubRepository repository = new GithubRepository();
        repository.setUser("white");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제 : JVM이 무엇이며 자바코드는 어떻게 실행되는것일까? ");

        String url = githubIssue.getUrl();
        System.out.println(url);

//        GithubIssue clone = githubIssue.clone();

        // TODO clone != githubIssue
        // TODO clone.equals(githubIssue) => true
        
    }
}
