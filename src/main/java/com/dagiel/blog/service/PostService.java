package com.dagiel.blog.service;

import com.dagiel.blog.entities.Post;
import com.dagiel.blog.entities.User;
import com.dagiel.blog.repositories.PostRepository;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    public PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public void insert(Post post) {
        postRepository.save(post);
    }

    public List<Post> findUser(User user) {
        return postRepository.findByCreatorId(user.getId());
    }
}
