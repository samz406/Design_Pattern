package designpattern.mediator;

/**
 *
 *
 * 每一个同事角色都知道中介者角色， 而且与其他的同事角色通信的时候， 一定要通过中
 介者角色协作。 每个同事类的行为分为两种： 一种是同事本身的行为， 比如改变对象本身的
 状态， 处理自己的行为等， 这种行为叫做自发行为（Self-Method） ， 与其他的同事类或中介
 者没有任何的依赖； 第二种是必须依赖中介者才能完成的行为， 叫做依赖方法（DepMethod）

 * @author 2018-11-15 14:33
 */
public abstract class Colleague {

    private Mediator mediator;

    public Colleague(Mediator _mediator) {
        this.mediator = _mediator;
    }
}
