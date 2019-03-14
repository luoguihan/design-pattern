package com.meteor.design.pattern.creation.prototype;

/**
 * 客户端
 *
 * @author: luoguihan
 * @date: 2019/2/11
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("-------------------------------浅克隆---------------------------------");
        WeeklyLog log = new WeeklyLog();
        Attachment attachment = new Attachment();
        attachment.setName("第一周附件");
        log.setAttachment(attachment);
        log.setName("luoguihan");
        log.setDate("第一周");
        log.setContent("工作中");

        WeeklyLog clone = log.clone();
        System.out.println(clone.toString());

        System.out.println("克隆的对象是否是同一个对象？" + (log == clone));
        System.out.println("克隆的对象内容是否相等？" + (log.equals(clone)));

        // 浅克隆，克隆的只是对象的引用，所以原对象改变会导致克隆对象的改变
        System.out.println("对象的引用是否相等？" + (log.getAttachment() == clone.getAttachment()));

        System.out.println("-------------------------------深克隆---------------------------------");
        DeepCloneWeeklyLog deepCloneWeeklyLog = new DeepCloneWeeklyLog();
        Attachment attachment2 = new Attachment();
        attachment2.setName("第十周附件");
        deepCloneWeeklyLog.setAttachment(attachment2);
        deepCloneWeeklyLog.setName("luoguihan");
        deepCloneWeeklyLog.setDate("第十周");
        deepCloneWeeklyLog.setContent("工作中");
        DeepCloneWeeklyLog clone2 = deepCloneWeeklyLog.deepClone();

        System.out.println("克隆的对象是否是同一个对象？" + (deepCloneWeeklyLog == clone2));
        System.out.println("克隆的对象内容是否相等？" + (deepCloneWeeklyLog.equals(clone2)));

        // 由于是深克隆对象，所以原对象改变不会影响克隆对象
        System.out.println("对象的引用是否相等？" + (deepCloneWeeklyLog.getAttachment() == clone2.getAttachment()));
    }
}
