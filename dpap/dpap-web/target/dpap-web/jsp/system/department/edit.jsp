<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>部门信息</title>
</head>
<body>
<h3>修改部门信息</h3>
<form action="http://localhost:8080/ssm-web/system/department/update" method="post">
  <input type="hidden" name="id" value="${bean.id }" />
  <p>部门名: <input type="text" name="deptName" value="${bean.deptName }" /></p>
  <p>排&nbsp;序: <input type="text" name="sort" value="${bean.sort }" /></p>
  <p>状&nbsp;态: <input type="text" name="status" value="${bean.status }" /></p>
  <p>修改人: <input type="text" name="editor" value="${bean.editor }" /></p>
  <input type="submit" value="提交" />
</form>
</body>
</html>