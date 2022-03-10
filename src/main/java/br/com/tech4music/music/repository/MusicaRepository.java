package br.com.tech4music.music.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4music.music.model.Musica;

public interface MusicaRepository extends MongoRepository<Musica, String>{
    
}
