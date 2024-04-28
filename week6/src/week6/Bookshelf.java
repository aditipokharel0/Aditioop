package week6;

public class Bookshelf {
    public static void main(String[] args) {
        // Creating Book objects
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "HarperCollins", 1960);
        Book book2 = new Book("1984", "George Orwell", "Secker & Warburg", 1949);
        
        // Updating some book details using setter methods
        book1.setPublisher("Penguin Books");
        book2.setAuthor("George Orwell (pen name of Eric Arthur Blair)");
        
        // Displaying information using toString method
        System.out.println("Book 1:\n" + book1 + "\n");
        System.out.println("Book 2:\n" + book2);
    }
}

