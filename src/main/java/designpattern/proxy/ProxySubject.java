package designpattern.proxy;

/**
 * @author 2018-11-26 13:19
 * 代理类
 */
public class ProxySubject implements Subject{

    private Subject subject;

    public ProxySubject(Subject subject){
        this.subject=subject;
    }
    public void request() {
        before();
        subject.request();
        after();
    }

    public void before(){
        System.out.println("调用前");
    }
    public void after(){
        System.out.println("调用后");
    }
}
