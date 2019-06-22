package strategy;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-22 16:11
 */
public class CatHeightComparator implements CustomComparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getHeight() > o2.getHeight()){
            return 1;
        }

        if (o1.getHeight() < o2.getHeight()){
            return -1;
        }

        return 0;
    }
}
