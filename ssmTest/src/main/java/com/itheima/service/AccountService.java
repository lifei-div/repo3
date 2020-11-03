package com.itheima.service;

import com.itheima.domaion.Account;

import java.util.List;

/**
 * Description:
 * User: 一只小菜鸟
 * Date:2020-10-29
 * Time:8:42
 */
public interface AccountService {
    List<Account> findAll();

    void saveAccount(Account account);
}
