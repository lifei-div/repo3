package com.itheima.service.Impl;

import com.itheima.dao.AccountDao;
import com.itheima.domaion.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 * User: 一只小菜鸟
 * Date:2020-10-29
 * Time:8:43
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }
}
