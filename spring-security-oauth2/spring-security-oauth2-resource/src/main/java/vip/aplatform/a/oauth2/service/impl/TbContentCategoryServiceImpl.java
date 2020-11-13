package vip.aplatform.a.oauth2.service.impl;

import org.springframework.stereotype.Service;
import vip.aplatform.a.oauth2.mapper.TbContentCategoryMapper;
import vip.aplatform.a.oauth2.service.TbContentCategoryService;

import javax.annotation.Resource;

@Service
public class TbContentCategoryServiceImpl implements TbContentCategoryService {

    @Resource
    private TbContentCategoryMapper tbContentCategoryMapper;

}
