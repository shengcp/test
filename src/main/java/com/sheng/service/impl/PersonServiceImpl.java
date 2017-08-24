package com.sheng.service.impl;

import com.sheng.entity.Person;
import com.sheng.exception.ChangpengException;
import com.sheng.mapper.PersonMapper;
import com.sheng.service.IPersonService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sheng
 * @since 2017-05-22
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

	@Autowired
	private PersonMapper personMapper;
	@Override
	public Person getOneByID(Integer id) {
				return personMapper.getOneByID(id);
	}
	
}
