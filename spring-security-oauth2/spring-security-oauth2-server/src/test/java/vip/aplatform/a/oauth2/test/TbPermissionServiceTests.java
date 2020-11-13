package vip.aplatform.a.oauth2.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import vip.aplatform.a.oauth2.OAuth2ServerApplication;
import vip.aplatform.a.oauth2.service.TbPermissionService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OAuth2ServerApplication.class)
public class TbPermissionServiceTests {

    @Autowired
    private TbPermissionService tbPermissionService;

    @Test
    public void testSelectByUserId() {
        tbPermissionService.selectByUserId(37L).forEach(tbPermission -> System.out.println(tbPermission));
    }
}