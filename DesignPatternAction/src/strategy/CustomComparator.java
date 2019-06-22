package strategy;

import java.util.Comparator;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-22 16:08
 */
public interface CustomComparator<T> {
    int compare(T o1, T o2);
}
