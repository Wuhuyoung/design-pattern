package version1.pattern.structure.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 生成代理对象的工厂 - 使用cglib动态代理
 */
public class ProxyFactory implements MethodInterceptor {

    private TrainStation station = new TrainStation();

    public TrainStation createProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(station.getClass());
        enhancer.setCallback(this);
        TrainStation proxy = (TrainStation) enhancer.create();
        return proxy;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代售点收取服务费用");
        Object result = methodProxy.invokeSuper(o, objects);

        return result;
    }
}
