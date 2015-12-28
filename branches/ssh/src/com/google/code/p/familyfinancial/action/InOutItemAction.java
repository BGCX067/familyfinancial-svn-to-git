package com.google.code.p.familyfinancial.action;


import com.google.code.p.familyfinancial.domain.InOutItem;
import com.google.code.p.familyfinancial.service.InOutItemService;

public class InOutItemAction extends ActionBase  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8420354053367086701L;
	private InOutItem item;
	private InOutItemService itemService;
	
	public InOutItem getItem() {
		return item;
	}

	public void setItem(InOutItem item) {
		this.item = item;
	}

	public InOutItemService getItemService() {
		return itemService;
	}

	public void setItemService(InOutItemService itemService) {
		this.itemService = itemService;
	}

	
	public String list()
	{
		return SUCCESS;
	}
	
	public String store()
	{
		System.out.println(item);
		itemService.createItem(item);
		return SUCCESS;
	}
}
