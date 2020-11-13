package vip.aplatform.a.oauth2.service;

import vip.aplatform.a.oauth2.domain.TbPermission;

import java.util.List;

public interface TbPermissionService {

    default List<TbPermission> selectByUserId(Long userId) {
        return null;
    }
}
