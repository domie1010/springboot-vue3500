package com.dao;

import com.entity.YongrendanweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YongrendanweiVO;
import com.entity.view.YongrendanweiView;


/**
 * 用人单位
 * 
 * @author 
 * @email 
 * @date 2022-05-07 10:33:41
 */
public interface YongrendanweiDao extends BaseMapper<YongrendanweiEntity> {
	
	List<YongrendanweiVO> selectListVO(@Param("ew") Wrapper<YongrendanweiEntity> wrapper);
	
	YongrendanweiVO selectVO(@Param("ew") Wrapper<YongrendanweiEntity> wrapper);
	
	List<YongrendanweiView> selectListView(@Param("ew") Wrapper<YongrendanweiEntity> wrapper);

	List<YongrendanweiView> selectListView(Pagination page,@Param("ew") Wrapper<YongrendanweiEntity> wrapper);
	
	YongrendanweiView selectView(@Param("ew") Wrapper<YongrendanweiEntity> wrapper);
	

}
