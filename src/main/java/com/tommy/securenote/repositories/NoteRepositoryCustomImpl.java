package com.tommy.securenote.repositories;

import com.tommy.securenote.resources.NoteResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class NoteRepositoryCustomImpl implements NoteRepositoryCustom {
    Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

    @Autowired
    private NoteRepository repository;

    @Override
    public NoteResource findByNoteId(String noteId) {
        NoteResource one = repository.findOne(noteId);
        logger.warn(one.toString());
        repository.delete(noteId);
        logger.warn(String.format("Tried to delete %s", one));
        return one;
    }
}
