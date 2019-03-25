package com.meteor.design.pattern.behavior.state;

import lombok.Data;

/**
 * 环境类
 *
 * @author: luoguihan
 * @date 2019-03-25
 * @version: 1.0
 */
@Data
public class Context {

    private State state;

    // 定义环境类的初始状态
    public Context()
    {
        this.state=new ConcreteStateA();
    }

    // 对请求做处理
    public void Handle()
    {
        state.Handle(this);
    }
}
