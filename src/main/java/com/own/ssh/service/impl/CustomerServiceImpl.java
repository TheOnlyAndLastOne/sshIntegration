package com.own.ssh.service.impl;

import com.own.ssh.dao.CustomerDao;
import com.own.ssh.domain.Customer;
import org.springframework.transaction.annotation.Transactional;
import com.own.ssh.service.CustomerService;

/**
 * @Author: zhaozhi
 * @Date: 2018/8/21 0021 10:40
 * @Description:
 */
@Transactional
public class CustomerServiceImpl implements CustomerService {
    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void save(Customer customer) {
        System.out.println("service中save()方法执行");
        customerDao.save(customer);
    }
}
