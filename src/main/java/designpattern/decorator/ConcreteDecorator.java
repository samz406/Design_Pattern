package designpattern.decorator;

/**
 * @author 2018-11-18 13:59
 */
public class ConcreteDecorator extends Decorator {
    /**
     * 通过构造函数传递被修饰者
     *
     * @param _component
     */
    public ConcreteDecorator(Component _component) {
        super(_component);
    }

    /**
     * 定义自己的修饰方法
     */
    private void method1(){
        System.out.println("ConcreteDecorator do something");
    }

    /**
     * 重写父类的Operation方法
     */
    public void operate(){
        //自己的方法
        this.method1();
        //被装饰的方法
        super.operate();
    }
}
