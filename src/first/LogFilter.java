package first;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * 第一个过滤器Filter
 * @author Administrator
 *
 */
public class LogFilter implements Filter{
	//FilterConfig可用于访问Filter的配置信息
	@SuppressWarnings("unused")
	private FilterConfig config;

	@Override
	public void init(FilterConfig config) throws ServletException {
		this.config = config;
	}
	
	@Override
	public void destroy() {
		this.config = null;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,FilterChain config) throws IOException, ServletException {
		long before = System.currentTimeMillis();
		System.out.println("开始过滤...");
		//讲请求转化为HttpServletRequest请求
		HttpServletRequest hsr = (HttpServletRequest)request;
		//输出提示信息
		System.out.println("Filter已经拦截到用户的请求的地址：" + hsr.getServletPath());
		//Filter只是链式处理，请求依然放行到目的地址
		config.doFilter(request, response);
		//下面的代码用于对服务器响应执行后处理
		long after = System.currentTimeMillis();
		System.out.println("过滤结束");
		System.out.println("请求被定位到：" + hsr.getRequestURI() + ",花费的时间：" + (after - before) + "毫秒");
	}

}
