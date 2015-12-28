package com.google.code.p.familyfinancial.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.code.p.familyfinancial.dao.InOutItemDAO;
import com.google.code.p.familyfinancial.domain.InOutItem;


@Controller
@RequestMapping(value="/item")
public class InOutItemController {
	

	@RequestMapping(method=RequestMethod.GET)
	public String getCreateForm(Model model) {
		model.addAttribute(new InOutItem());
		return "item/createForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String create(@Valid InOutItem item, BindingResult result) {
		if (result.hasErrors()) {
			return "item/createForm";
		}
		inOutItemDAO.makePersistent(item);
		return "redirect:/account/" + item.getId();
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public String getView(@PathVariable Long id, Model model) {
		InOutItem item = null;
		model.addAttribute(item);
		return "account/view";
	}
	
	private InOutItemDAO inOutItemDAO;
	
	public InOutItemDAO getInOutItemDAO() {
		return inOutItemDAO;
	}
	
	@Autowired 
	public void setInOutItemDAO(InOutItemDAO inOutItemDAO) {
		this.inOutItemDAO = inOutItemDAO;
	}
}
