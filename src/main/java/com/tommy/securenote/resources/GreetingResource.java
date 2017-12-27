package com.tommy.securenote.resources;

import java.io.Serializable;

public class GreetingResource implements Serializable {

    private static final long serialVersionUID = -1695725095318448964L;
    private final long id;
    private final String content;

    public GreetingResource(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GreetingResource that = (GreetingResource) o;

        if (getId() != that.getId()) return false;
        return getContent() != null ? getContent().equals(that.getContent()) : that.getContent() == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + (getContent() != null ? getContent().hashCode() : 0);
        return result;
    }
}
