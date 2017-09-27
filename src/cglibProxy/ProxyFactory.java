package cglibProxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor {
	private Object  target;
	public ProxyFactory(Object target) {
		this.target = target;
		
	}
	public Object getProxyInstance() {
		Enhancer en = new Enhancer();
		en.setSuperclass(target.getClass());
		en.setCallback(this);
		return en.create();
		
	}
	

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("开始事务-----------");
		Object returnValue = method.invoke(target, args);
		System.out.println("提交事务------------------");
		return returnValue;
	}

}
