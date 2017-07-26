/*
 * 文件名：DataConstant.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Hello World
 * 修改时间：2017年7月26日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.bonc.yuan.data.contant;

import java.util.ArrayList;
import java.util.List;

import com.bonc.yuan.data.entity.UserEntity;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Hello World
 * @version 2017年7月26日
 * @see DataConstant
 * @since
 */

public class DataConstant {

    static List<UserEntity> userEntities = new ArrayList<UserEntity>();
    
    static{
        userEntities.add(new UserEntity(1L, "张三", 30, "北京市大兴区"));
        userEntities.add(new UserEntity(2L, "李四", 31, "北京市望京大厦"));
        userEntities.add(new UserEntity(3L, "王五", 31, "北京市望京大厦东边"));
        userEntities.add(new UserEntity(4L, "张五", 31, "北京市BONC大厦东边"));
        userEntities.add(new UserEntity(5L, "李五", 31, "北京市BONC大厦南边"));
        userEntities.add(new UserEntity(6L, "小刘", 31, "北京市BONC大厦西边"));
    }
}
