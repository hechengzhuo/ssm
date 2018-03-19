package com.ssm.serviveImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.CustomerMapper;
import com.ssm.model.Customer;
import com.ssm.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerDao;
	
	@Override
	public List<Customer> list() {
		return customerDao.selectByExample(null);
	}

}
