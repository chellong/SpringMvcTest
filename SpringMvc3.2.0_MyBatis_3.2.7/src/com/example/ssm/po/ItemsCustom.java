package com.example.ssm.po;

public class ItemsCustom extends Items {

	@Override
	public String toString() {
		return "ItemsCustom [getId()=" + getId() + ", getName()=" + getName() + ", getPrice()=" + getPrice()
				+ ", getPic()=" + getPic() + ", getCreatetime()=" + getCreatetime() + ", getDetail()=" + getDetail()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
