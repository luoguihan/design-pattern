package com.meteor.design.pattern.creation.prototype;

import lombok.Data;

import java.io.*;

/**
 * 深克隆对象
 *
 * @author: luoguihan
 * @date: 2019/2/11
 * @version: 1.0
 */
@Data
public class DeepCloneWeeklyLog implements Serializable {

    private String name;

    private String Date;

    private String content;

    private Attachment attachment;

    public DeepCloneWeeklyLog deepClone(){
        try {
            // 将对象写入流中
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            oos.writeObject(this);

            // 将对象从流中取出
            ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (DeepCloneWeeklyLog)ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
