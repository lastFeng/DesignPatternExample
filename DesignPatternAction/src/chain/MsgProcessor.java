package chain;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-20 21:06
 */
public class MsgProcessor {
    private String msg;
//    Filter[] filters = {new HtmlFilter(), new SensitiveFilter()};

    public FilterChain getFilterChain() {
        return filterChain;
    }

    public void setFilterChain(FilterChain filterChain) {
        this.filterChain = filterChain;
    }

    FilterChain filterChain;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String process(){
        String r = filterChain.doFilter(msg);

        return r;
    }
}
