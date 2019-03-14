package com.meteor.design.pattern.creation.prototype;

import lombok.Data;

/**
 * 浅克隆对象
 *
 * @author: luoguihan
 * @date: 2019/2/11
 * @version: 1.0
 */
@Data
public class WeeklyLog implements Cloneable {

    private String name;

    private String Date;

    private String content;

    private Attachment attachment;

    @Override
    public WeeklyLog clone() {
        Object obj = null;
        try {
            obj = super.clone();
            return (WeeklyLog) obj;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
