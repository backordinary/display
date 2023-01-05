package com.sf.entity;

import lombok.Data;

@Data
//回帖实体表
public class forumreplyEntity {
	public String replyid;//回复ID
	public String replyneirong;//回帖内容
	public String replytime;//回帖时间
	public String replyhand;//回帖人头像
	public String replytieziid;//回复帖子的ID
	public String replyname;//回复人的名字

}
