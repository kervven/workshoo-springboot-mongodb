package com.kerven.workshop.services;

import com.kerven.workshop.domain.User;
import com.kerven.workshop.dtos.UserDTO;
import com.kerven.workshop.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kerven.workshop.repositories.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UserService{

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(String id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        }else {
            throw new ObjectNotFoundException("Objeto não encontrado");
        }

    }

    public User insert(User obj) {
        return userRepository.insert(obj);
    }
    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }


}
