package designpattern.decorator;

/**
 * @author 2018-11-18 14:01
 */
public class Client {

    public static void main(String[] args) {

        ConcreteComponent concreteComponent=new ConcreteComponent();
        Decorator decorator=new ConcreteDecorator(concreteComponent);
        //对concreteComponent的operate方法添加额外功能
        decorator.operate();

    }
}
