package com.github.mahui53541.guitar.util;

import java.util.UUID;

public class UUIDUtil {
	/**
	 * uuid
	 * @author mahui
	 * @return string
	 */
	public static String generate(){
		String uuidString = UUID.randomUUID().toString();
		String idString = uuidString.replace("-","");
		return idString;
	}
}
