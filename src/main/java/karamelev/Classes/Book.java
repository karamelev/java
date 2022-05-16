package karamelev.Classes;

import java.time.Year;

public class Book {
    private  int id;
    private String title;
    private Author author;
    private Publisher publisher;
    private int publicationYear;
    private int pages;
    private double price;
    private BindingType bindingType;

    public Book (int id, String title, Author author, Publisher publisher, int publicationYear, int pages, double price,
                 BindingType typeBind) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.pages = pages;
        this.price = price;
        this.bindingType = typeBind;
    }

    public Book(int id, Author author,  Publisher publisher, int pubYear, int pages, int price, BindingType soft) {
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = pubYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("Incorrect id");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != "") {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Incorrect title");
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (id > 0) {
            this.pages = pages;
        } else {
            throw new IllegalArgumentException("Incorrect number of pages");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (id > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Incorrect price");
        }
    }

    public BindingType getBindingType() {
        return bindingType;
    }

    public void setBindingType(BindingType bindingType) {
        this.bindingType = bindingType;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        if (publicationYear > 1800 && publicationYear <= Year.now().getValue()) {
            this.publicationYear = publicationYear;
        } else {
            throw new IllegalArgumentException("Incorrect year");
        }
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {this.author = author;}

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }


    @Override
    public String toString() {
        return author + ", \'" + title + "\' (" + publicationYear + "), " + publisher + ", " + pages + " pg., $ " +
                + price + ", " + bindingType.toString().toLowerCase() + " binding;";
    }
}


