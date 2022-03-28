package tr.edu.maltepe.oop;

import java.util.Vector;

public class Library
{
    private Vector<Book> v = new Vector<Book>();

    public  Vector<Book> getV()
    {
        return v;
    }

    public void addBook (Book books)
    {
        getV().add(books);
    }

    public void removeBook (Book books1)
    {
        getV().remove(books1);
    }

    public void lendBook (Book books, Person person)
    {
        person.addBook(books);
        getV().remove(books);
    }
}
