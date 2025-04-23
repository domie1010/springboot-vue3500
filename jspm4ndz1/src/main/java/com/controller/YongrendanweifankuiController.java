package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YongrendanweifankuiEntity;
import com.entity.view.YongrendanweifankuiView;

import com.service.YongrendanweifankuiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 用人单位反馈
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-07 10:33:42
 */
@RestController
@RequestMapping("/yongrendanweifankui")
public class YongrendanweifankuiController {
    @Autowired
    private YongrendanweifankuiService yongrendanweifankuiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YongrendanweifankuiEntity yongrendanweifankui, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yongrendanwei")) {
			yongrendanweifankui.setQiyezhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YongrendanweifankuiEntity> ew = new EntityWrapper<YongrendanweifankuiEntity>();
    	PageUtils page = yongrendanweifankuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yongrendanweifankui), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YongrendanweifankuiEntity yongrendanweifankui, 
		HttpServletRequest request){
        EntityWrapper<YongrendanweifankuiEntity> ew = new EntityWrapper<YongrendanweifankuiEntity>();
    	PageUtils page = yongrendanweifankuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yongrendanweifankui), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YongrendanweifankuiEntity yongrendanweifankui){
       	EntityWrapper<YongrendanweifankuiEntity> ew = new EntityWrapper<YongrendanweifankuiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yongrendanweifankui, "yongrendanweifankui")); 
        return R.ok().put("data", yongrendanweifankuiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YongrendanweifankuiEntity yongrendanweifankui){
        EntityWrapper< YongrendanweifankuiEntity> ew = new EntityWrapper< YongrendanweifankuiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yongrendanweifankui, "yongrendanweifankui")); 
		YongrendanweifankuiView yongrendanweifankuiView =  yongrendanweifankuiService.selectView(ew);
		return R.ok("查询用人单位反馈成功").put("data", yongrendanweifankuiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YongrendanweifankuiEntity yongrendanweifankui = yongrendanweifankuiService.selectById(id);
        return R.ok().put("data", yongrendanweifankui);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YongrendanweifankuiEntity yongrendanweifankui = yongrendanweifankuiService.selectById(id);
        return R.ok().put("data", yongrendanweifankui);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YongrendanweifankuiEntity yongrendanweifankui, HttpServletRequest request){
    	yongrendanweifankui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yongrendanweifankui);

        yongrendanweifankuiService.insert(yongrendanweifankui);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YongrendanweifankuiEntity yongrendanweifankui, HttpServletRequest request){
    	yongrendanweifankui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yongrendanweifankui);

        yongrendanweifankuiService.insert(yongrendanweifankui);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YongrendanweifankuiEntity yongrendanweifankui, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yongrendanweifankui);
        yongrendanweifankuiService.updateById(yongrendanweifankui);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yongrendanweifankuiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YongrendanweifankuiEntity> wrapper = new EntityWrapper<YongrendanweifankuiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yongrendanwei")) {
			wrapper.eq("qiyezhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = yongrendanweifankuiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
