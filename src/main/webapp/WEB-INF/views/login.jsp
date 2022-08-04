<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


 <div id="app">
      <div>{{message}}</div>
      <h1>{{description}}</h1>
</div>




<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script type="text/javascript">
 var app = new Vue ({
	 el: '#app',
	 data: {
		 message : '안녕하세요 Vue !',
		 description :'반갑습니다', 
		 
	 },
	 
 });

</script>


</body>
</html>