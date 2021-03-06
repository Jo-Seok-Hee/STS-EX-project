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

<title>페이보릿</title>
</head>
<body>

	<div class="container">
		
			<h1>즐겨 찾기 추가하기</h1>
			<label>제목</label><br><input type="text" id="nameInput" name="name" class="form-control"><br>
			<label>주소</label><br>
			<div class="input-group mb-3">
			    
			    <input type="text" class="form-control" id="urlInput" name="url" >
			    <div class="input-group-append">
			        <button class="btn btn-success" type="button" id="checkUrl">중복확인</button>
			    </div>
			</div>
			
			<div id="duplicateAlarm"></div>
			<br>
			<button type="button" class="btn btn-primary" id="addFavorites">추가</button>
		
	</div>
	
	
	<script>
	
		$(document).ready(function(){
			
			$("#addFavorites").on("click",function(){
				let name = $("#nameInput").val();
				let url = $("#urlInput").val();
				
				
				if( name == ""){
					alert("사이트 이름을 입력하세요");
					return ;
				}
				if( url == ""){
					alert("주소를 입력하세요");
					return ;
				}
				if( !(url.startsWith("http://") || url.startsWith("https://"))){
					alert("주소형식이 틀렸습니다.");
					return ;
				}
			
				$.ajax({
					type:"post",
					url:"/p06/pr01/addFavorites",
					data:{"name":name, "url":url},
					success:function(data){
						alert("입력 성공");
					},
					error:function(){
						alert("에러 발생");
					}
				});
				
				return location.href = "/p06/pr01/select";
				
			});
			
			$("#checkUrl").on("click",function(){

				let url = $("#urlInput").val();
				let name = $("#nameInput").val();
				
				if( name == ""){
					alert("사이트 이름을 입력하세요");
					return ;
				}
				
				if( url ==  ""){
					alert("url을 입력하세요.");
					return ;
				}
				
				if( !(url.startsWith("http://") || url.startsWith("https://"))){
					alert("주소형식이 틀렸습니다.");
					return ;
				}
				 
				
				
				$.ajax({
					
					//tudse
					type:"post",
					url:"/p06/pr01/duplicate",
					data:{"url":url},
					success:function(data){
						
						
						if(data == "success"){
							$("#duplicateAlarm").removeClass("text-danger");
							$("#duplicateAlarm").html("사용 가능한 url 입니다");
							$("#duplicateAlarm").addClass("text-primary");
							$("#duplicateAlarm").show();
							
							
						} else {
							$("#duplicateAlarm").removeClass("text-primary");
							$("#duplicateAlarm").html("중복된 url 입니다");
							$("#duplicateAlarm").addClass("text-danger");
							$("#duplicateAlarm").show();
							
							
							
						}
						
						
						
					},
					error:function(){
						alert("에러 발생.");

					}						
				});
				
				return ;
				
				
				
				
			})
			
			
			

		});
	
	
	
	
	
	</script>
	
	
</body>
</html>