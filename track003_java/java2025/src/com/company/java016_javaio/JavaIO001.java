package com.company.java016_javaio;

import java.io.File;
import java.io.IOException;

public class JavaIO001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 경로체크
		String folder_rel="src/com/company/java016_javaio_ex/"; // 상대경로(현재작업 폴더기준)
		String folder_abs="C:\\file\\"; // 절대경로(시스템의 폴더기준-전체경로 C:\)
		String file_path="io001.txt";
		
		// 2. 폴더 + 파일 준비
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_path);
		
		
		try {
			if(!folder.exists()) {folder.mkdir();}
			if(!file.exists()) {file.createNewFile();}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("폴더준비완료");
	}
}