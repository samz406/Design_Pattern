package designpattern.adapter;

/**
 * 适配器类
 * @author 2018-12-04 13:58
 */
public class Adapter  extends Adaptee implements Target{

    public void request() {
        super.doSomething();
    }
}
