package com.sheng.configurer.mybatis;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
/**
 * 
 * @author Administrator
 *
 */
@Configuration
public class DruidServletConfig {

	@Bean
	public ServletRegistrationBean druidStatViewServlet(){
		ServletRegistrationBean servlet=new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
		//白名单
		servlet.addInitParameter("allow", "127.0.0.1");
		//黑名单
		servlet.addInitParameter("deny", "192.168.1.73");
		 //登录查看信息的账号密码.
		servlet.addInitParameter("loginUsername","admin");
		servlet.addInitParameter("loginPassword","123456");
		 //是否能够重置数据（以防他人乱改）.
		servlet.addInitParameter("resetEnable","false");
		return servlet;
	}
	
	
	/**
	 * 过滤器过滤静态资源
	 * @return
	 */
	@Bean
	public FilterRegistrationBean druidStatViewFilter(){
		FilterRegistrationBean filter=new FilterRegistrationBean(new WebStatFilter());
		filter.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
		filter.addUrlPatterns("/druid/*");
		filter.addServletNames("druidStatViewFilter");
		return filter;
	}
}
