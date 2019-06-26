package proxy;

import java.util.Random;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-22 17:58
 * 坦克类
 */
public class Tank implements Moveable {
    /**
     * 实现接口方法
     * 坦克移动动作
     * 仅仅是打印，并让其随机睡眠一段时间
     * */
    @Override
    public void move() {
//        long start = System.currentTimeMillis();
        System.out.println("Tank moving...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        long end = System.currentTimeMillis();
//        System.out.println("time: " + (end - start) + "ms");
    }
}
