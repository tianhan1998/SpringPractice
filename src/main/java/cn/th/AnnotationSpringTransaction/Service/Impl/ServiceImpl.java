package cn.th.AnnotationSpringTransaction.Service.Impl;

import cn.th.AnnotationSpringTransaction.Dao.AccountDao;
import cn.th.AnnotationSpringTransaction.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Repository
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
