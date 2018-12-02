package com.pwx.service;

import com.pwx.dao.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @描述
 * @创建人 pengweixiang
 * @创建时间 2018/12/2 22:31
 */
@Service
public class BookServiceImpl implements BookService
{
    @Override
    public List<Book> findAllBooks()
    {
        return null;
    }

    @Override
    public Book findBookById(String BookId)
    {
        return null;
    }

    @Override
    public void saveBook(Book book)
    {

    }

    @Override
    public void deleteBook(String BookId)
    {

    }

    @Override
    public void updateBook(Book book)
    {

    }
}
