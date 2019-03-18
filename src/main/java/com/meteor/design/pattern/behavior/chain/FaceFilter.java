package com.meteor.design.pattern.behavior.chain;

/**
 * @author: luoguihan
 * @date 2019-03-18
 * @version: 1.0
 */
public class FaceFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        //将字符串中出现的":):"转换成"^V^";
        request.request = request.request.replace(":):", "^V^")
                //后面添加的是便于我们观察代码执行步骤的字符串
                + "----FaceFilter()";
        chain.doFilter(request, response, chain);
        response.response += "---FaceFilter()";
    }
}
