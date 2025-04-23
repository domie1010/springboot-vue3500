package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YongrendanweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YongrendanweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YongrendanweiView;


/**
 * 用人单位
 *
 * @author 
 * @email 
 * @date 2022-05-07 10:33:41
 */
public interface YongrendanweiService extends IService<YongrendanweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YongrendanweiVO> selectListVO(Wrapper<YongrendanweiEntity> wrapper);
   	
   	YongrendanweiVO selectVO(@Param("ew") Wrapper<YongrendanweiEntity> wrapper);
   	
   	List<YongrendanweiView> selectListView(Wrapper<YongrendanweiEntity> wrapper);
   	
   	YongrendanweiView selectView(@Param("ew") Wrapper<YongrendanweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YongrendanweiEntity> wrapper);
   	

}

