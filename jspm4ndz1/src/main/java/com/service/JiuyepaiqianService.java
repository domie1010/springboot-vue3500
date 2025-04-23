package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiuyepaiqianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiuyepaiqianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiuyepaiqianView;


/**
 * 就业派遣
 *
 * @author 
 * @email 
 * @date 2022-05-07 10:33:41
 */
public interface JiuyepaiqianService extends IService<JiuyepaiqianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiuyepaiqianVO> selectListVO(Wrapper<JiuyepaiqianEntity> wrapper);
   	
   	JiuyepaiqianVO selectVO(@Param("ew") Wrapper<JiuyepaiqianEntity> wrapper);
   	
   	List<JiuyepaiqianView> selectListView(Wrapper<JiuyepaiqianEntity> wrapper);
   	
   	JiuyepaiqianView selectView(@Param("ew") Wrapper<JiuyepaiqianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiuyepaiqianEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JiuyepaiqianEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JiuyepaiqianEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JiuyepaiqianEntity> wrapper);
}

