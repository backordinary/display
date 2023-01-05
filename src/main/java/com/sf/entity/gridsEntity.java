package com.sf.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//商品实体表
public class gridsEntity {
	public String gridsID;//商品ID
	public String girdsName;//商品名字
	public String girdsjiage;//商品价格
	public String girdsimg;//商品图片地址
	public int girdskucun;//商品库存

	
}
