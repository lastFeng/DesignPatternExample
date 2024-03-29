package proxy;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-22 17:58
 *
 * 动态代理运行类
 *  动态代理说明：（个人理解）
 *      类封装了相应的方法，而我们需要在方法执行前后，添加自己想要的逻辑
 *      一般情况下，我们是去修改源码类的方法，在其中添加想要的逻辑
 *      但是如果你是处于不能修改该类源码的时候，要增加方法逻辑
 *      此时，就需要使用动态代理，(最佳方法)
 *          自定义自己的动态代理类，来操作需要增加逻辑的方法，在其运行前后，增加所需操作。
 *
 *      其余方法：1. 继承该类，（is-a）调用父类的方法来增加逻辑(TankChild)
 *              2. 实现接口，（has-a）使用类，自定义方法，来调用类的方法，并增加逻辑（TankTimeProxy）
 *                  聚合（实现同一个接口）要比继承效果好
 *
 *      解释：因为一旦要处理相同逻辑的方法过多的话，上述两种方法需要不断重复写相同代码来执行，
 *           而使用动态代理就能轻易修改，不需要重复书写相同逻辑代码
 *
 *  这里的例子就是：
 *      需要计算Tank类中的move方法运行的时间，那么，就可以自定义动态代理来实现
 */
public class ProxyMain {
    public static void main(String[] args) {

    }
}
