package com.abel.problem;

/**
 * Created by yangyibo on 17/11/7.
 * 女人接口，未嫁从父，即嫁从夫，夫死从子。做什么事都要请示
 */
public interface IWomen {
    /**
     * 获得个人状况，是否结婚
     * @return
     */
    public int getType();

    /**
     * 获得个人请示，要干什么，逛街？约会？ 看电影？
     * @return
     */
    public String getRequest();
}
