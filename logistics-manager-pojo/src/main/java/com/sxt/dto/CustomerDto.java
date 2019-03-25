package com.sxt.dto;

import com.sxt.pojo.Customer;

public class CustomerDto extends BasePage{
	private Customer customer;
	private String salesMan;	//业务员
	private String interval;	//常用区别
	private Integer orderNum;	//订单个数
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getSalesMan() {
		return salesMan;
	}
	public void setSalesMan(String salesMan) {
		this.salesMan = salesMan;
	}
	public String getInterval() {
		return interval;
	}
	public void setInterval(String interval) {
		this.interval = interval;
	}
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	
	@Override
	public String toString() {
		return "CustomerDto [customer=" + customer + ", salesMan=" + salesMan + ", interval=" + interval + ", orderNum="
				+ orderNum + "]";
	}
}
