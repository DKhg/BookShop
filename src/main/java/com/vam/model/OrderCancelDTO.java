package com.vam.model;

public class OrderCancelDTO {
	
	private String memberId;
	
	private String orderId;
	
	//주문취소 완료후 사용자가 있었떤 페이지로 리다이렉트 되도록 할거라서
	//기종늬 페이지로 가기위해서는 페이징 정보가 필요하다
	
	private String keyword;
	
	private int amount;
	
	private int pageNum;

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	@Override
	public String toString() {
		return "OrderCancelDTO [memberId=" + memberId + ", orderId=" + orderId + ", keyword=" + keyword + ", amount="
				+ amount + ", pageNum=" + pageNum + "]";
	}
	
	
}
