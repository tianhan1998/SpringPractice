package cn.th.jdbctemplate.dao;

import cn.th.jdbctemplate.entity.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class UserDao extends JdbcDaoSupport{
    public List findAll(){
        String sql="select * from users";
        return this.getJdbcTemplate().query(sql,new BeanPropertyRowMapper(User.class));
    }
    public void update(User user){
        String sql="update users set username=?,password=?,email=?,birthday=? where id=?";
        Object[] args={user.getUsername(),user.getPassword(),user.getEmail(),user.getBirthday(),user.getId()};
        this.getJdbcTemplate().update(sql,args);
    }
    public User find(int id){
        return (User) this.getJdbcTemplate().queryForObject("select * from users where id = ?",new BeanPropertyRowMapper(User.class),id);
    }
    public boolean delete(int id){
        int zz=this.getJdbcTemplate().update("delete from users where id = ?",id);
        if(zz>0)
            return true;
        else
            return false;
    }
    public boolean insert(User user) {
        Object[] args = {user.getUsername(), user.getPassword(), user.getEmail(), user.getBirthday()};
        int zz = this.getJdbcTemplate().update("insert into users(username,password,email,birthday) values(?,?,?,?)", args);
        if (zz > 0)
            return true;
        else
            return false;
    }

}
