package com.sheng;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.sheng.mapper")//配置mybatis包扫描
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		List<MediaType> supportedMediaTypes = new ArrayList<MediaType>();
		supportedMediaTypes.add(new MediaType("text", "html", Charset.forName("UTF-8")));
		supportedMediaTypes.add(new MediaType("application", "json", Charset.forName("UTF-8")));
		fastConverter.setSupportedMediaTypes(supportedMediaTypes);

		SerializerFeature[] features =  {
			// 输出key时是否使用双引号
			SerializerFeature.QuoteFieldNames,
			//是否输出值为null的字段
			SerializerFeature.WriteMapNullValue,
			//数值字段如果为null,输出为0,而非null
			SerializerFeature.WriteNullNumberAsZero,
			//List字段如果为null,输出为[],而非null
			SerializerFeature.WriteNullListAsEmpty,
			//字符类型字段如果为null,输出为"",而非null
			SerializerFeature.WriteNullStringAsEmpty,
			//Boolean字段如果为null,输出为false,而非null
			//SerializerFeature.WriteNullBooleanAsFalse
			// null String不输出
			//SerializerFeature.WriteNullStringAsEmpty
			//null String也要输出
			SerializerFeature.WriteMapNullValue,
			//Date的日期转换器
			SerializerFeature.WriteDateUseDateFormat,
			//禁止循环引用
			SerializerFeature.DisableCircularReferenceDetect
		};
		fastConverter.setFeatures(features);
		HttpMessageConverter<?> converter = fastConverter;
		return new HttpMessageConverters(converter);
	}
}
