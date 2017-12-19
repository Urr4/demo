package de.urr4.demo.entities;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Relationship(type = "LIKES")
    private List<LikedBook> likedBooks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LikedBook> getLikedBooks() {
        return likedBooks;
    }

    public void setLikedBooks(List<LikedBook> likedBooks) {
        this.likedBooks = likedBooks;
    }
}
