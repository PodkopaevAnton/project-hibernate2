package ru.javarush.entity;

import jakarta.persistence.*;
import org.glassfish.jaxb.core.v2.TODO;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "film_text",schema = "movie")
public class FilmText {
    @Id
    @Column(name = "film_id")
    private Short id;

    //TODO: @Id
    @OneToOne
    @JoinColumn(name = "film_id")
    private Film film;

    @Column(name = "title")
    private String title;

    @Column(name = "description",columnDefinition = "text")
    private String description;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
