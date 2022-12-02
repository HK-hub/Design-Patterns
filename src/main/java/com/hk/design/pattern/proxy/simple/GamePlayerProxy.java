package com.hk.design.pattern.proxy.simple;

/**
 * @author : HK意境
 * @ClassName : GamePlayerProxy
 * @date : 2022/12/2 20:02
 * @description : 游戏代练机构
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class GamePlayerProxy implements IGamePlayer{

    // 代练的号
    private IGamePlayer player;

    // 通过构造函数，传递要对谁进行代练：把号给打手，然打手上号代打
    public GamePlayerProxy(IGamePlayer player) {
        this.player = player;
    }


    // 代练上号
    @Override
    public void login(String username, String password) {
        this.player.login(username, password);
    }


    // 代练打怪
    @Override
    public void killBoss() {
        this.player.killBoss();
    }


    // 代练升级
    @Override
    public void upgrade() {
        this.player.upgrade();
    }
}
