package com.sheng.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.List;


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

    private List<Person> personList;
    
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

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	@Override
	protected Serializable pkVal() {
		return this.did;
	}

}
