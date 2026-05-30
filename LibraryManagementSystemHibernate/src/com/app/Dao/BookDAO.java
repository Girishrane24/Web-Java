package com.app.Dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entity.Book;

public class BookDAO {

    public void saveBook(Book book) {

        Session session =
                Hibernate.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.persist(book);

        tx.commit();
        session.close();
    }

    public List<Book> getAllBooks() {

        Session session =
                Hibernate.getSessionFactory().openSession();

        List<Book> books =
                session.createQuery("from Book", Book.class)
                .list();

        session.close();

        return books;
    }
}