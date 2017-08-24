package com.sheng.exception;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sheng.controller.ResponseBase;

@ControllerAdvice
public class ExceptionInterceptHandler {

	private static final Logger logger=LoggerFactory.getLogger(ExceptionInterceptHandler.class);
	
	
	@ExceptionHandler({Exception.class})
	@ResponseBody
	public ResponseBase<String> exceptionRespHandler(Exception ex){
		ResponseBase<String> responseBaseVo = new ResponseBase<String>();
		 if(ex instanceof ChangpengException ){
			responseBaseVo.setCode(1);
			responseBaseVo.setMsg("运行异常");
			logger.error("运行异常",ex);
			return responseBaseVo;
		}else{
			responseBaseVo.setCode(2);
			responseBaseVo.setMsg("系统异常");
			logger.error("系统异常",ex);
			return responseBaseVo;
		}
		
	}
}
