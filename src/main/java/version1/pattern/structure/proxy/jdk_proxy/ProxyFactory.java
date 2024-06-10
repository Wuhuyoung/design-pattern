package version1.pattern.structure.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 生成代理对象的工厂
 */
public class ProxyFactory {
    private TrainStation trainStation = new TrainStation();

    public SellTickets getProxyObject() {
        SellTickets proxyObj = (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //添加增强代码
                        System.out.println("代售点收取服务费(JDK动态代理)");
                        //执行被代理对象原来要执行的方法
                        Object res = method.invoke(trainStation, args);
                        System.out.println("售票完毕");
                        return res;
                    }
                }
        );
        return proxyObj;
    }
}
