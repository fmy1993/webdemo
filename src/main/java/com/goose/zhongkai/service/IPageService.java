package com.goose.zhongkai.service;

import com.goose.zhongkai.entity.Page;

public interface IPageService {
	public int getTotalNum();
	public int getTotalPage(int PageNum);
	public Page initPage(int PageAmount);
}
