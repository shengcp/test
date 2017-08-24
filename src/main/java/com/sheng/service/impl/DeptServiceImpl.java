package com.sheng.service.impl;

import com.sheng.entity.Dept;
import com.sheng.mapper.DeptMapper;
import com.sheng.service.IDeptService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
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
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {
	
}
