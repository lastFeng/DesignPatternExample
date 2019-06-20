package chain.webfilterchain;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-20 22:39
 */
public class ChainMain {
    public static void main(String[] args) {
        String requestMsg = "大家好:), <script>, 敏感，被就业等等";
        String responseMsg = "response";

        Request request = new Request();
        Response response = new Response();

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HTMLFilter())
                .addFilter(new SensitiveFilter());

        MsgProcessor msgProcessor = new MsgProcessor();
        msgProcessor.setRequest(request);
        msgProcessor.setResponse(response);
        msgProcessor.setRequestMsg(requestMsg);
        msgProcessor.setResponseMsg(responseMsg);
        msgProcessor.setFilterChain(filterChain);

        msgProcessor.process();

        System.out.println(msgProcessor.getRequest().getRequestString());
        System.out.println(msgProcessor.getResponse().getResponseString());
    }
}
