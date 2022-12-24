package com.hk.design.pattern.memento.simple;

import lombok.Data;

/**
 * @author : HK意境
 * @ClassName : Memento
 * @date : 2022/12/24 20:44
 * @description : 备忘录
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@Data
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }
}
