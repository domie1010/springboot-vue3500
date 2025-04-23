package com.entity.view;

import com.entity.YongrendanweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用人单位
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-07 10:33:41
 */
@TableName("yongrendanwei")
public class YongrendanweiView  extends YongrendanweiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YongrendanweiView(){
	}
 
 	public YongrendanweiView(YongrendanweiEntity yongrendanweiEntity){
 	try {
			BeanUtils.copyProperties(this, yongrendanweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
