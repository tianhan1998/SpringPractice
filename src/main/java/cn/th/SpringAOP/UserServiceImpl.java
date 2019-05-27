package cn.th.SpringAOP;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("addUser");
    }

    @Override
    public void deleteUser() {
        System.out.println("deleteUser");
    }

    @Override
    public void updateUser() {
        System.out.println("updateUser");
    }
}
