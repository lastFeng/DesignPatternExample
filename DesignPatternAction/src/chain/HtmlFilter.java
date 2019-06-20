package chain;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-20 21:18
 */
public class HtmlFilter implements Filter {
    @Override
    public String doFilter(String str) {
        String r = str.replace('<', '[')
                .replace('>', ']');
        return r;
    }
}
