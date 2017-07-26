/*
 * 文件名：UserEntity.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Hello World
 * 修改时间：2017年7月26日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.bonc.yuan.data.entity;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Hello World
 * @version 2017年7月26日
 * @see UserEntity
 * @since
 */

public class UserEntity {

    private Long id;
    
    private String name;
    
    private Integer age;
    
    private String addr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public UserEntity(Long id, String name, Integer age, String addr) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.addr = addr;
    }
    
    
}
