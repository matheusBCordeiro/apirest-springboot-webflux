package com.apirest.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.apirest.webfluxdocument.Playlist;

public interface PlaylistRepository  extends ReactiveMongoRepository<Playlist, String>{
	
}
