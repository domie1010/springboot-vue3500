package com.dao;

import com.entity.YongrendanweifankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YongrendanweifankuiVO;
import com.entity.view.YongrendanweifankuiView;


/**
 * 用人单位反馈
 * 
 * @author 
 * @email 
 * @date 2022-05-07 10:33:42
 */
public interface YongrendanweifankuiDao extends BaseMapper<YongrendanweifankuiEntity> {
	
	List<YongrendanweifankuiVO> selectListVO(@Param("ew") Wrapper<YongrendanweifankuiEntity> wrapper);
	
	YongrendanweifankuiVO selectVO(@Param("ew") Wrapper<YongrendanweifankuiEntity> wrapper);
	
	List<YongrendanweifankuiView> selectListView(@Param("ew") Wrapper<YongrendanweifankuiEntity> wrapper);

	List<YongrendanweifankuiView> selectListView(Pagination page,@Param("ew") Wrapper<YongrendanweifankuiEntity> wrapper);
	
	YongrendanweifankuiView selectView(@Param("ew") Wrapper<YongrendanweifankuiEntity> wrapper);
	

}
