package com.github.mahui53541.guitar.pojo;
/**
 * 构造制造商的枚举
 * <p>
 * Description:
 * </p>
 */
public enum Builder {
	JIANGSU("jiangsu"),SHANGHAI("shanghai"),SHANDONG("shandong");
	private String value;

	private Builder(String value) {
		this.value = value;
	}

	public String toString(){
		return value;
	}
}
