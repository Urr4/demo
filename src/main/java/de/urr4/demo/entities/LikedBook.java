package de.urr4.demo.entities;

import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "LIKES")
public class LikedBook {

    @Id
    @GeneratedValue
    private Long id;

    private String how;

    @StartNode
    private User user;

    @EndNode
    private Book book;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHow() {
        return how;
    }

    public void setHow(String how) {
        this.how = how;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
