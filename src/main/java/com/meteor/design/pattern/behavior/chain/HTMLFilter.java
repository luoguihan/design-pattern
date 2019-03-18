package com.meteor.design.pattern.behavior.chain;

/**
 * 处理字符串中的HTML标记
 *
 * @author: luoguihan
 * @date 2019-03-18
 * @version: 1.0
 */
public class HTMLFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        //将字符串中出现的"<>"符号替换成"[]"
        request.request = request.request
                .replace('<', '[').replace('>', ']') +
                //后面添加的是便于我们观察代码执行步骤的字符串
                "----HTMLFilter()";
        chain.doFilter(request, response, chain);
        response.response += "---HTMLFilter()";
    }
}
