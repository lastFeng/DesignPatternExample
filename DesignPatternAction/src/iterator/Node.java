package iterator;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-22 09:50
 * 节点类
 */
public class Node {
    /**节点数据*/
    private Object data;
    /**指向下一个节点*/
    private Node next;

    public Object getData() {
        return data;
    }

    /**
     * 空节点
     * */
    public Node() {
    }

    /**
     * 节点构造函数
     * @param data 数据
     * @param next 下一个节点
     * */
    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
