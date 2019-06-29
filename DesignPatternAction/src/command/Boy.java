package command;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-27 21:50
 */
public class Boy {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private List<Command> listCommand = new ArrayList<>();
    private Stack<Command> listUndoCommand = new Stack<>();

    private String name;

    public void doSomething() {
    }

    public void pursue(Girl girl){

    }

    public void addCommons(Command command){
        this.listCommand.add(command);
    }

    public void unDoCommonds() {
        // 理由栈来实现，后面进来的command先Undo
    }
}
