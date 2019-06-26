package bridge;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-26 22:16
 */
public class WildGift extends Gift {
    public WildGift(){
        super();
    }

    public WildGift(GiftImpl giftImpl) {
        this.giftImpl = giftImpl;
    }
}
