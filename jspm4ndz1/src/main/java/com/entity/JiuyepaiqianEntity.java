package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 就业派遣
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-07 10:33:41
 */
@TableName("jiuyepaiqian")
public class JiuyepaiqianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiuyepaiqianEntity() {
		
	}
	
	public JiuyepaiqianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 企业账号
	 */
					
	private String qiyezhanghao;
	
	/**
	 * 企业名称
	 */
					
	private String qiyemingcheng;
	
	/**
	 * 派遣去向
	 */
					
	private String paiqianquxiang;
	
	/**
	 * 学生档案
	 */
					
	private String xueshengdangan;
	
	/**
	 * 学生户口
	 */
					
	private String xueshenghukou;
	
	/**
	 * 派遣方案
	 */
					
	private String paiqianfangan;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：企业账号
	 */
	public void setQiyezhanghao(String qiyezhanghao) {
		this.qiyezhanghao = qiyezhanghao;
	}
	/**
	 * 获取：企业账号
	 */
	public String getQiyezhanghao() {
		return qiyezhanghao;
	}
	/**
	 * 设置：企业名称
	 */
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	/**
	 * 获取：企业名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
	/**
	 * 设置：派遣去向
	 */
	public void setPaiqianquxiang(String paiqianquxiang) {
		this.paiqianquxiang = paiqianquxiang;
	}
	/**
	 * 获取：派遣去向
	 */
	public String getPaiqianquxiang() {
		return paiqianquxiang;
	}
	/**
	 * 设置：学生档案
	 */
	public void setXueshengdangan(String xueshengdangan) {
		this.xueshengdangan = xueshengdangan;
	}
	/**
	 * 获取：学生档案
	 */
	public String getXueshengdangan() {
		return xueshengdangan;
	}
	/**
	 * 设置：学生户口
	 */
	public void setXueshenghukou(String xueshenghukou) {
		this.xueshenghukou = xueshenghukou;
	}
	/**
	 * 获取：学生户口
	 */
	public String getXueshenghukou() {
		return xueshenghukou;
	}
	/**
	 * 设置：派遣方案
	 */
	public void setPaiqianfangan(String paiqianfangan) {
		this.paiqianfangan = paiqianfangan;
	}
	/**
	 * 获取：派遣方案
	 */
	public String getPaiqianfangan() {
		return paiqianfangan;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
