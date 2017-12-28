package com.tommy.securenote.repositories;

import com.tommy.securenote.resources.NoteResource;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "note", path = "note")
public interface NoteRepository extends MongoRepository<NoteResource, String>, NoteRepositoryCustom {
    
}
