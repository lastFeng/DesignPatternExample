package chain.webfilterchain;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-20 22:27
 */
public interface Filter {
    void doFilter(Request request, Response response, FilterChain chain);
}
