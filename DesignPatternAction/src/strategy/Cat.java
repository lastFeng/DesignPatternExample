package strategy;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-22 15:50
 */
public class Cat implements CustomComparable<Cat> {
    /**可比较的身高*/
    private int height;

    /**可比较的体重*/
    private int weight;

    public Cat() {
    }

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    /**
     * 与自身相比较，如果不是Cat类，则不进行比较
     * */
    @Override
    public int compareTo(Cat cat) {

        if (this.getHeight() > cat.getHeight()){
            return 1;
        }
        if (this.getHeight() < cat.getHeight()){
            return -1;
        }
        return 0;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
