package com.dao;

import com.entity.XueshengjiuyefankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengjiuyefankuiVO;
import com.entity.view.XueshengjiuyefankuiView;


/**
 * 学生就业反馈
 * 
 * @author 
 * @email 
 * @date 2022-05-07 10:33:42
 */
public interface XueshengjiuyefankuiDao extends BaseMapper<XueshengjiuyefankuiEntity> {
	
	List<XueshengjiuyefankuiVO> selectListVO(@Param("ew") Wrapper<XueshengjiuyefankuiEntity> wrapper);
	
	XueshengjiuyefankuiVO selectVO(@Param("ew") Wrapper<XueshengjiuyefankuiEntity> wrapper);
	
	List<XueshengjiuyefankuiView> selectListView(@Param("ew") Wrapper<XueshengjiuyefankuiEntity> wrapper);

	List<XueshengjiuyefankuiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengjiuyefankuiEntity> wrapper);
	
	XueshengjiuyefankuiView selectView(@Param("ew") Wrapper<XueshengjiuyefankuiEntity> wrapper);
	

}
