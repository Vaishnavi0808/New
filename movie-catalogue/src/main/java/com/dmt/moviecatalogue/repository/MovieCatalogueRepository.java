package com.dmt.moviecatalogue.repository;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dmt.moviecatalogue.model.MovieCatalogue;

@Repository
public interface MovieCatalogueRepository extends MongoRepository<MovieCatalogue, String>{

	Optional<MovieCatalogue> findByMovieTitle(String movieTitle);

}
