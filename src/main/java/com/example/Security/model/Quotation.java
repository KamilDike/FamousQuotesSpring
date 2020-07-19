package com.example.Security.model;

public class Quotation {

    private String author;
    private String quotation;

    public Quotation(String author, String quotation) {
        this.author = author;
        this.quotation = quotation;
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
}
