package chain.webfilterchain;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-20 22:30
 */
public class HTMLFilter implements Filter{
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        String reqestString = request.getRequestString()
                .replace('<', '[')
                .replace('>', ']');
        request.setRequestString(reqestString);

        chain.doFilter(request, response, chain);

        response.setResponseString(response.getResponseString() + "--HTML--");

    }
}
