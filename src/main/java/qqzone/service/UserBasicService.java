package qqzone.service;

import qqzone.dao.UserBasicDAO;
import qqzone.pojo.UserBasic;

import java.util.List;

public interface UserBasicService {
    UserBasic login(String loginId , String pwd );
    List<UserBasic> getFriendList(UserBasic userBasic);
}
