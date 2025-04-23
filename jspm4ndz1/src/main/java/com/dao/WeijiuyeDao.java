package com.dao;

import com.entity.WeijiuyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeijiuyeVO;
import com.entity.view.WeijiuyeView;


/**
 * 未就业
 * 
 * @author 
 * @email 
 * @date 2022-05-07 10:33:41
 */
public interface WeijiuyeDao extends BaseMapper<WeijiuyeEntity> {
	
	List<WeijiuyeVO> selectListVO(@Param("ew") Wrapper<WeijiuyeEntity> wrapper);
	
	WeijiuyeVO selectVO(@Param("ew") Wrapper<WeijiuyeEntity> wrapper);
	
	List<WeijiuyeView> selectListView(@Param("ew") Wrapper<WeijiuyeEntity> wrapper);

	List<WeijiuyeView> selectListView(Pagination page,@Param("ew") Wrapper<WeijiuyeEntity> wrapper);
	
	WeijiuyeView selectView(@Param("ew") Wrapper<WeijiuyeEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WeijiuyeEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WeijiuyeEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WeijiuyeEntity> wrapper);
}
