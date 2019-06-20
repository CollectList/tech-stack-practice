package club.xingvip.springboot.security.dos;

/**
 * 描述
 *
 * @author weixing.yang
 * @version 1.1.0
 * @date 2019/6/19 12:53
 */
public class RolePermisson {

    private String url;
    private String roleName;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
