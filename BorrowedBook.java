package com;

import java.io.Serializable;
import java.time.LocalDate;

class BorrowedBook implements Serializable {
    private static final long serialVersionUID = 1L;

    private Book book;
    private int borrowerId;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public BorrowedBook(Book book, int borrowerId, LocalDate borrowDate, LocalDate returnDate) {
        this.book = book;
        this.borrowerId = borrowerId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(int borrowerId) {
        this.borrowerId = borrowerId;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "BorrowedBook [Book: " + book + ", Borrower ID: " + borrowerId + ", Borrow Date: " + borrowDate +
                ", Return Date: " + returnDate + "]";
    }
}