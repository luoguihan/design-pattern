package com.meteor.design.pattern.behavior.command;

import lombok.Data;

/**
 * 命令请求者
 * @author: luoguihan
 * @date 2019-03-19
 * @version: 1.0
 */
@Data
public class Invoker {

    private Command command;

    public void runCommand() {
        command.execute();
    }
}
