package com.basic.careernet.bsy.util;

import lombok.Data;

@Data //getter,setter,toString
public class Criteria {

	
	private int page;//조회하는 페이지
	private int amount;//데이터 개수
	
	//검색에 필요한 키워드를 선언
	private String searchName;
	private String searchContent;
	private String searchPrice;
	private String startDate;
	private String endDate;
	
	
	//기본생성자는 1,10 default값
	public Criteria() {
		this.page=1;
		this.amount=9;
	}
	//입력값이 있으면 전달받은 값으로 조회
	public Criteria (int page,int amount) {
		this.page=page;
		this.amount=amount;
	}
	
	//페이지시작을 지정하는 getter
	public int getPageStart() {return (page-1)*amount;}
}
