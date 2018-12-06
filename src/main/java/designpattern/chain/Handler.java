package designpattern.chain;

/**
 * @author 2018-12-06 13:34
 */
public abstract class Handler {

    private Handler nextHandler;

    //每个处理者都必须对请求做出处理
    public final void handleMessage() {

        this.echo();
        if (this.nextHandler != null) {
            this.nextHandler.handleMessage();
        }
    }

    //设置下一个处理者是谁
    public void setNext(Handler _handler) {
        this.nextHandler = _handler;
    }

    //每个处理者都必须实现处理任务
    protected abstract void echo();
}
