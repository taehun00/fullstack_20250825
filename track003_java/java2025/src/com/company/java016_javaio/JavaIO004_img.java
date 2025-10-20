package com.company.java016_javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class JavaIO004_img {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// #1. 경로
		String origin="src/com/company/java016_javaio_ex/KakaoTalk_20251020_113632177.jpg";
		String target1="src/com/company/java016_javaio_ex/KakaoTalk_20251020_1136321771.jpg";
		String target2="src/com/company/java016_javaio_ex/KakaoTalk_20251020_1136321772.jpg";
		
		
		// #2. byte 이미지파일 원본 읽어들여서 쓰기
		// .jpg → 1.jpg
		// InputStream > [프로그램] > OutputStream
		InputStream bis = new FileInputStream(origin);
		OutputStream bos = new FileOutputStream(target1);
		
		int cnt1 = 0;
		while((cnt1 = bis.read()) != -1) {
			bos.write((byte)cnt1);			// 1.jpg 쓰기
		}
		bos.flush(); bos.close(); bis.close();
		
		// #3. char 이미지파일 원본 읽어들여서 쓰기
		// .jpg → 2.jpg
		// Reader > [프로그램] > Writer
		Reader cr = new FileReader(origin);
		Writer cw = new FileWriter(target2);
		
		int cnt2 = 0;
		while((cnt2 = cr.read()) != -1) {
			cw.write((char)cnt2);
		}
		cw.flush(); cw.close(); cr.close();
		
		
	}

}
