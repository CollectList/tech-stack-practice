package vip.aplatform.a.oauth2.service;

import vip.aplatform.a.oauth2.domain.TbUser;

public interface TbUserService {
    default TbUser getByUsername(String username) {
        return null;
    }
}
