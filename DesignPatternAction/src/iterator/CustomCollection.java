package iterator;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-22 10:06
 */
public interface CustomCollection {
    /**向容器中增加一个元素*/
    void add(Object object);
    /**返回当前容器的大小*/
    int size();

    /**返回迭代器*/
    CustomIterator iterator();
}
