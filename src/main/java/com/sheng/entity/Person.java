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
@TableName("person")
public class Person extends Model<Person> {

    private static final long serialVersionUID = 1L;

    @TableId(value="id",type=IdType.AUTO)
	private Integer id;
    
    @TableField("name")
	private String name;
    
    @TableField("age")
	private Integer age;
    
    @TableField("did")
	private Integer did;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
