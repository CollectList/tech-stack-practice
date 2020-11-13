package vip.aplatform.a.oauth2.service.impl;

import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import vip.aplatform.a.oauth2.domain.TbUser;
import vip.aplatform.a.oauth2.mapper.TbUserMapper;
import vip.aplatform.a.oauth2.service.TbUserService;

import javax.annotation.Resource;

@Service
public class TbUserServiceImpl implements TbUserService {

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getByUsername(String username) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username", username);
        return tbUserMapper.selectOneByExample(example);
    }
}
