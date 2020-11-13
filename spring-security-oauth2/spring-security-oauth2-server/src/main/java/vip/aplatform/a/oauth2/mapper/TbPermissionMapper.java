package vip.aplatform.a.oauth2.mapper;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;
import vip.aplatform.a.oauth2.domain.TbPermission;

import java.util.List;

public interface TbPermissionMapper extends MyMapper<TbPermission> {

    List<TbPermission> selectByUserId(@Param("userId") Long userId);
}
