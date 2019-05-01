package com.example.demo.reposiroty;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.resources.UsuarioTwitter;

@Repository
public interface UserRepository extends MongoRepository<UsuarioTwitter, String> {

}
