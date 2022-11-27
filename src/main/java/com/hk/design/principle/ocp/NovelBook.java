package com.hk.design.principle.ocp;

/**
 * @author : HK意境
 * @ClassName : NovelBook
 * @date : 2022/11/27 15:44
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class NovelBook implements IBook{

    private String name;
    private String author;
    private Integer price;

    public NovelBook(String name, Integer price, String author) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getPrice() {
        return this.price;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }
}
