package designpattern.decorator;

/**
 * @author 2018-11-18 13:55
 */
public class ConcreteComponent extends Component {

    /**
     * 具体实现
     */
    public void operate() {
            System.out.println("ConcreteComponent do Something");
        }
}
