package designpattern.mediator;

/**
 * 中介者模式中的抽象都比较简单， 是为了建立这个中介而服务的
 *
 * @author 2018-11-15 14:37
 */
public class ConcreteMediator extends Mediator {

    /**
     * 中介者方法
     */
    public void doSomething1() {
        //调用同事类的方法，
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }

    /**
     * 中介者方法
     */
    public void doSomething2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}
