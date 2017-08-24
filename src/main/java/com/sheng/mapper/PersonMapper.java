package com.sheng.mapper;

import com.sheng.entity.Person;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author sheng
 * @since 2017-05-22
 */
public interface PersonMapper extends BaseMapper<Person> {
	Person getOneByID(Integer id);
}