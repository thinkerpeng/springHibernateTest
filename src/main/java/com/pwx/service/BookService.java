package com.pwx.service;

import com.pwx.dao.entity.Book;

import java.util.List;

/**
 * @描述
 * @创建人 pengweixiang
 * @创建时间 2018/12/1 14:32
 */
public interface BookService
{
    /**
     * 查找所有书籍
     * @return 书籍列表
     */
    public List<Book> findAllBooks();

    /**
     * 通过书籍ID查找
     * @param BookId BookId
     * @return book
     */
    public Book findBookById(String BookId);

    /**
     * 插入书籍
     * @param book book
     */
    public void saveBook(Book book);

    /**
     * 删除书籍
     * @param BookId bookId
     */
    public void deleteBook(String BookId);

    /**
     * 修改书籍
     * @param book book
     */
    public void updateBook(Book book);
}
