package com.sxt.dto;

public class BasePage {
	protected int pageNum=1;//当前页
	protected int pageSize=10;//每页显示的条数
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	@Override
	public String toString() {
		return "BasePage [pageNum=" + pageNum + ", pageSize=" + pageSize + "]";
	}
}
