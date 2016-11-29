package spring.service.impl;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 使用周围通知
 * 周围通知相当于前通知，返回后通知，抛出后通知的结合
 * @author 钱多多--董书广
 * @since
 */
public class AudienceAroundAdvice implements MethodInterceptor{
	private Audience audience;
	public void setAudience(Audience audience) {
		this.audience = audience;
	}
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		try {
			audience.setDown();
			audience.offPhone();
			Object returnValue = invocation.proceed();
			audience.applaud();
			return returnValue;
		} catch (Exception e) {
			audience.demandRefund();
			throw e;
		}
	}
	
}
