<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.invalidate();	//서버에 저장되어 있는 기록 싹다 지우세요
	out.println("<script> alert('로그아웃!'); location.href='login.jsp'; </script>");
%>>