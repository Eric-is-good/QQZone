package qqzone.service;

import qqzone.pojo.Reply;
import qqzone.pojo.Topic;

import java.util.List;

public interface ReplyService {
    //根据topic的id获取关联的所有的回复
    List<Reply> getReplyListByTopicId(Integer topicId);
    //添加回复
    void addReply(Reply reply);
    //删除指定的回复
    void delReply(Integer id);
    //删除指定的日志关联的所有的回复
    void delReplyList(Topic topic);
}
