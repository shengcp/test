package com.sheng.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;


/**
 * <p>
 * 
 * </p>
 *
 * @author sheng
 * @since 2017-05-22
 */
@TableName("dept")
public class Dept extends Model<Dept> {

    private static final long serialVersionUID = 1L;

    @TableId(type=IdType.AUTO,value="did")
	private Integer did;
    
    @TableField(value="dname")
	private String dname;


	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	protected Serializable pkVal() {
		return this.did;
	}

}
