package club.xingvip.springboot.security.service;

import club.xingvip.springboot.security.dos.Role;
import club.xingvip.springboot.security.dos.User;
import club.xingvip.springboot.security.mapper.RoleMapper;
import club.xingvip.springboot.security.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述
 *
 * @author weixing.yang
 * @version 1.1.0
 * @date 2019/6/19 12:41
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        //查数据库
        User user = userMapper.loadUserByUsername( userName );
        if (null != user) {
            List<Role> roles = roleMapper.getRolesByUserId( user.getId() );
            user.setAuthorities( roles );
        }

        return user;
    }
}
