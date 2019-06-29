package command;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-27 22:00
 */
public class ShoppingCommand extends Command {
    @Override
    public void execute() {
        System.out.println("zoo");
    }

    @Override
    public void unDo() {
        System.out.println("undo zoo");
    }
}
