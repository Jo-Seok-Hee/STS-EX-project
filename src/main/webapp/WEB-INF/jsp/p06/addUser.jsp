<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	
	<script
  src="https://code.jquery.com/jquery-3.6.0.min.js"
  integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
  crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<title>서키서키</title>
</head>
<body>

	<h1>회원정보 추가</h1>
	<form method="post" action="/p06/ex01/addUser" id="joinForm">
		<label>이름</label><input type="text" name="name" id="nameInput"><br>
		<label>생년월일</label><input type="text" name="yyyyMMdd" id="yyyyMMddInput"><br>
		<label>자기소개</label><br>
		<textarea rows="10" cols="50" name="introduce" id="introduceInput"></textarea><br>
		<label>이메일 주소</label><input type="text" name="email" id="emailInput"><br>
		<button type="submit" class="btn btn-primary" id="submitBtn">추가</button>
	</form>
	<script>
		$(document).ready(function(){
			$("#joinForm").on("submit",function(){
				let name = $("#nameInput").val();
				let yyyyMMdd = $("#yyyyMMddInput").val();
				let introduce = $("#introduceInput").val();
				let email = $("#emailInput").val();
		
			
			if( name == ""){
				alert("이름을 입력하세요.");
				return false;
			}
			if( yyyyMMdd == ""){
				alert("생년월일을 입력하세요.");
				return false;
			}
			if( introduce == ""){
				alert("자기소개 항목을 입 입력하세요.");
				return false;
			}
			if( email== ""){
				alert("이메일을 입력하세요");
				return false;
			}
			
			$.ajax({
				type:"post",
				url:"/p06/ex01/addUser",
				data:{"name":name, "yyyyMMdd":yyyyMMdd, "introduce":introduce, "email":email},
				success:function(data){
					alert("입력 성공");	
				},
				error:function(){
					alert("에러 발쌩");
				}
				
			});
			
			return false;
			
			});
			
			
			
			
		});
	</script>
	
	
	
	
	
	
	
	
</body>
</html>