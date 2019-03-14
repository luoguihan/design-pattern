package com.meteor.design.pattern.struction.adapter.classAdapter;

/**
 * 适配器类
 *
 * @author: luoguihan
 * @date: 2019/2/11
 * @version: 1.0
 */
public class PowerAdapter extends AC220 implements DC5 {
    @Override
    public int output5V() {
        int output = output220V();
        return (output / 44);
    }
}
