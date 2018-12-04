package designpattern.adapter;

/**
 * @author 2018-12-04 13:59
 */
public class Client {

    public static void main(String[] args) {
        Target target=new Adapter();
        target.request();
    }
}
