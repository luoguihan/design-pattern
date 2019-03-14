package com.meteor.design.pattern.struction.adapter.objectAdapter;

/**
 * 适配器类
 *
 * @author: luoguihan
 * @date: 2019/2/11
 * @version: 1.0
 */
public class PowerAdapter implements DC5 {

    private AC220 mAC220;

    public PowerAdapter(AC220 ac220){
        this.mAC220 = ac220;
    }

    @Override
    public int output5V() {
        int output = 0;
        if (mAC220 != null) {
            output = mAC220.output220V() / 44;
        }
        return output;
    }
}
