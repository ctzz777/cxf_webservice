/**
 * 
 */
package cxf.service.impl;

import cxf.bo.Customer;
import cxf.service.CustomerService;

/**
 * @author ted
 *
 */
public class CustomerServiceImpl implements CustomerService {

	/* (non-Javadoc)
	 * @see cxf.service.CustomerService#getCustomer()
	 */
	@Override
	public Customer getCustomer() {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setSeqNo(1L);
		customer.setName("CTzz");
		customer.setAge(23);
		return customer;
	}

	@Override
	public Customer getCustomerByName(String name) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setSeqNo(2L);
		customer.setName(name);
		customer.setAge(23);
		return customer;
	}

	@Override
	public Customer getCustomerByNamePath(String name) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setSeqNo(3L);
		customer.setName(name);
		customer.setAge(23);
		return customer;
	}

}
