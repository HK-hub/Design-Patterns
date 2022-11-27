package com.hk.design.principle.ocp;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : HK意境
 * @ClassName : BookStore
 * @date : 2022/11/27 15:44
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class BookStore {

    public static final List<IBook> bookList = new ArrayList<IBook>();


    static {
        bookList.add(new NovelBook("天龙八部", 3200, "金庸"));
        bookList.add(new NovelBook("巴黎圣母院", 5600, "雨果"));
        bookList.add(new NovelBook("悲惨世界", 3500, "雨果"));
        bookList.add(new NovelBook("金瓶梅", 4300, "兰陵笑笑生"));
        bookList.add(new OffNovelBook("天龙八部",3200,"金庸"));
        bookList.add(new OffNovelBook("巴黎圣母院",5600,"雨果"));
        bookList.add(new OffNovelBook("悲惨世界",3500,"雨果"));
        bookList.add(new OffNovelBook("金瓶梅",4300,"兰陵笑笑生"));
    }

    //模拟书店买书
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        formatter.setMaximumFractionDigits(2);
        System.out.println("-----------书店卖出去的书籍记录如下：-----------");
        for (IBook book : bookList) {
            System.out.println("书籍名称：" + book.getName() + "\t书籍作者：" +
                    book.getAuthor() + "\t书籍价格：" + formatter.format(book.getPrice() / 100.0) + "元");
        }
    }
}
