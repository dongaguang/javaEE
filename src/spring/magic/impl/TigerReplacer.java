package spring.magic.impl;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class TigerReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object target, Method method, Object[] args)throws Throwable {
		return "a ferocious tiger";
	}

}
