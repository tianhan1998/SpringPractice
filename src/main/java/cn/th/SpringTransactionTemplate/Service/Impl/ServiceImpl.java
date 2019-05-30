package cn.th.SpringTransactionTemplate.Service.Impl;

import cn.th.SpringTransactionTemplate.Dao.AccountDao;
import cn.th.SpringTransactionTemplate.Service.Service;

public class ServiceImpl implements Service {
    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    public void transfer(String outer,String inner,Integer money){
                accountDao.in(inner, money);
//                int i =1/0;
                accountDao.out(outer, money);
    }

}
