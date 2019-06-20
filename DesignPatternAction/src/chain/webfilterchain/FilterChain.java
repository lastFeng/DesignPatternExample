package chain.webfilterchain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-20 22:28
 */
public class FilterChain implements Filter {

    List<Filter> filters = new ArrayList<>();
    int index = 0;

    public FilterChain addFilter(Filter filter){
        filters.add(filter);
        return this;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        if (index == filters.size()){
            return;
        }

        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, chain);
//        for (Filter filter: filters) {
//            filter.doFilter(request, response, chain);
//        }
    }
}
