package karamelev.Classes;

import java.time.Year;
import java.util.Arrays;
import java.util.Scanner;

public class BookOperation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Book[] books = new Book[]{
                new Book(1, "In Search of Lost Time", Author.MARSEL_PROUST, Publisher.AST, 1913, 272, 20, BindingType.SOFT),
                new Book(2, "Ulysses", Author.JAMES_JOYSE, Publisher.ECSMO, 1958, 181, 31, BindingType.HARD),
                new Book(3, "Don Quixote", Author.MIGEL_DE_CERVANTES, Publisher.MIF, 2001, 315, 35, BindingType.HARD),
                new Book(4, "The Great Gatsby", Author.MIGEL_DE_CERVANTES, Publisher.ECSMO, 2021, 524, 35, BindingType.HARD),
                new Book(5, "Moby Dick", Author.HERMAN_MELVILLE, Publisher.ECSMO, 1998, 320, 38, BindingType.HARD),
                new Book(7, "Hamlet", Author.WILLIAM_SHAKESPEARE, Publisher.AST, 1963, 104, 12, BindingType.SOFT),
                new Book(8, "The Odyssey", Author.HOMER, Publisher.ECSMO, 2010, 550, 62, BindingType.HARD),
                new Book(9, "Madame Bovary", Author.GUSTAVE_FLAUBERT, Publisher.MIF, 1998, 314, 31, BindingType.SOFT),
                new Book(10, "The Divine Comedy", Author.DANTE_ALIGHIERI, Publisher.MIF, 1958, 720, 63, BindingType.HARD),
                new Book(11,"War and Peace",Author.LEO_TOLSTOY,Publisher.MIF,1972,1420,95,BindingType.HARD),
                new Book(12,"Anna Karenina",Author.LEO_TOLSTOY,Publisher.MIF,1980,52,34,BindingType.SOFT),
                new Book(13,"King Lear",Author.WILLIAM_SHAKESPEARE,Publisher.AST,2015,32,15,BindingType.SOFT)
        };
        int task = showMenu(scan);
        switch (task) {
            case 1:
                getListOfBookAuthor(scan,books);
                break;
            case 2:
                getListOfBooksOfPublisher(scan, books);
                break;
            case 3:
                getListOfBooksPublishedAfterRequiredYear(scan, books);
                break;
        }
    }

        public static int showMenu (Scanner scan){
            System.out.println(" Print: \n1. List of author's books; \n2. List of books printed by required Publisher; \n3. List of books published after required year");
            int task = scan.nextInt();
            while (task < 1 || task > 3) {
                System.out.println("Incorrect number of task");
                task = scan.nextInt();
            }
            return task;
        }
        public static void getListOfBookAuthor(Scanner scan, Book [] books) {
            System.out.println("please, choose a author");
            Author.printAll();
            int number = scan.nextInt();
            while (number < 1 || number > Author.getLength()) {
                System.out.println("Not valid number. \nPlease enter number between 1 and " + Author.getLength());
                number = scan.nextInt();
            }
            Author author = Author.getAuthorByNumber(number);
            boolean isRequiredBookExist = false;

            for (Book book: books) {
                if (book.getAuthor() == author) {
                    System.out.println(book);
                    isRequiredBookExist = true;
                }
            }

            if (!isRequiredBookExist) {
                System.out.println("Book with author " + author.toString() + " is not found");
            }
        }

        public static void getListOfBooksOfPublisher (Scanner scan, Book [] books) {
            System.out.println("Please, choose a publisher");
            Publisher.printAll();
            int number = scan.nextInt();

            while (number < 1 || number > Publisher.getLength()) {
                System.out.println("Not valid number. \nPlease enter number between 1 and " + Publisher.getLength());
                number = scan.nextInt();
            }

            Publisher publisher = Publisher.getPublisherByNumber(number);
            boolean isRequiredBookExist = false;

            for (Book book: books) {
                if (book.getPublisher() == publisher) {
                    System.out.println(book);
                    isRequiredBookExist = true;
                }
            }

            if (!isRequiredBookExist) {
                System.out.println("Book with publisher " + publisher.toString() + " is not found");
            }

        }

        public static void getListOfBooksPublishedAfterRequiredYear (Scanner scan, Book [] books) {
            System.out.println("Please, enter year: ");
            int year = scan.nextInt();
            while (year < 1800 || year > Year.now().getValue()) {
                System.out.println("Not valid year. \nPlease enter year between 1800 and " + Year.now().getValue());
                year = scan.nextInt();
            }
            boolean isRequiredBookExist = false;
            for (Book book : books) {
                if (book.getPublicationYear() > year) {
                    System.out.println(book);
                    isRequiredBookExist = true;
                }
            }
            if (!isRequiredBookExist) {
                System.out.println("Book published after " + year + "is not found");
            }
        }



}
