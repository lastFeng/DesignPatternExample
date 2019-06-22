package strategy;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-22 15:48
 * 自定义比较接口，自己比较自己
 */
public interface CustomComparable<T> {
    int compareTo(T t);
}
