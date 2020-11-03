package com.itheima.dao;

import com.itheima.domaion.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description:
 * User: 一只小菜鸟
 * Date:2020-10-29
 * Time:8:36
 */
@Repository
public interface AccountDao {

    @Select("select * from account")
    List<Account>findAll();

    @Insert("insert into account(name,money)values(#{name},#{money})")
    void saveAccount(Account account);
}
