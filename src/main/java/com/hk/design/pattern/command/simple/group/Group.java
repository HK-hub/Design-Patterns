package com.hk.design.pattern.command.simple.group;

/**
 * @author : HK意境
 * @ClassName : Group
 * @date : 2022/12/11 17:48
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class Group {

    /**
     * 甲乙双方分开办公，如果你要和某个组讨论，你首先要找到这个组
     */
    public abstract void find();


    /**
     * 被要求增加功能
     */
    public abstract void add();

    /**
     * 被要求删除功能
     */
    public abstract void delete();

    /**
     * 被要求修改功能
     */
    public abstract void change();

    /**
     * 被要求给出所有的变更计划
     */
    public abstract void plan();


}
