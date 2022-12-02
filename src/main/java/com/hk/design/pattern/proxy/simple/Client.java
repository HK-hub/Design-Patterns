package com.hk.design.pattern.proxy.simple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author : HK意境
 * @ClassName : Client
 * @date : 2022/12/2 19:59
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class Client {

    public static void main(String[] args) {

        // 定义一个痴迷游戏的玩家：需要代打的号
        IGamePlayer gamePlayer = new GamePlayer("张三");

        // 游戏代练打手
        /*GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(gamePlayer);
        gamePlayerProxy.login("zhangsan", "zhang");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是：2009-8-26 03:40");*/

        InvocationHandler invocationHandler = new GamePlayIH(gamePlayer);
        IGamePlayer proxyInstance = (IGamePlayer) Proxy.newProxyInstance(GamePlayer.class.getClassLoader(),
                new Class[]{IGamePlayer.class},
                invocationHandler);
        proxyInstance.login("zhangsan", "zhang");
        proxyInstance.killBoss();
        proxyInstance.upgrade();

    }

}
