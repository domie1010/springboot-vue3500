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


import com.dao.XueshengjiuyefankuiDao;
import com.entity.XueshengjiuyefankuiEntity;
import com.service.XueshengjiuyefankuiService;
import com.entity.vo.XueshengjiuyefankuiVO;
import com.entity.view.XueshengjiuyefankuiView;

@Service("xueshengjiuyefankuiService")
public class XueshengjiuyefankuiServiceImpl extends ServiceImpl<XueshengjiuyefankuiDao, XueshengjiuyefankuiEntity> implements XueshengjiuyefankuiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengjiuyefankuiEntity> page = this.selectPage(
                new Query<XueshengjiuyefankuiEntity>(params).getPage(),
                new EntityWrapper<XueshengjiuyefankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengjiuyefankuiEntity> wrapper) {
		  Page<XueshengjiuyefankuiView> page =new Query<XueshengjiuyefankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengjiuyefankuiVO> selectListVO(Wrapper<XueshengjiuyefankuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengjiuyefankuiVO selectVO(Wrapper<XueshengjiuyefankuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengjiuyefankuiView> selectListView(Wrapper<XueshengjiuyefankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengjiuyefankuiView selectView(Wrapper<XueshengjiuyefankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
