package designpattern.proxy;

/**
 * @author 2018-11-26 13:22
 */
public class Client {

    public static void main(String[] args) {

        Subject subject=new RealSubject();
        //实际方法
        subject.request();
        ProxySubject proxySubject=new ProxySubject(subject);
        //代理方法
        proxySubject.request();

    }
}
