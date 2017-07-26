/*
 * 文件名：UserDao.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Hello World
 * 修改时间：2017年7月26日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.bonc.yuan.data.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.bonc.yuan.data.entity.UserEntity;

@Transactional
public interface UserDao extends PagingAndSortingRepository<UserEntity, Long>{

}
