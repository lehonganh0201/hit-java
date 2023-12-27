package com;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    private static final String BOOKS_FILE = "books.txt";
    private static final String BORROWED_BOOKS_FILE = "borrowedBooks.txt";

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        List<BorrowedBook> borrowedBooks = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(BOOKS_FILE))) {
            books = (List<Book>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(BORROWED_BOOKS_FILE))) {
            borrowedBooks = (List<BorrowedBook>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        Book bookToBorrow = new Book("Introduction to Java", "John Doe", 5);
        int borrowerId = 123;
        LocalDate borrowDate = LocalDate.now();
        LocalDate returnDate = LocalDate.now().plusDays(14);

        if (!returnDate.isBefore(borrowDate)) {
            if (bookToBorrow.getQuantity() > 0) {
                bookToBorrow.setQuantity(bookToBorrow.getQuantity() - 1);
                borrowedBooks.add(new BorrowedBook(bookToBorrow, borrowerId, borrowDate, returnDate));
            } else {
                System.out.println("No available copies of the book.");
            }
        } else {
            System.out.println("Invalid return date. Return date cannot be before borrow date.");
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(BOOKS_FILE))) {
            oos.writeObject(books);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(BORROWED_BOOKS_FILE))) {
            oos.writeObject(borrowedBooks);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("List of books:");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("List of borrowed books:");
        for (BorrowedBook borrowedBook : borrowedBooks) {
            System.out.println(borrowedBook);
        }

        int availableBooks = 0;
        int borrowedBooksCount = 0;
        int returnedBooksCount = 0;

        for (Book book : books) {
            availableBooks += book.getQuantity();
        }

        for (BorrowedBook borrowedBook : borrowedBooks) {
            borrowedBooksCount++;
            if (borrowedBook.getReturnDate() != null) {
                returnedBooksCount++;
            }
        }
        System.out.println("\nLibrary Statistics:");
        System.out.println("Available Books: " + availableBooks);
        System.out.println("Borrowed Books: " + borrowedBooksCount);
        System.out.println("Returned Books: " + returnedBooksCount);
    }
}