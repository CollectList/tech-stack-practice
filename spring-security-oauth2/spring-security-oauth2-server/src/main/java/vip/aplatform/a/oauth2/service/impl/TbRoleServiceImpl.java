package vip.aplatform.a.oauth2.service.impl;

import org.springframework.stereotype.Service;
import vip.aplatform.a.oauth2.mapper.TbRoleMapper;
import vip.aplatform.a.oauth2.service.TbRoleService;

import javax.annotation.Resource;

@Service
public class TbRoleServiceImpl implements TbRoleService {

    @Resource
    private TbRoleMapper tbRoleMapper;
}
