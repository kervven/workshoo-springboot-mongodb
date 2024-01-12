package com.kerven.workshop.services;

import com.kerven.workshop.domain.Post;
import com.kerven.workshop.repositories.PostRepository;
import com.kerven.workshop.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
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

    public List<Post> findByTitle(String text){
        return postRepository.searchTitle(text);
    }

    public List<Post> fullSearch(String text, Date minDate, Date maxDate){
        maxDate = new Date(maxDate.getTime() + (24*60*60*1000));

        return postRepository.fullSearch(text, minDate, maxDate);
    }

}
