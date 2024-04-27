package com.me.designPatterns._05_prototype._03_java;

import com.me.designPatterns._05_prototype._02_after.GithubIssue;
import com.me.designPatterns._05_prototype._02_after.GithubRepository;
import org.modelmapper.ModelMapper;

public class ModelMapperExample {
    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("white");
        repository.setName("live");

        GithubIssue githubIssue = new GithubIssue(repository);

        githubIssue.setId(1);
        githubIssue.setTitle("1주차");

        GithubIssueData githubIssueData = new GithubIssueData();
        githubIssueData.setId(githubIssue.getId()); // ...

        // TODO ModelMapper
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(githubIssue, GithubIssueData.class);
        System.out.println(githubIssueData);


    }
}
