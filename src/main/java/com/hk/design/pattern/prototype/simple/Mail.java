package com.hk.design.pattern.prototype.simple;

import lombok.Getter;
import lombok.Setter;

/**
 * @author : HK意境
 * @ClassName : Mail
 * @date : 2022/12/3 19:02
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@Getter
@Setter
public class Mail implements Cloneable{

    private String receiver;

    private String subject;

    private String appellation;

    private String context;

    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.subject = advTemplate.getAdvSubject();
        this.context = advTemplate.getAdvContext();
    }

    @Override
    protected Object clone(){

        Mail mail = null;

        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return mail;
    }
}



