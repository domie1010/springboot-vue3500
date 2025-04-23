package com.entity.model;

import com.entity.JiuyepaiqianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 就业派遣
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-07 10:33:41
 */
public class JiuyepaiqianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
