package com.mastercard;


import java.util.List;

public class Borrower {

    private BorrowerRespository borrowerRespository;
    private long id;

    public Borrower(long id) {
        this.borrowerRespository = new BorrowerRespository();
        this.id = id;
    }

    public void checkoutBooks(List<Book> books) {
        for (Book book : books) {
            checkoutBook(book);
        }
    }

    public void returnBooks(List<Book>books) {
        for (Book book : books) {
            returnBook(book);
        }
    }

    private void checkoutBook(Book book) {
        try {
            borrowerRespository.open();
            borrowerRespository.checkoutBook(id, book);
        } catch (Exception e) {
            throw new RuntimeException("Borrower: " + this.id +
                    " cannot checkoutBook book: " + book.getTitle());
        } finally {
            borrowerRespository.close(); // Code Improvement -  The close method should be part of finally
        }

    }

    private void returnBook(Book book){
            try {
                borrowerRespository.open();
                borrowerRespository.returnBook(id, book);
            } catch (Exception e) {
                throw new RuntimeException("Borrower: " + this.id +
                        " cannot return book: " + book.getTitle());
            }
            borrowerRespository.close();
    }


}

