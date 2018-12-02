package com.pwx.dao.Impl;

import com.pwx.dao.BookDao;
import com.pwx.dao.entity.Book;
import org.apache.commons.lang.StringUtils;
import org.hibernate.Hibernate;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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
        List<Book> books = null;
        try
        {
            String hql = "from " + Book.class.getName() + " b ";
            Query<Book> query = getSession().createQuery(hql);
            books =  query.getResultList();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }

        return books;
    }

    @Override
    @Transactional(readOnly = true)
    public Book findBookById(String id)
    {
        Book book = null;
        try
        {
            String hql = "from " + Book.class.getName() + " b where b.id = :id";
            return  (Book)getSession().createQuery(hql).setParameter("id", id).getSingleResult();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    @Transactional
    public boolean saveBook(Book book)
    {
        try
        {
            getSession().save(book);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    @Transactional
    public boolean deleteBook(String id)
    {
        try
        {
            String hql = "delete " + Book.class.getName() + " b where b.id = :id";
            getSession().createQuery(hql).setParameter("id", id).executeUpdate();

            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    @Transactional
    public boolean updateBook(Book book, String id)
    {
        if (book == null)
        {
            return false;
        }

        try
        {
            StringBuilder hql = new StringBuilder("update " + Book.class.getName() + " b set ");
            if (StringUtils.isNotEmpty(book.getBookName()))
            {
                hql.append("b.bookName = :bookName, ");
            }
            if (StringUtils.isNotEmpty(book.getBookId()))
            {
                hql.append("b.bookId = :bookId, ");
            }
            if (book.getPrice() != null)
            {
                hql.append("b.prise = :prise ");
            }
            if (hql.toString().endsWith(", "))
            {
                hql.delete(hql.length()-2, hql.length());
            }
            hql.append(" where b.id = :id");

            System.out.println(hql.toString());
            Query<Book> query = getSession().createQuery(hql.toString());
            if (StringUtils.isNotEmpty(book.getBookName()))
            {
                query.setParameter("bookName", book.getBookName());
            }
            if (StringUtils.isNotEmpty(book.getBookId()))
            {
                query.setParameter("bookId", book.getBookId());
            }
            if (book.getPrice() != null)
            {
                query.setParameter("prise", book.getPrice());
            }
            query.setParameter("id", id);

            query.executeUpdate();
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
