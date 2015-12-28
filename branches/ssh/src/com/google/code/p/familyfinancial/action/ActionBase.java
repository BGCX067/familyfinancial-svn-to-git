package com.google.code.p.familyfinancial.action;

import java.lang.reflect.ParameterizedType;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public abstract class ActionBase extends ActionSupport {
	 
	 final String SUCCESS = "success";
     final String NONE    = "none";
     final String ERROR   = "error";
     final String INPUT   = "input";
     final String LOGIN   = "login";
     
     private String target;

     public String getTarget() {
             return target;
     }

     public void setTarget(String target) {
             this.target = target;
     }

     protected String success(String _target)
     {
             setTarget(_target);
             return SUCCESS;
     }
     
     protected String error(String _target)
     {
             setTarget(_target);
             return ERROR;
     }
}
