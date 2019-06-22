package iterator;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-22 10:14
 */
public interface CustomIterator {
    /**迭代器的下一个值*/
    Object next();
    /**迭代器是否还有下一个值*/
    boolean hasNext();
}
