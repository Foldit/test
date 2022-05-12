package com.yrg.dao;

import com.yrg.model.Dept;

///**
// * @Mapper 告诉Mybatis这是dao接口 创建此接口的代理对象
// */
//@Mapper
public interface DeptDao {
    Dept selectById(Integer deptno);
}
