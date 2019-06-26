package factory;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-25 21:50
 */
public class CarFactory extends VehicleFactory{
    @Override
    public Moveable newInstance(){
        return Car.getInstance();
    }
}
