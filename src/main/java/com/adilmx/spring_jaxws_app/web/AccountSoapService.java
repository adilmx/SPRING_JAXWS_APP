package com.adilmx.spring_jaxws_app.web;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.adilmx.spring_jaxws_app.entity.Account;
import com.adilmx.spring_jaxws_app.service.AccountService;

@Component
@WebService(serviceName = "AccountWS")
public class AccountSoapService {
	@Autowired
	AccountService accountService;
	
	@WebMethod
	public Account saveAccount(@WebParam Account account) {
		return accountService.saveAccount(account);
	}
	@WebMethod
	public Account getAccount(@WebParam Long id) {
		return accountService.getAccount(id);
	}
	@WebMethod
	public List<Account> getAllAccounts(){
		return accountService.getAllAccounts();
	}
	@WebMethod
	public void virement(@WebParam double mt,@WebParam Long acc_src,@WebParam long acc_dest) {
		accountService.virement(mt, acc_src, acc_dest);
	}

}
