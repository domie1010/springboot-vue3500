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


import com.dao.YongrendanweiDao;
import com.entity.YongrendanweiEntity;
import com.service.YongrendanweiService;
import com.entity.vo.YongrendanweiVO;
import com.entity.view.YongrendanweiView;

@Service("yongrendanweiService")
public class YongrendanweiServiceImpl extends ServiceImpl<YongrendanweiDao, YongrendanweiEntity> implements YongrendanweiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YongrendanweiEntity> page = this.selectPage(
                new Query<YongrendanweiEntity>(params).getPage(),
                new EntityWrapper<YongrendanweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YongrendanweiEntity> wrapper) {
		  Page<YongrendanweiView> page =new Query<YongrendanweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YongrendanweiVO> selectListVO(Wrapper<YongrendanweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YongrendanweiVO selectVO(Wrapper<YongrendanweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YongrendanweiView> selectListView(Wrapper<YongrendanweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YongrendanweiView selectView(Wrapper<YongrendanweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
