package com.boot.crud;

public class Item {
	
	private int itemno;
	private String itemdesc;
	private float itemprice;
	
	public Item() {
		super();
	}

	public Item(int itemno, String itemdesc, float itemprice) {
		super();
		this.itemno = itemno;
		this.itemdesc = itemdesc;
		this.itemprice = itemprice;
	}

	public int getItemno() {
		return itemno;
	}

	public void setItemno(int itemno) {
		this.itemno = itemno;
	}

	public String getItemdesc() {
		return itemdesc;
	}

	public void setItemdesc(String itemdesc) {
		this.itemdesc = itemdesc;
	}

	public float getItemprice() {
		return itemprice;
	}

	public void setItemprice(float itemprice) {
		this.itemprice = itemprice;
	}
	
	

}
