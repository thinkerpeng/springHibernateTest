package com.pwx.dao;

import com.pwx.dao.entity.Book;

import java.util.List;

/**
 * @描述
 * @创建人 pengweixiang
 * @创建时间 2018/12/1 14:22
 */
public interface BookDao
{
    /**
     * 查找所有书籍
     * @return 书籍列表
     */
    public List<Book> findAllBooks();

    /**
     * 通过ID查找
     * @param id bookId
     * @return book
     */
    public Book findBookById(String id);

    /**
     * 插入书籍
     * @param book book
     * @return boolean
     */
    public boolean saveBook(Book book);

    /**
     * 删除书籍
     * @param id id
     * @return boolean
     */
    public boolean deleteBook(String id);

    /**
     * 修改书籍
     * @param book book
     * @param id id
     * @return boolean
     */
    public boolean updateBook(Book book, String id);
}
