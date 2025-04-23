package com.dao;

import com.entity.JiuyepaiqianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiuyepaiqianVO;
import com.entity.view.JiuyepaiqianView;


/**
 * 就业派遣
 * 
 * @author 
 * @email 
 * @date 2022-05-07 10:33:41
 */
public interface JiuyepaiqianDao extends BaseMapper<JiuyepaiqianEntity> {
	
	List<JiuyepaiqianVO> selectListVO(@Param("ew") Wrapper<JiuyepaiqianEntity> wrapper);
	
	JiuyepaiqianVO selectVO(@Param("ew") Wrapper<JiuyepaiqianEntity> wrapper);
	
	List<JiuyepaiqianView> selectListView(@Param("ew") Wrapper<JiuyepaiqianEntity> wrapper);

	List<JiuyepaiqianView> selectListView(Pagination page,@Param("ew") Wrapper<JiuyepaiqianEntity> wrapper);
	
	JiuyepaiqianView selectView(@Param("ew") Wrapper<JiuyepaiqianEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiuyepaiqianEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiuyepaiqianEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiuyepaiqianEntity> wrapper);
}
