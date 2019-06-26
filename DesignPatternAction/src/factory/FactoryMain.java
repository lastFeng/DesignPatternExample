package factory;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-24 23:06
 * 工厂模式的测试类
 */
public class FactoryMain {
    public static void main(String[] args) {
        Moveable moveable = new PlaneFactory().newPlaneInstance();
        moveable.run();
    }
}
