<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <script type="text/javascript">
    	$(document).ready(function(){
    		$("#findMemberForm").submit(function(){
    			if($("#memberId").val()==""){
    				alert("아이디입력요");
    				return false;
    			}
    		})
    	})
    </script>
회원정보 검색 화면
<form action="findMemberById.do" id="findMemberForm">
<input type="text" name="memberId" id="memberId">
<input type="submit" value="검색">
</form>