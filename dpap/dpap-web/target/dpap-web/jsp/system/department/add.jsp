<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>部门信息</title>
</head>
<body>
<h3>添加部门信息</h3>
<form action="http://localhost:8080/ssm-web/system/department/save" method="post">
  <p>主键id: <input type="text" name="id" /></p>
  <p>部门名: <input type="text" name="deptName" /></p>
  <p>排&nbsp;序: <input type="text" name="sort" /></p>
  <p>状&nbsp;态: <input type="text" name="status" /></p>
  <p>创建人: <input type="text" name="creater" /></p>
  <input type="submit" value="提交" />
</form>
</body>
</html>