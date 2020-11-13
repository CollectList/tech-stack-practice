package vip.aplatform.a.oauth2.service.impl;

import org.springframework.stereotype.Service;
import vip.aplatform.a.oauth2.domain.TbPermission;
import vip.aplatform.a.oauth2.mapper.TbPermissionMapper;
import vip.aplatform.a.oauth2.service.TbPermissionService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService {

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }
}
