package com.sf.entity;

import lombok.Data;

@Data
//帖子实体表
public class forumEntity {
		public String forumID;//文章ID
		public String forumBT;//文章标题
		public String forummessage;//文章内容
		public String forumuserName;//发布人名字
		public String forumTime;//发布时间
		public String forumliebie;//发布类别
		public String forumAmount;//帖子浏览量
		public String firumhand;//头像
}
