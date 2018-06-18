package com.github.mahui53541.guitar.pojo;
/**
 * 构造一个木材种类枚举
 * <p>
 * Description:
 * </p>
 */
public enum Wood {
	CAMPHOR("camphor"),//樟木
	BRICH("birch"),//桦木
	KOREANPINE("koreanpine");//红松
	private String value;

	private Wood(String value) {
		this.value = value;
	}

	public String toString(){
		return value;
	}
}
