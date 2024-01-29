package com.my.type_handler_boot.vo;

public class Item {
	private int item_idx=0;
	private String name=null;
	private int user_idx=0;
	private String created_date=null;
	
	
	//join user
	private String id =null;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getItem_idx() {
		return item_idx;
	}
	public void setItem_idx(int item_idx) {
		this.item_idx = item_idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	
	
}
