package command;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-27 21:51
 */
public class Girl {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void order(Boy boy) {
        boy.doSomething();
    }
}
