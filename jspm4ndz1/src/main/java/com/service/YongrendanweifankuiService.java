package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YongrendanweifankuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YongrendanweifankuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YongrendanweifankuiView;


/**
 * 用人单位反馈
 *
 * @author 
 * @email 
 * @date 2022-05-07 10:33:42
 */
public interface YongrendanweifankuiService extends IService<YongrendanweifankuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YongrendanweifankuiVO> selectListVO(Wrapper<YongrendanweifankuiEntity> wrapper);
   	
   	YongrendanweifankuiVO selectVO(@Param("ew") Wrapper<YongrendanweifankuiEntity> wrapper);
   	
   	List<YongrendanweifankuiView> selectListView(Wrapper<YongrendanweifankuiEntity> wrapper);
   	
   	YongrendanweifankuiView selectView(@Param("ew") Wrapper<YongrendanweifankuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YongrendanweifankuiEntity> wrapper);
   	

}

