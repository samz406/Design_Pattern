package designpattern.chain;

/**
 * @author 2018-12-06 13:51
 */
public class Client {
    public static void main(String[] args) {

        Handler handle1=new ConcreteHandler1();
        Handler handler2=new ConcreteHandler2();
        handle1.setNext(handler2);
        Handler handler3=new ConcreteHandler3();
        handler2.setNext(handler3);
        handle1.handleMessage();
    }
}
