package qqzone.service.impl;

import qqzone.dao.TopicDAO;
import qqzone.pojo.Topic;
import qqzone.pojo.UserBasic;
import qqzone.service.TopicService;

import java.util.List;

public class TopicServiceImpl implements TopicService {

    private TopicDAO topicDAO = null ;

    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return topicDAO.getTopicList(userBasic);
    }
}
