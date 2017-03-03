<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>部门信息</title>
</head>
<body>
<h3>部门信息详情</h3>
<a href="http://localhost:8080/ssm-web/jsp/system/department/add.jsp">添加</a>
<br/>
<br/>
<br/>
<table border="1" cellspacing="0" cellpadding="0">
    <thead>
         <tr>
            <td width="100">主键id</td>
	        <td width="100">部门名称</td>
	        <td width="100">排序</td>
	        <td width="100">状态</td>
	        <td width="100">创建人</td>
	        <td width="200">创建时间</td>
	        <td width="100">修改人</td>
	        <td width="200">修改时间</td>
	        <td width="100">操作</td>
         </tr>
    </thead>
    <tbody>
         <tr>
	        <td>${bean.id}</td>
	        <td>${bean.deptName}</td>
	        <td>${bean.sort}</td>
	        <td>${bean.status}</td>
	        <td>${bean.creater}</td>
	        <td>${bean.createTime}</td>
	        <td>${bean.editor}</td>
	        <td>${bean.editTime}</td>
	        <td>
	           <a href="http://localhost:8080/ssm-web/system/department/edit?id=${bean.id}">修改</a>
	           <a href="http://localhost:8080/ssm-web/system/department/delete?id=${bean.id}">删除</a>
	        </td>
	    </tr>
    </tbody>
</table>
</body>
</html>