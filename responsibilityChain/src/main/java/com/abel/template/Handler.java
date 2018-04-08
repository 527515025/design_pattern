package com.abel.template;

public abstract class Handler {
    private Handler nextHandler;

    /**
     * 处理逻辑
     * @param request
     * @return
     */
    public final Response handleMessage(Request request) {
        Response response = null;
        //判断是否是自己的处理级别
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else {
            //判断是否有下个处理者
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {
                //没有处理者，逻辑自行处理
            }

        }
        return response;
    }

    /**
     * 设置下个处理者
     * @param _handler
     */
    public void setNext(Handler _handler) {
        this.nextHandler = _handler;
    }

    /**
     * 获取处理者的级别
     * @return
     */
    protected abstract Level getHandlerLevel(); //

    /**
     * 每个处理者都必须实现的处理任务
     * @param request
     * @return
     */
    protected abstract Response echo(Request request);
}
