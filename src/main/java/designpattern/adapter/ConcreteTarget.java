package designpattern.adapter;

/**
 * @author 2018-12-04 13:56
 */
public class ConcreteTarget implements Target {

    public void request() {
        System.out.println("目标对象方法");
    }
}
