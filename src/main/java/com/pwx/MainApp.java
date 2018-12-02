package com.pwx;

import com.pwx.dao.BookDao;
import com.pwx.dao.entity.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
            bookDao.saveBook(new Book("Spring实战", "001", 89.00));
        }
    }
}
