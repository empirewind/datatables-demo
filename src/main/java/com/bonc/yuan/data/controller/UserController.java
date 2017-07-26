package com.bonc.yuan.data.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.bonc.yuan.data.dao.UserDao;
import com.bonc.yuan.data.entity.UserEntity;
import com.bonc.yuan.data.util.ResultPager;

@Controller
public class UserController {

    @Autowired
    private UserDao userDao;
    
    @RequestMapping(value ={"/"}, method = RequestMethod.GET)
    public String pagefunc(HttpServletRequest req, 
            Integer start, Integer length, String draw){
        Map<String, Object> resultMap = new HashMap<String, Object>();
        
        //添加排序规则
        Sort sort = setOrderData(req);
        
        //添加分页规则
        PageRequest pageRequest = null;
        if (start == 0) {
            pageRequest = ResultPager.buildPageRequest(start, length, sort);
        } else {
            pageRequest = ResultPager.buildPageRequest(start / length + 1, length, sort);
        }
        
        Page<UserEntity> UserEntities = userDao.findAll(pageRequest);
        resultMap.put("draw", draw);
        resultMap.put("recordsTotal", UserEntities.getTotalElements());
        resultMap.put("recordsFiltered", UserEntities.getTotalElements());
        resultMap.put("data", UserEntities.getContent());
        return JSON.toJSONString(resultMap, SerializerFeature.DisableCircularReferenceDetect);
    }
    
    public Sort setOrderData(HttpServletRequest req) {
        String order = req.getParameter("order[0][column]");//排序的列号  
        String orderDir = req.getParameter("order[0][dir]");//排序的顺序asc or desc 
        String orderColumn = req.getParameter("columns["+order+"][data]");
        Sort sort = new Sort("desc".equals(orderDir) ? Direction.DESC : Direction.ASC, orderColumn);
        return sort;
    }
}
