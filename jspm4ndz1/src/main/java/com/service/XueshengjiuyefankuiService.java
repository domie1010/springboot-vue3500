package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengjiuyefankuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengjiuyefankuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengjiuyefankuiView;


/**
 * 学生就业反馈
 *
 * @author 
 * @email 
 * @date 2022-05-07 10:33:42
 */
public interface XueshengjiuyefankuiService extends IService<XueshengjiuyefankuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengjiuyefankuiVO> selectListVO(Wrapper<XueshengjiuyefankuiEntity> wrapper);
   	
   	XueshengjiuyefankuiVO selectVO(@Param("ew") Wrapper<XueshengjiuyefankuiEntity> wrapper);
   	
   	List<XueshengjiuyefankuiView> selectListView(Wrapper<XueshengjiuyefankuiEntity> wrapper);
   	
   	XueshengjiuyefankuiView selectView(@Param("ew") Wrapper<XueshengjiuyefankuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengjiuyefankuiEntity> wrapper);
   	

}

