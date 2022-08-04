<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쁘띠벤트 로그인 페이지</title>
<jsp:include page="include/header.jsp"></jsp:include>

<!--  로그인폼 -->
<link rel="stylesheet" href="../../resources/login/css/logincss.css"/>
<link rel="stylesheet" href="../../resources/login/css/util.css"/>


</head>
<body>

	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<form class="login100-form validate-form">
					<span class="login100-form-title p-b-75">
						Sign up
					</span>
					

					<div class="wrap-input100 validate-input m-b-80" data-validate="아이디를 확인부탁드립니다">
						<input class="input100" type="text" name="id">
						<span class="focus-input100" data-placeholder="아이디를 입력해주세요"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="비밀번호 확인 부탁드립니다">
						<span class="btn-show-pass">
							<i class="zmdi zmdi-eye"></i>
						</span>
						<input class="input100" type="password" name="pass">
						<span class="focus-input100" data-placeholder="비밀번호를 입력해주세요"></span>
					</div>
					
					<div class="wrap-input100 validate-input m-b-80" data-validate="비밀번호 확인 부탁드립니다">
						<span class="btn-show-pass">
							<i class="zmdi zmdi-eye"></i>
						</span>
						<input class="input100" type="password" name="pass-check">
						<span class="focus-input100" data-placeholder="비밀번호를 한번 더 입력해주세요"></span>
					</div>
					
					
					<div class="wrap-input100 validate-input" data-validate="이메일을 확인부탁드립니다" >
						<input class="input100" type="text" name="email">
						<span class="focus-input100" data-placeholder="이메일을 입력해주세요."></span>
					</div>
					
					<div class="wrap-input100 validate-input" data-validate="인증번호를 확인해주세요">
						<input class="input100" type="text" name="email-check">
						<span class="focus-input100" data-placeholder="인증번호 입력"></span>
					</div>
					
					
					
					
					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn">
								회원가입
							</button>
						</div>
					</div>
					
				
				</form>
				
				
			</div>
			<div class="position-absolute p-t-25">
					<div class="text-center">
							<a class="txt2" href="#">
								아이디찾기
							</a>
							<span class="txt1 m-l-20">
								 | 
							</span>
							<a class="txt2 m-l-20" href="#">
								비밀번호찾기
							</a>
					</div>
				</div>
		</div>
	</div>
		
	

	<div id="dropDownSelect1"></div>
	




<script type="text/javascript" src="../../resources/login/js/login.js"></script>




</body>
</html>