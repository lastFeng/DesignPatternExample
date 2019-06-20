package chain.webfilterchain;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-20 22:33
 */
public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        String requestString = request.getRequestString()
                .replace("被就业", "就业")
                .replace("敏感", "**");
        request.setRequestString(requestString);

        chain.doFilter(request, response, chain);

        response.setResponseString(response.getResponseString() + "--Sensitive--");
    }
}
