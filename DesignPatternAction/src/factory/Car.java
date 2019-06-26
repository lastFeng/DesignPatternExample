package factory;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-24 23:06
 */
public class Car implements Moveable{

    private static Car car = new Car();

    private Car(){}

    @Override
    public void run() {
        System.out.println("Car is running");
    }

    public static Car getInstance(){
        return car;
    }
}
