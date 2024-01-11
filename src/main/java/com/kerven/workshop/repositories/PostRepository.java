package com.kerven.workshop.repositories;

import com.kerven.workshop.domain.Post;
import com.kerven.workshop.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
