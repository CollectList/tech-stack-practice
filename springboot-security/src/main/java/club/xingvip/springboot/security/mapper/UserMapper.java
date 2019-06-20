package club.xingvip.springboot.security.mapper;

import club.xingvip.springboot.security.dos.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 描述
 *
 * @author weixing.yang
 * @version 1.1.0
 * @date 2019/6/19 12:54
 */
@Mapper
public interface UserMapper {

    @Select("select id , username , password from user where username = #{username}")
    User loadUserByUsername(@Param("username") String username);

}
