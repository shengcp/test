package com.sheng.service;

import com.sheng.entity.Dept;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sheng
 * @since 2017-05-22
 */
public interface IDeptService extends IService<Dept> {
	public Dept getAllDeptInfoByID(int did);
}
