package com.entity.view;

import com.entity.YongrendanweifankuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用人单位反馈
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-07 10:33:42
 */
@TableName("yongrendanweifankui")
public class YongrendanweifankuiView  extends YongrendanweifankuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YongrendanweifankuiView(){
	}
 
 	public YongrendanweifankuiView(YongrendanweifankuiEntity yongrendanweifankuiEntity){
 	try {
			BeanUtils.copyProperties(this, yongrendanweifankuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
