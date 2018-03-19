package com.ssm.daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssm.dao.BaseDao;
import com.ssm.dao.CustomerMapper;
import com.ssm.model.Customer;
import com.ssm.model.CustomerExample;
import com.ssm.model.CustomerExample.Criteria;

@Repository("customerDao")
public class CustomerMapperImpl extends BaseDao implements CustomerMapper {

	@Override
	public long countByExample(CustomerExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(CustomerExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Customer record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Customer record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Customer> selectByExample(CustomerExample example) {
		/*Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo("ÕÅÈý");*/
		return getSqlSession().selectList("com.ssm.dao.CustomerMapper.selectByExample");
	}

	@Override
	public Customer selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(Customer record, CustomerExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Customer record, CustomerExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Customer record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Customer record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
