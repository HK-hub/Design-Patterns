package com.hk.design.pattern.proxy.simple;

/**
 * @author : HK意境
 * @ClassName : IGamePlayer
 * @date : 2022/12/2 19:53
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public interface IGamePlayer {

    // 登录游戏
    public void login(String username, String password);

    // 打怪
    public void killBoss();

    // 升级
    public void upgrade();


}
