package factory;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-25 21:56
 */
public class Factory {
    public Moveable newInstance(String name) {
        if (name.equalsIgnoreCase("car")) {
            return new CarFactory().newInstance();
        }

        if (name.equalsIgnoreCase("plane")) {
            return new PlaneFactory().newInstance();
        }

        return null;
    }
}
