package designpattern.observer;

/**
 * @author 2018-11-13 16:45
 */
public class Client {

    public static void main(String[] args) {
        //观察者1
        ConcreteObserver concreteObserver=new ConcreteObserver("zhagnsan");
        //观察者2
        ConcreteObserver concreteObserver1=new ConcreteObserver("lishi");
        //被观察者
        ConcreteSubject subject=new ConcreteSubject();
        subject.addObserver(concreteObserver);
        subject.addObserver(concreteObserver1);
        //触发事件
        subject.change();
    }
}
