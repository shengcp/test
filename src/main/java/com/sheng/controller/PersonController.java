package com.sheng.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sheng.entity.Person;
import com.sheng.exception.ChangpengException;
import com.sheng.service.IPersonService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sheng
 * @since 2017-05-22
 */
@RestController
@RequestMapping("/sheng/person")
public class PersonController {
	@Autowired
	private IPersonService personService;
	
	@RequestMapping("/getAll")
	public ResponseBase<List<Person>> getAllPersion(){
		return ResponseBase.success(personService.selectList(null));
	}
	
	@RequestMapping("/getPerson")
	public ResponseBase<Person> getOne(Integer id){
		Person person=personService.getOneByID(id);
		return ResponseBase.success(person);	
	}
	
}
