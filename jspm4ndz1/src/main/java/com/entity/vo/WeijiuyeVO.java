package com.entity.vo;

import com.entity.WeijiuyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 未就业
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-07 10:33:41
 */
public class WeijiuyeVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 院系
	 */
	
	private String yuanxi;
		
	/**
	 * 专业
	 */
	
	private String zhuanye;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 求职意向
	 */
	
	private String qiuzhiyixiang;
		
	/**
	 * 未就业原因
	 */
	
	private String weijiuyeyuanyin;
		
	/**
	 * 学生优势
	 */
	
	private String xueshengyoushi;
		
	/**
	 * 添加时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tianjiashijian;
				
	
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
	 * 设置：院系
	 */
	 
	public void setYuanxi(String yuanxi) {
		this.yuanxi = yuanxi;
	}
	
	/**
	 * 获取：院系
	 */
	public String getYuanxi() {
		return yuanxi;
	}
				
	
	/**
	 * 设置：专业
	 */
	 
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：求职意向
	 */
	 
	public void setQiuzhiyixiang(String qiuzhiyixiang) {
		this.qiuzhiyixiang = qiuzhiyixiang;
	}
	
	/**
	 * 获取：求职意向
	 */
	public String getQiuzhiyixiang() {
		return qiuzhiyixiang;
	}
				
	
	/**
	 * 设置：未就业原因
	 */
	 
	public void setWeijiuyeyuanyin(String weijiuyeyuanyin) {
		this.weijiuyeyuanyin = weijiuyeyuanyin;
	}
	
	/**
	 * 获取：未就业原因
	 */
	public String getWeijiuyeyuanyin() {
		return weijiuyeyuanyin;
	}
				
	
	/**
	 * 设置：学生优势
	 */
	 
	public void setXueshengyoushi(String xueshengyoushi) {
		this.xueshengyoushi = xueshengyoushi;
	}
	
	/**
	 * 获取：学生优势
	 */
	public String getXueshengyoushi() {
		return xueshengyoushi;
	}
				
	
	/**
	 * 设置：添加时间
	 */
	 
	public void setTianjiashijian(Date tianjiashijian) {
		this.tianjiashijian = tianjiashijian;
	}
	
	/**
	 * 获取：添加时间
	 */
	public Date getTianjiashijian() {
		return tianjiashijian;
	}
			
}
