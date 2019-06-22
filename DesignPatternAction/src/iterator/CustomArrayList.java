package iterator;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-21 23:13
 * 使用数组来模拟ArrayList容器
 */
public class CustomArrayList implements CustomCollection{
    /**数组列表*/
    private Object[] objects = new Object[10];

    private int count = 0;

    /**
     * 向数组中添加元素
     * @param obj 需要添加的对象
     * */
    @Override
    public void add(Object obj){
        // 如果超过了，扩容
        if (count == objects.length){
            Object[] newObjects = new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        // 如果没有超过初始化容器大小，增加
        objects[count++] = obj;
    }

    /**
     * 返回容器的长度
     * @return length of ArrayList
     * */
    @Override
    public int size(){
        return count;
    }

    @Override
    public CustomIterator iterator(){
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements CustomIterator{
        /**当前访问的位置*/
        private int index = 0;
        /**
         * 返回下一个对象
         * */
        @Override
        public Object next() {
            return objects[index++];
        }

        /**
         * 判断是否还有下一个对象
         * @return 如有返回true，如果没有，返回false
         * */
        @Override
        public boolean hasNext() {
            return index < count;
        }
    }
}
