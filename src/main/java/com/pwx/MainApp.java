package com.pwx;

import com.pwx.dao.BookDao;
import com.pwx.dao.entity.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @描述 入口函数
 * @创建人 pengweixiang
 * @创建时间 2018/12/1 14:02
 */
public class MainApp
{
    public static void main(String[] args)
    {
        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        BookDao bookDao = (BookDao) appContext.getBean("bookDaoImpl");
        if (bookDao == null)
        {
            System.out.println("bookDao is null");
            return;
        }
        else
        {
//            bookDao.saveBook(new Book("JAVA并发编程的艺术", "003", 59.00));
        }

//        List<Book> books = bookDao.findAllBooks();
//        books.forEach(book -> {
//            System.out.println("Book id : " + book.getBookId() + ", Book name : " + book.getBookName() + " book prise : " + book.getPrice());
//        });
//        Book book = bookDao.findBookById("40288189676dbfcb01676dbfcfda0000");
//        System.out.println(book.toString());
//
//        Book bookUpdate = new Book();
//        bookUpdate.setBookName("Spring实战(第4版)");
//        bookUpdate.setBookId(book.getBookId());
//        System.out.println("update book : " + bookDao.updateBook(bookUpdate, book.getId()));

//        bookDao.deleteBook("40288189676f488d01676f4892e30000");
    }
}
