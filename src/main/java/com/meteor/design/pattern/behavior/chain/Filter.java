package com.meteor.design.pattern.behavior.chain;

/**
 * 定义接口Filter,具体的过滤规则需要实现这个接口
 *
 * @author: luoguihan
 * @date 2019-03-18
 * @version: 1.0
 */
public interface Filter {

    void doFilter(Request request,Response response,FilterChain chain);
}
