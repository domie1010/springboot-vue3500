package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiuyepaiqianDao;
import com.entity.JiuyepaiqianEntity;
import com.service.JiuyepaiqianService;
import com.entity.vo.JiuyepaiqianVO;
import com.entity.view.JiuyepaiqianView;

@Service("jiuyepaiqianService")
public class JiuyepaiqianServiceImpl extends ServiceImpl<JiuyepaiqianDao, JiuyepaiqianEntity> implements JiuyepaiqianService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiuyepaiqianEntity> page = this.selectPage(
                new Query<JiuyepaiqianEntity>(params).getPage(),
                new EntityWrapper<JiuyepaiqianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiuyepaiqianEntity> wrapper) {
		  Page<JiuyepaiqianView> page =new Query<JiuyepaiqianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiuyepaiqianVO> selectListVO(Wrapper<JiuyepaiqianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiuyepaiqianVO selectVO(Wrapper<JiuyepaiqianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiuyepaiqianView> selectListView(Wrapper<JiuyepaiqianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiuyepaiqianView selectView(Wrapper<JiuyepaiqianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<JiuyepaiqianEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<JiuyepaiqianEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<JiuyepaiqianEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
