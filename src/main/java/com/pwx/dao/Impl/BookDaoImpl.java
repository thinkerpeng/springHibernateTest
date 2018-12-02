package com.pwx.dao.Impl;

import com.pwx.dao.BookDao;
import com.pwx.dao.entity.Book;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @描述
 * @创建人 pengweixiang
 * @创建时间 2018/12/1 14:26
 */
@Component
public class BookDaoImpl extends BaseHibernateDao implements BookDao
{
    @Override
    @Transactional(readOnly = true)
    public List<Book> findAllBooks()
    {
        String sql = "select b from " + Book.class.getName() + " b ";
        Query<Book> query = getSession().createQuery(sql);
        return query.getResultList();
    }

    @Override
    public Book findBookById(String BookId)
    {
        return null;
    }

    @Override
    @Transactional
    public void saveBook(Book book)
    {
        getSession().save(book);
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
