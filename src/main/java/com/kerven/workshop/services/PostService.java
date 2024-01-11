package com.kerven.workshop.services;

import com.kerven.workshop.domain.Post;
import com.kerven.workshop.repositories.PostRepository;
import com.kerven.workshop.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;


    public Post findById(String id) {
        Optional<Post> post = postRepository.findById(id);
        if (post.isPresent()) {
            return post.get();
        }else {
            throw new ObjectNotFoundException("Objeto não encontrado");
        }

    }


}
