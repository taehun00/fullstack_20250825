<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../inc/header.jsp" %>

<div class="container card my-5 p-4">
    <h3 class="card-header">👤 사용자 정보</h3>

    <table class="table table-bordered table-hover mt-3">
        <caption>회원 정보</caption>
        <thead>
            <tr>
                <th scope="col">PETID</th>
                <th scope="col">USERID</th>
                <th scope="col">PETNAME</th>
                <th scope="col">PETBREED</th>
                <th scope="col">BIRTHDATE</th>
                <th scope="col">PETTYPEID</th>
                <th scope="col">CREATEDAT</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>${dto.petid}</td>
                <td>${dto.userid}</td>
                <td>${dto.petname}</td>
                <td>${dto.petbreed}</td>
                <td>${dto.birthdate}</td>
                <td>${dto.pettypeid}</td>
                <td>${dto.createdat}</td>
            </tr>
        </tbody>
    </table>

    <div class="mt-4 text-end">
    
    </div>
</div>

<%@ include file="../inc/footer.jsp" %>