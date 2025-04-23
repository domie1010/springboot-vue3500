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


import com.dao.YongrendanweifankuiDao;
import com.entity.YongrendanweifankuiEntity;
import com.service.YongrendanweifankuiService;
import com.entity.vo.YongrendanweifankuiVO;
import com.entity.view.YongrendanweifankuiView;

@Service("yongrendanweifankuiService")
public class YongrendanweifankuiServiceImpl extends ServiceImpl<YongrendanweifankuiDao, YongrendanweifankuiEntity> implements YongrendanweifankuiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YongrendanweifankuiEntity> page = this.selectPage(
                new Query<YongrendanweifankuiEntity>(params).getPage(),
                new EntityWrapper<YongrendanweifankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YongrendanweifankuiEntity> wrapper) {
		  Page<YongrendanweifankuiView> page =new Query<YongrendanweifankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YongrendanweifankuiVO> selectListVO(Wrapper<YongrendanweifankuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YongrendanweifankuiVO selectVO(Wrapper<YongrendanweifankuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YongrendanweifankuiView> selectListView(Wrapper<YongrendanweifankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YongrendanweifankuiView selectView(Wrapper<YongrendanweifankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
