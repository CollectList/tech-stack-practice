package vip.aplatform.a.oauth2.config.service;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import vip.aplatform.a.oauth2.domain.TbPermission;
import vip.aplatform.a.oauth2.domain.TbUser;
import vip.aplatform.a.oauth2.service.TbPermissionService;
import vip.aplatform.a.oauth2.service.TbUserService;

import java.util.List;

/**
 *
 * <p>Title: UserDetailsServiceImpl</p>
 * <p>
 *     Description: 自定义用户认证与授权
 * </p>
 *
 * @author weixing.yang
 * @version 1.0.1
 * @date 2020/11/13 20:10
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private TbUserService tbUserService;

    @Autowired
    private TbPermissionService tbPermissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 查询用户信息
        TbUser tbUser = tbUserService.getByUsername(username);
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        if (tbUser != null) {
            // 获取用户授权
            List<TbPermission> tbPermissions = tbPermissionService.selectByUserId(tbUser.getId());

            // 声明用户授权
            tbPermissions.forEach(tbPermission -> {
                if (tbPermission != null && tbPermission.getEnname() != null) {
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                    grantedAuthorities.add(grantedAuthority);
                }
            });
        }

        // 由框架完成认证工作
        return new User(tbUser.getUsername(), tbUser.getPassword(), grantedAuthorities);

    }
}
