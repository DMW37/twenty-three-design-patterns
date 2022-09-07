package com.dmw.structural.adapter;



/**
 * 定义适配器类（SD兼容TF）
 * 这是适配器的核心，实现接口，继承需要兼容的实现类
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {

    public String readSD() {
        System.out.println("adapter read tf card ");
        return readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
