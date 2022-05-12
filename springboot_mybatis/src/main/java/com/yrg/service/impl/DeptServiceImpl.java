package com.yrg.service.impl;

import com.yrg.dao.DeptDao;
import com.yrg.model.Dept;
import com.yrg.service.DeptService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptDao deptDao;

    /**
     *
     * @Transactional 表示方法有事务支持
     * 默认：使用数据库隔离级别 REQUIRED 传播行为 超时时间 -1
     * 抛出运行时异常，回滚事务
     */
    @Transactional
    @Override
    public Dept queryDept(Integer deptno) {
        Dept dept = deptDao.selectById(deptno);
        return dept;
    }
}
