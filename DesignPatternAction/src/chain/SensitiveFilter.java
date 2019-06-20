package chain;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-20 21:19
 */
public class SensitiveFilter implements Filter {
    @Override
    public String doFilter(String str) {
        String r = str.replace("被就业", "就业")
                .replace("敏感", "**");
        return r;
    }
}
