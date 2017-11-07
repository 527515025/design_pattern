package com.abel.mode;

/**
 * Created by yangyibo on 17/11/7.
 */
public class Women implements IWomen {
    private Integer type = 0;
    private String request = "";

    public Women(Integer type, String request) {
        this.type = type;
        this.request = request;
    }

    /**
     *  获取女人的个人情况
     *
     * @return 1 未婚 2 出嫁 3 守寡
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
