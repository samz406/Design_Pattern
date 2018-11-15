package designpattern.observer;

/**
 * 具体被观察者
 * @author 2018-11-13 16:43
 */
public class ConcreteSubject extends Subject {

    public  void change(){
        super.notifyObservers();
    }
}
