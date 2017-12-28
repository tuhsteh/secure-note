package com.tommy.securenote.resources;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class NoteResource implements Serializable {

    private static final long serialVersionUID = -3301312617073041699L;

    @Id
    private String noteId;
    // comes from Mongo

    private String content;
    // do not use strings for storing sensitive data.  switch to Byte-Array later.

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNoteId() {
        return noteId;
    }
}