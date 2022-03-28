package tr.edu.maltepe.oop;

class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("ensar", "gul",123456);
        Student student = new Student("irem", "kutnay", 210704308);

        System.out.println(student.getName()+ " "+ student.getSurname()+" "+student.getId());
        System.out.println(professor.getName()+ " "+ professor.getSurname()+" "+professor.getId());

        Library library = new Library();
        Book book1 = new Book("Intr to Java");
        Book book2 = new Book("C Prog");
        Book book3 = new Book("Opr Sys");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.lendBook(book2,student);
        library.lendBook(book3,professor);

        for(int i = 0; i < library.getV().size(); i++)
        {
            System.out.println(library.getV().get(i).getbName());
        }
        student.removeBook(library, book2);

        for(int i = 0; i < library.getV().size(); i++)
        {
            System.out.println(library.getV().get(i).getbName());
        }
        professor.removeBook(library, book3);

        for(int i = 0; i < library.getV().size(); i++)
        {
            System.out.println(library.getV().get(i).getbName());
        }

        student.stdlends();
        professor.proflends();


    }
}
