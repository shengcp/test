package com.sheng.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sheng.entity.Dept;
import com.sheng.service.IDeptService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sheng
 * @since 2017-05-22
 */
@RestController
@RequestMapping("/sheng/dept")
public class DeptController {
	@Autowired
	private IDeptService deptService;
	
	Logger logger=LoggerFactory.getLogger(DeptController.class);
	
	
	@RequestMapping("getAllDeptInfo")
	private ResponseBase<Dept> getAllDeptInfoByID(Integer did){
		Dept dept =deptService.getAllDeptInfoByID(did);
		logger.info("返回了=========");
		return ResponseBase.success(dept);
	}
}
