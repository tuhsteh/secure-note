package com.tommy.securenote.repositories;

import com.tommy.securenote.resources.NoteResource;
import org.springframework.data.repository.query.Param;

public interface NoteRepositoryCustom {

    NoteResource findByNoteId(@Param("noteId") String noteId);

}
