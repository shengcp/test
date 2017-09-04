package com.sheng.configurer.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

@WebFilter(filterName="myFilter",urlPatterns="/*")
public class MyFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		  	HttpServletResponse rsp = (HttpServletResponse) response;
		  	rsp.setHeader("Access-Control-Allow-Origin", "*");
		  	rsp.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
		  	rsp.setHeader("Access-Control-Max-Age", "3600");
		  	rsp.setHeader("Access-Control-Allow-Headers", "x-requested-with");
	        chain.doFilter(request, response);
		
	}

	@Override
	public void destroy() {}

}
