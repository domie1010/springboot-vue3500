package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeijiuyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeijiuyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeijiuyeView;


/**
 * 未就业
 *
 * @author 
 * @email 
 * @date 2022-05-07 10:33:41
 */
public interface WeijiuyeService extends IService<WeijiuyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeijiuyeVO> selectListVO(Wrapper<WeijiuyeEntity> wrapper);
   	
   	WeijiuyeVO selectVO(@Param("ew") Wrapper<WeijiuyeEntity> wrapper);
   	
   	List<WeijiuyeView> selectListView(Wrapper<WeijiuyeEntity> wrapper);
   	
   	WeijiuyeView selectView(@Param("ew") Wrapper<WeijiuyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeijiuyeEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<WeijiuyeEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<WeijiuyeEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<WeijiuyeEntity> wrapper);
}

