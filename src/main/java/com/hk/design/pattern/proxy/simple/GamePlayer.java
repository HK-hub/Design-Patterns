package com.hk.design.pattern.proxy.simple;

/**
 * @author : HK意境
 * @ClassName : GamePlayer
 * @date : 2022/12/2 19:54
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class GamePlayer implements IGamePlayer{

    private final String username;

    public GamePlayer(String name) {
        this.username = name;
    }


    @Override
    public void login(String username, String password) {
        System.out.println("登录名为：" + username + "的用户" +this.username + "登录成功");
    }

    @Override
    public void killBoss() {
        System.out.println(this.username + "在打怪");
    }

    @Override
    public void upgrade() {
        System.out.println(this.username + "升级了");
    }
}
