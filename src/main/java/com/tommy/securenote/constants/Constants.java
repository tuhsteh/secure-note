package com.tommy.securenote.constants;

public class Constants {

    private Constants() {
        // restrict instansiation
    }

    // MISC
    public static final String APPNAME = "secure-note";

    // URL MAPPINGS
    public static final String INDEX = "/";
    public static final String FETCH_NOTE = "/fetch";
    public static final String CREATE_NOTE = "/create";

    // PARAMS
    public static final String NOTE_ID = "id";

    // CONTROLLER MEDIA TYPES
    public static final String CONTROLLER_MEDIA_TYPE_TEXT = "text/html";
    public static final String CONTROLLER_MEDIA_TYPE_JSON = "application/json";

}