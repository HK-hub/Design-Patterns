package com.hk.design.principle.ocp;

/**
 * @author : HK意境
 * @ClassName : OffNovelBook
 * @date : 2022/11/27 15:52
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class OffNovelBook extends NovelBook {
    public OffNovelBook(String name, Integer price, String author) {
        super(name, price, author);
    }

    @Override
    public Integer getPrice() {

        Integer selfPrice = super.getPrice();
        Integer offPrice = 0;

        if (selfPrice > 4000) {
            offPrice = selfPrice * 90 / 100;
        } else {
            offPrice = selfPrice * 80 / 100;
        }

        return offPrice;
    }
}
