package bridge;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-26 21:51
 */
public class Boy {
    private String name;

    public void pursue(MM mm) {
        give(new WarmGift(), mm);
    }

    public void give(Gift gift, MM mm) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
