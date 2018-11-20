package designpattern.facade;

/**
 * @author 2018-11-20 13:32
 */
public class Facade {

    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();
    //提供给外部访问的方法
    public void methodA(){
        this.a.doSomethingA();
    }

    public void methodB(){
        this.b.doSomethingB();
    }
    public void methodC(){
        this.c.doSomethingC();
    }

    /**
     * 三个业务同时调用
      */
    public void methodAll(){
        methodA();
        methodB();
        methodC();

    }

}
