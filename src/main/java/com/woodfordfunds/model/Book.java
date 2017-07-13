package com.woodfordfunds.model;

/**
 * Model class for the book details.
 */
public class Book {

    private String isbn;
    private String title;
    private String author;
    private String publication;
    private Integer yearOfPublication;
    private Integer numberOfPages;
    private String image;

    public Book(String isbn,
                String title,
                String author,
                String publication,
                Integer yearOfPublication,
                Integer numberOfPages,
                String image){

        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publication = publication;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.image = image;

    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {return author;}

    public String getPublication() {
        return publication;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public String getImage() {
        return image;
    }
}
