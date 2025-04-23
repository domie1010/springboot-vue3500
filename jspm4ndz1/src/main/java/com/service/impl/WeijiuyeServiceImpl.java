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


import com.dao.WeijiuyeDao;
import com.entity.WeijiuyeEntity;
import com.service.WeijiuyeService;
import com.entity.vo.WeijiuyeVO;
import com.entity.view.WeijiuyeView;

@Service("weijiuyeService")
public class WeijiuyeServiceImpl extends ServiceImpl<WeijiuyeDao, WeijiuyeEntity> implements WeijiuyeService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeijiuyeEntity> page = this.selectPage(
                new Query<WeijiuyeEntity>(params).getPage(),
                new EntityWrapper<WeijiuyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeijiuyeEntity> wrapper) {
		  Page<WeijiuyeView> page =new Query<WeijiuyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeijiuyeVO> selectListVO(Wrapper<WeijiuyeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeijiuyeVO selectVO(Wrapper<WeijiuyeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeijiuyeView> selectListView(Wrapper<WeijiuyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeijiuyeView selectView(Wrapper<WeijiuyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<WeijiuyeEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<WeijiuyeEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<WeijiuyeEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
