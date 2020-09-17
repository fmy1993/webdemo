package com.goose.zhongkai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goose.zhongkai.dao.IPageDAO;
import com.goose.zhongkai.entity.Page;

@Service
public class PageService implements IPageService {
	
	@Autowired
	private IPageDAO Ipagedao;
	private int PageAmount;
	private int DataAmount;
	private Page page;
	final int PAGESIZE=10;
	@Override
	public int getTotalNum() {
		DataAmount=Ipagedao.getDataNum();
		return DataAmount;
	}

	@Override
	public int getTotalPage(int PageNum) {
		getTotalNum();
		int remainder=DataAmount%PageNum;
		
		PageAmount=(remainder==0)?DataAmount/PageNum:DataAmount/PageNum+1;
				//((getTotalNum()/PageNum)+1);//assignment PageAmount
		return PageAmount;
	}

	@Override
	public Page initPage(int Page_Amount) {
		page=new Page();//init
		getTotalPage(PAGESIZE);
		page.setTotalP(this.PageAmount);//pageAmont store the total in getTotalPage()
		page.setTotalAmount(this.DataAmount);
		return page;
	}

}
