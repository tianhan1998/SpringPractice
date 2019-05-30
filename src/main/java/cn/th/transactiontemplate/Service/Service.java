package cn.th.transactiontemplate.Service;

import cn.th.transactiontemplate.Dao.AccountDao;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class Service {
    private AccountDao accountDao;
    private TransactionTemplate template;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    public void transfer(final String outer,final String inner,final Integer money){ //手动配置事物
        template.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.in(inner, money);
//                int i =1/0;
                accountDao.out(outer, money);
            }
        });
    }

    public void setTemplate(TransactionTemplate template) {
        this.template = template;
    }
}
