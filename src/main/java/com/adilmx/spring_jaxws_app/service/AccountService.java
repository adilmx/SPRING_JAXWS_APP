package com.adilmx.spring_jaxws_app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.adilmx.spring_jaxws_app.entity.Account;


public interface AccountService {
	public Account saveAccount(Account account);
	public Account getAccount(Long id);
	public List<Account> getAllAccounts();
	public void virement(double mt,Long acc_src,long acc_dest);
}
