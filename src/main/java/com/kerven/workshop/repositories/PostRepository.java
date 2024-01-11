package com.kerven.workshop.repositories;

import com.kerven.workshop.domain.Post;
import com.kerven.workshop.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    List<Post> findByTitleContainingIgonoreCase(String text);
}
