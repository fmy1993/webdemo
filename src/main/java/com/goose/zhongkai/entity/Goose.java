package com.goose.zhongkai.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Goose {
	private int id;
	
	private String neckringid;
	
	private String eggarea;
	
	private int eggamount;
	
	private int ideletetag;
	
	private Page page;

	public Goose(){
		
	}
	
	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		
		if(page==null)
			page = new Page();
		else	
			this.page = page;			
		
	}
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNeckringid() {
		return neckringid;
	}

	public void setNeckringid(String neckringid) {
		this.neckringid = neckringid;
	}

	public String getEggarea() {
		return eggarea;
	}

	public void setEggarea(String eggarea) {
		this.eggarea = eggarea;
	}

	public int getEggamount() {
		return eggamount;
	}

	public void setEggamount(int eggamount) {
		this.eggamount = eggamount;
	}

	public int getIdeletetag() {
		return ideletetag;
	}

	public void setIdeletetag(int ideletetag) {
		this.ideletetag = ideletetag;
	}
}
