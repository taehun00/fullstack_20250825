package com.company.java016_javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class Network003_naver_news {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//#1. URL
			String apiurl;
			apiurl = "https://openapi.naver.com/v1/search/blog.json?query="
					+ URLEncoder.encode("캄보디아", "UTF-8");
			URL url = new URL(apiurl);
			//#2. HttpURLConnection
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			//#3. 요청설정 - GET
			conn.setRequestMethod("GET");
			conn.setRequestProperty("X-Naver-Client-Id", "vszpQTIkeBrK47AJDlYy");
			conn.setRequestProperty("X-Naver-Client-Secret", "a6svoZR1gH");
			
			//#4. 응답확인
			BufferedReader br;
			
			if(conn.getResponseCode() == 200) {
				br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			}else {
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			
			//#5. 응답데이터
			String line="";
			StringBuffer sb = new StringBuffer();
			while((line = br.readLine()) != null) {
				sb.append(line + "\n");
			}
			System.out.println(sb.toString());
			br.close(); conn.disconnect();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
