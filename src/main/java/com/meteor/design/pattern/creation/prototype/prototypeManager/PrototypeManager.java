package com.meteor.design.pattern.creation.prototype.prototypeManager;

import java.util.Hashtable;

/**
 * 原型管理器（使用饿汉式单例实现）
 *
 * @author: luoguihan
 * @date: 2019/2/11
 * @version: 1.0
 */
public class PrototypeManager {

    private Hashtable ht = new Hashtable();

    private static PrototypeManager pm = new PrototypeManager();

    private PrototypeManager() {
        ht.put("far", new FAR());
        ht.put("srs", new SRS());
    }

    public void addOfficialDocument(String key, OfficialDocument doc) {
        ht.put(key, doc);
    }

    /**
     * 通过浅克隆获取新的对象
     * @param key
     * @return
     */
    public OfficialDocument getOfficialDocument(String key) {
        return ((OfficialDocument)ht.get(key)).clone();
    }

    public static PrototypeManager getPrototypeManager() {
        return pm;
    }
}
