package com.abel.domain;

/**
 * 定义电梯状态抽象即方法
 *
 * @author yyb
 * @time 2020/11/15
 */
public abstract class LiftState {
    /**
     * 定义环境角色，状态的变化引起功能变化
     */
    protected Context context;

    public void setContext(Context _context) {
        this.context = _context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}
