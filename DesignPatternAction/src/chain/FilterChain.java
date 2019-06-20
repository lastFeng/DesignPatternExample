package chain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-20 21:42
 *
 * 另外一个过滤链，需要插入到之前的过滤链中
 * 那么使用该类进行操作所有的过滤类，就可以控制器顺序
 */
public class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<>();

    public FilterChain addFilter(Filter filter){
        filters.add(filter);
        return this;
    }

    @Override
    public String doFilter(String str) {
        String r = str;

        for (Filter filter: filters){
            r = filter.doFilter(r);
        }
        return r;
    }
}
