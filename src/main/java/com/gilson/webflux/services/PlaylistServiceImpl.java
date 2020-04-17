package com.gilson.webflux.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gilson.webflux.document.Playlist;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlaylistServiceImpl implements PlaylistService{

	@Autowired
	PlaylistService pr;
	
	@Override
	public Flux<Playlist> findAll() {
		return this.pr.findAll();
	}

	@Override
	public Mono<Playlist> findById(String id) {
		return this.pr.findById(id);
	}

	@Override
	public Mono<Playlist> save(Playlist playlist) {
		return this.pr.save(playlist);
	}

}