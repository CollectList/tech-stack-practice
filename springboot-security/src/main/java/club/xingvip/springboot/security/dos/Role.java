package club.xingvip.springboot.security.dos;

import org.springframework.security.core.GrantedAuthority;

/**
 * 描述
 *
 * @author weixing.yang
 * @version 1.1.0
 * @date 2019/6/19 11:59
 */
public class Role implements GrantedAuthority {

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAuthority() {
        return name;
    }
}
