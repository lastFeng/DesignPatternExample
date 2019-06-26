package proxy;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-22 18:18
 * 继承Tank类，重写move方法来增加逻辑
 */
public class TankChild extends Tank {
    /**
     * 重写move方法，调用父类move方法，并在前后添加相应逻辑
     * */
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        super.move();
        long end = System.currentTimeMillis();
        System.out.println("timed: " + (end - start));
    }
}
