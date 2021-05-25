package cn.kgc.demo.service;

import cn.kgc.demo.pojo.ReplyDetail;
import com.github.pagehelper.PageInfo;

public interface DemoService {

    //根据搜索条件进行分页查询帖子列表
    PageInfo findInvitationByPage(String searchName, Integer pageNum, Integer pageSize);

    //根据帖子id分页查看回复信息列表
    PageInfo findReplyDetailByPage(Integer invId, Integer pageNum, Integer pageSize);

    boolean saveReplyDetail(ReplyDetail replyDetail);

    boolean removeInvAndReplyDetailById(Integer invId);
}
