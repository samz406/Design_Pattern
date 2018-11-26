package designpattern.proxy;

/**
 * @author 2018-11-26 13:18
 */
public class RealSubject  implements Subject{


    public void request() {
        System.out.println("实际方法");
    }
}
