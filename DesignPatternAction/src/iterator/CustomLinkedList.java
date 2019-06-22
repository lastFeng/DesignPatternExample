package iterator;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-22 09:49
 * 链表容器
 */
public class CustomLinkedList implements CustomCollection {

    /**头结点，指向链表头部*/
    private Node head = null;
    /**尾节点，指向链表最后一个节点，不对外开放， tail始终指向null节点*/
    private Node tail = null;

    /**链表长度*/
    private int count = 0;

    /**
     * 向链表中增加一个元素
     * @param object 需要增加的元素
     * */
    @Override
    public void add(Object object){
        // 构造节点
        Node n = new Node(object, null);

        // 头结点为空，那么为头结点赋值，同时赋值尾节点
        if (head == null){
            head = n;
            // 注意这里也同时要赋值tail，不然会使得有问题
            tail = n;
        }
        // 如果头节点不为空，将其加入到尾节点中，尾节点指向当前元素
        tail.setNext(n);
        tail = n;
        ++count;
    }

    /**
     * 当前容器大小
     * @return length
     * */
    @Override
    public int size(){
        return count;
    }

    @Override
    public CustomIterator iterator() {
        return new CustomLinkedListIterator();
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    private class CustomLinkedListIterator implements CustomIterator{
        // 为什么是null？
        private Node currentHead = head;

        @Override
        public Object next() {
            Object object = currentHead.getData();
            currentHead = currentHead.getNext();
            return object;
        }

        @Override
        public boolean hasNext() {
            return currentHead != null;
        }
    }
}
