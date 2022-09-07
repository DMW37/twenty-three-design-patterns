package com.dmw.structural.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: 邓明维
 * @date: 2022/9/6
 * @description:
 */
public class USBProxy implements USB {
    public static void main(String[] args) {

        USB o = (USB) Proxy.newProxyInstance(USBProxy.class.getClassLoader(), USBProxy.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("代理了哦");
                Object use = method.invoke(new USBProxy(), args);
                return use;
            }
        });
        o.sell("张三");
    }

    @Override
    public void sell(String name) {

    }
}
