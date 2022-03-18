package com.adilmx.spring_jaxws_app;

import com.adilmx.spring_jaxws_app.entity.Account;
import com.adilmx.spring_jaxws_app.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SpringJaxwsAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringJaxwsAppApplication.class, args);
    }

    @Autowired
    AccountService accountService;

    @Override
    public void run(String... args) throws Exception {
        accountService.saveAccount(new Account(null, 1000, new Date(), false));
        accountService.saveAccount(new Account(null, 2000, new Date(), false));
        accountService.saveAccount(new Account(null, 3000, new Date(), false));
        List<Account> accounts = accountService.getAllAccounts();
        accounts.forEach(acc -> {
            System.out.println(acc);
        });
    }

}
