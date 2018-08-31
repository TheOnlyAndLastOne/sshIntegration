package com.own.ssh.dao.impl;

import com.own.ssh.dao.CustomerDao;
import com.own.ssh.domain.Customer;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * @Author: zhaozhi
 * @Date: 2018/8/21 0021 10:41
 * @Description:
 */
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
    @Override
    public void save(Customer customer) {
        System.out.println("dao中save()方法执行了");
        System.out.println(customer);
        this.getHibernateTemplate().save(customer);
    }
}
