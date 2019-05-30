package cn.th.halfDynamicTransactionTemplate.Service.Impl;

import cn.th.halfDynamicTransactionTemplate.Dao.AccountDao;
import cn.th.halfDynamicTransactionTemplate.Service.Service;

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
