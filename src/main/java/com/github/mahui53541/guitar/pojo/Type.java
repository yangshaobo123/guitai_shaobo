package com.github.mahui53541.guitar.pojo;

/**
 * 构造一个吉他种类枚举
 * <p>
 * Description:
 * </p>
 */
public enum Type {
	ACOUSTIC("acoustic"),ELECTRIC("electric"),UNSPECIFIED("unspecified");
	private String value;

	private Type(String value) {
		this.value = value;
	}

	public String toString(){
		return value;
	}
}
