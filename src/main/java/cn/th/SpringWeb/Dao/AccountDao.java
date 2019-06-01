package cn.th.SpringWeb.Dao;

public interface AccountDao {
    public void in(String inner, Integer money);
    public void out(String outer, Integer money);
}
