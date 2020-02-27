package com.mastercard;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BorrowerTest {


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkoutBooks() {

        List<Book> book = Arrays.asList(new Book(1000000,"Core Java"),new Book(1000001,"Advanced Java"));
         Assert.assertEquals(3, book.size());

    }

    @Test
    public void returnBooks() {

        List<Book> book = Arrays.asList(new Book(1000000,"Core Java"),new Book(1000001,"Advanced Java"));
        Assert.assertEquals(1000000,book.get(0).getId());

        Assert.assertEquals("Core Java",book.get(0).getTitle());




    }
}