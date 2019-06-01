package cn.th.SpringWeb.Service.Impl;

import cn.th.SpringWeb.Dao.AccountDao;
import cn.th.SpringWeb.Service.Service;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
public class ServiceImpl implements Service {
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    private AccountDao accountDao;
    public void transfer(String outer,String inner,Integer money){
                accountDao.in(inner, money);
//                int i =1/0;
                accountDao.out(outer, money);
    }

}
