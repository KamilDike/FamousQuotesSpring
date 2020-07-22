package com.example.Security.model;

import javax.persistence.*;

@Entity
@Table(name = "quotes")
public class Quotation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "author")
    private String author;
    @Column(name = "quotation")
    private String quotation;

    public Quotation(String author, String quotation) {
        this.author = author;
        this.quotation = quotation;
    }

    public Quotation() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuotation() {
        return quotation;
    }

    public void setQuotation(String quotation) {
        this.quotation = quotation;
    }

    @Override
    public String toString() {
        return "Quotation{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", quotation='" + quotation + '\'' +
                '}';
    }
}
