package designpattern.observer;

import java.util.Vector;

/**
 * @author 2018-11-13 14:48
 */
public abstract class Subject {

    /**
     * 定义一个观察者数组
     */
    private Vector<Observer> observers = new Vector<Observer>();

    /**
     * 增加一个观察者
     * @param o
     */
    public void addObserver(Observer o){
        this.observers.add(o);
    }

    /**
     * 删除一个观察者
     * @param o
     */
    public void delObserver(Observer o){
        this.observers.remove(o);
    }

    /**
     * 通知所有观察者
     */
    public void notifyObservers(){
        for(Observer o:observers){
            o.update();
        }
    }
}
