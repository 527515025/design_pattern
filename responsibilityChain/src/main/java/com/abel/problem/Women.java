package com.abel.problem;

/**
 * Created by yangyibo on 17/11/7.
 */
public class Women implements IWomen {
    private Integer type = 0;
    private String request ;

    public Women(Integer type, String request) {
        this.type = type;
        this.request = request;
    }

    /**
     *  获取女人的个人情况
     *
     * @return 用数字代表女性的不同状态：0 未婚 1 出嫁 2 守寡
     */
    public int getType() {
        return this.type;
    }

    /**
     * 获取请求
     * @return
     */
    public String getRequest() {
        return this.request;
    }
}
