package designpattern.observer;

/**
 * @author 2018-11-13 14:23
 */
public class ConcreteObserver implements Observer {

    private String userName;
    public ConcreteObserver(String userName){
        this.userName=userName;
    }
    public void update() {
        System.out.println(this.userName+" 接收到信息， 并进行处理！ ");
    }
}
