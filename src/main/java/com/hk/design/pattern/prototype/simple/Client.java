package com.hk.design.pattern.prototype.simple;

import java.util.Random;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/12/3 18:59
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {

    public static final int MAX_COUNT = 10;
    public static final char[] SOURCE = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ012345".toCharArray();
    public static final String[] DOMAIN = new String[]{"@qq.com", "@google.com", "@163.com", "@alibaba.com", "@sin.com"};

    public static void main(String[] args) {

        Random random = new Random();

        //把模板定义出来，这个是从数据库中获得
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");

        int namelen = 9;
        for (int i = 0; i < MAX_COUNT; i++) {
            //以下是每封邮件不同的地方
            Mail clone = (Mail) mail.clone();
            clone.setAppellation(getRandString(5) + " 先生（女士）");
            clone.setReceiver(getRandString(namelen) + Client.DOMAIN[random.nextInt(Client.DOMAIN.length)]);
            // 然后发送邮件
            sendMail(clone);
        }

    }


    //发送邮件
    public static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人： " + mail.getReceiver() + "\t...发送成功！");
    }

    public static String getRandString(int length) {

        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(Client.SOURCE[random.nextInt(Client.SOURCE.length)]);
        }

        //sb.append(Client.DOMAIN[random.nextInt(Client.DOMAIN.length)]);

        return sb.toString();
    }


}
