package com.adilmx.spring_jaxws_app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adilmx.spring_jaxws_app.dao.AccountRepo;
import com.adilmx.spring_jaxws_app.entity.Account;
import com.adilmx.spring_jaxws_app.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	AccountRepo accountRepo;

	@Override
	public Account getAccount(Long id) {
		return accountRepo.findById(id).get();
	}

	@Override
	public List<Account> getAllAccounts() {
		return accountRepo.findAll();
	}

	@Override
	public void virement(double mt, Long acc_src, long acc_dest) {
		Account accountSrc = accountRepo.findById(acc_src).get();
		accountSrc.setSolde(accountSrc.getSolde() - mt);
		Account accountDest = accountRepo.findById(acc_dest).get();
		accountDest.setSolde(accountDest.getSolde() + mt);
	}

	@Override
	public Account saveAccount(Account account) {
		return accountRepo.save(account);
	}

	

}
