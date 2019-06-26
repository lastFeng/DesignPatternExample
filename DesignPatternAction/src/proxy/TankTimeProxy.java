package proxy;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-22 18:15
 * 在坦克的move方法中，增加方法执行时间逻辑
 */
public class TankTimeProxy implements Moveable {

    /**使用Tank类来实现*/
    private Tank tank;

    /**构造函数，传入Tank类*/
    public TankTimeProxy(Tank tank) {
        this.tank = tank;
    }

    /**
     * 重写Moveable接口的方法
     * 调用tank.move()方法，并在方法前后增加逻辑，来实现
     * */
    @Override
    public void move() {
        long start = System.currentTimeMillis();

        // 调用tank.move()方法
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println("timed: " + (end - start));
    }
}
