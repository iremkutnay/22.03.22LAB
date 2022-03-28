package tr.edu.maltepe.oop;

import java.util.Vector;

class Person {
    private String name;
    private String surname;
    private int id;
    private Vector<Book> vector = new Vector<Book>();

    public Person(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addBook(Book books) {
        getVector().add(books);
    }

    public void removeBook(Library library, Book book)
    {
        library.getV().add(book);
        getVector().remove(book);
    }

    public Vector<Book> getVector() {
        return vector;
    }
}
