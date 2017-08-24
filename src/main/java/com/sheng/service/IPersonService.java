package com.sheng.service;

import com.sheng.entity.Person;
import com.sheng.exception.ChangpengException;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sheng
 * @since 2017-05-22
 */
public interface IPersonService extends IService<Person> {
	public Person getOneByID(Integer id) throws ChangpengException;
}
