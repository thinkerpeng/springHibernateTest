package com.pwx.dao.entity;

import javafx.scene.layout.ColumnConstraints;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @描述
 * @创建人 pengweixiang
 * @创建时间 2018/12/1 14:20
 */
@Entity
@Table(name="tbl_book", uniqueConstraints = {@UniqueConstraint(columnNames={"bookId"})})
public class Book
{
    private String id;
    private String bookName;
    private String bookId;
    private Double price;

    public Book()
    {
    }

    public Book(String bookName, String bookId, double price)
    {
        this.bookName = bookName;
        this.bookId = bookId;
        this.price = price;
    }

    @Id
    @Column(name = "id", nullable = false, updatable = false, length = 32)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    @Column(name = "bookName", nullable = false, length = 1024)
    public String getBookName()
    {
        return bookName;
    }

    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }

    @Column(name = "bookId", nullable = false, length = 32)
    public String getBookId()
    {
        return bookId;
    }

    public void setBookId(String bookId)
    {
        this.bookId = bookId;
    }

    @Column(name = "price", precision = 4, scale = 2)
    public Double getPrice()
    {
        return price;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Book{" + "id='" + id + '\'' + ", bookName='" + bookName + '\'' + ", bookId='" + bookId + '\'' + ", price=" + price + '}';
    }
}
