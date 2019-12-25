package com.funtl.oauth2.server.service;

import com.funtl.oauth2.server.domain.TbUser;

public interface TbUserService{

    TbUser getByUserName(String username);


}
