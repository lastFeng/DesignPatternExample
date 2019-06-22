package iterator;

import java.util.Collection;
import java.util.LinkedList;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-22 10:30
 */
public class IteratorMain {
    public static void main(String[] args) {
//        CustomCollection customCollection = new CustomArrayList();
        CustomCollection customCollection = new CustomLinkedList();
        for (int i = 0; i < 10; i++){
            customCollection.add(i);
        }

        CustomIterator iterator = customCollection.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }

    }
}
