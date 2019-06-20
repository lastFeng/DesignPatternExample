package chain;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-20 21:03
 */
public class ChainMain {
    public static void main(String[] args) {
        // 输入的信息，但是之后要将其进行处理，处理敏感信息
        String msg = "大家好:), <script>, 敏感，被就业等等";

        MsgProcessor msgProcessor = new MsgProcessor();
        msgProcessor.setMsg(msg);
        String result = msgProcessor.process();
        System.out.println(result);
    }
}
