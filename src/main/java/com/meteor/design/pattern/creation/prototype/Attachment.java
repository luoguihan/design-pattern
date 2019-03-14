package com.meteor.design.pattern.creation.prototype;

import lombok.Data;

import java.io.Serializable;

/**
 * 深克隆中的引用对象,实现序列化才能深克隆
 *
 * @author: luoguihan
 * @date: 2019/2/11
 * @version: 1.0
 */
@Data
public class Attachment implements Serializable{

    private  String name;

    public void download() {
        System.out.println("下载附件，文件名为" + name);
    }
}
