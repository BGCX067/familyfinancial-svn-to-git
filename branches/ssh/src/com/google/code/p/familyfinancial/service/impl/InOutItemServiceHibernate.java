package com.google.code.p.familyfinancial.service.impl;

import com.google.code.p.familyfinancial.dao.InOutItemDAO;
import com.google.code.p.familyfinancial.domain.InOutItem;
import com.google.code.p.familyfinancial.service.InOutItemService;

public class InOutItemServiceHibernate implements InOutItemService{
	private InOutItemDAO inOutItemDAO;

	public InOutItemDAO getInOutItemDAO() {
		return inOutItemDAO;
	}

	public void setInOutItemDAO(InOutItemDAO inOutItemDAO) {
		this.inOutItemDAO = inOutItemDAO;
	}

	public InOutItem createItem( InOutItem item) {
		return inOutItemDAO.makePersistent(item);
	}
}
