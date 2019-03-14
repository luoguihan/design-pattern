package com.meteor.design.pattern.struction.adapter.interfaceAdapter;


/**
 * @author: luoguihan
 * @date: 2019/2/11
 * @version: 1.0
 */
public class Power5VAdapter extends PowerAdapter {

    public Power5VAdapter(AC220 ac220) {
        super(ac220);
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
