package cz.uhk.fim.spring.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RSSSource {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String source;

    public RSSSource() {
    }

    public RSSSource(String name, String source) {
        this.name = name;
        this.source = source;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
