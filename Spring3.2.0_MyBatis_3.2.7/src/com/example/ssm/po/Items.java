package com.example.ssm.po;

import java.util.Date;

public class Items {
	
//	| id | name  | price | detail | pic   | createtime          |

	/**
	 * id
	 */
	private Integer id;
	/**
	 * ��Ʒ��
	 */
	private String name;
	/**
	 * �۸�
	 */
	private float price;
	/**
	 * ���
	 */
	private String detail;
	/**
	 * ͼƬ
	 */
	private String pic;
	/**
	 * ������
	 */
	private Date createtime;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getDetail() {
		return detail;
	}
	
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	public String getPic() {
		return pic;
	}
	
	public void setPic(String pic) {
		this.pic = pic;
	}
	
	public Date getCreatetime() {
		return createtime;
	}
	
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
	@Override
	public String toString() {
		return "items [id=" + id + ", name=" + name + ", price=" + price + ", detail=" + detail + ", pic=" + pic
				+ ", createtime=" + createtime + "]";
	}
	
}
