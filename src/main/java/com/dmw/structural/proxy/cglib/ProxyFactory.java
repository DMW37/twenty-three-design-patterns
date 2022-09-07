package com.dmw.structural.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    private TrainStation trainStation = new TrainStation();

    public TrainStation getProxyObject(){
        //创建Enhancer,类似于JDK动态代理的Proxy
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(this.trainStation.getClass());
        //设置回调参数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation responseObject = (TrainStation) enhancer.create();
        return responseObject;
    }

    /**
     *
     * @param o             代理对象
     * @param method        真实对象中Method实例
     * @param objects       实际参数
     * @param methodProxy   代理对象中Method实例
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理点收取一些服务费用(CGLIB动态代理方式)");
        //methodProxy invokeSuper方法方式
       // Object invoke1 = methodProxy.invokeSuper(o, objects);
        //method invoke方法
        Object invoke2 = method.invoke(trainStation, objects);
        return invoke2;
    }
}