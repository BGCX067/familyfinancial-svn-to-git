package com.google.code.p.familyfinancial.dao;


import org.springframework.stereotype.Repository;

import com.google.code.p.familyfinancial.domain.InOutItem;

@Repository("inOutItemDAO")
public class InOutItemDAOHibernate extends BaseDAOHibernate<InOutItem, Long> implements
		InOutItemDAO {
	
}
