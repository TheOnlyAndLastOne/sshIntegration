package com.own.ssh.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.own.ssh.domain.Customer;
import com.own.ssh.service.CustomerService;

/**
 * @Author: zhaozhi
 * @Date: 2018/8/21 0021 10:37
 * @Description:
 */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
    private Customer customer = new Customer();
    @Override
    public Customer getModel() {
        return customer;
    }

    private CustomerService customerService;
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    //保存客户
    public String save(){
        System.out.println("action中save方法执行了");
        customerService.save(customer);
        return NONE;
    }
}
