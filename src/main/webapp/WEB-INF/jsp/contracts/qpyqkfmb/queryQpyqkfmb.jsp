<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% String path = request.getContextPath(); %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<jsp:include page="../../headTable.jsp"></jsp:include>
						<c:forEach items="${requestScope.qpyqkfmbList}" var="qpyqkfmbList" varStatus="v">
					<tr>
								<td>${qpyqkfmbList.contract_serial}</td>
								<td>${qpyqkfmbList.merchant_name}</td>
								<td>${qpyqkfmbList.phone}</td>
								<td>${qpyqkfmbList.second_date}</td>
								<td>${qpyqkfmbList.username}</td>
						<td>
							<a class="btn btn-success " onclick="window.open('<%=path%>/queryQpyqkfmbById?contract_id=${qpyqkfmbList.contract_id}','_blank')">详情</a>
							<a class="btn btn-danger " onclick="window.open('<%=path%>/updateQpyqkfmbById?contract_id=${qpyqkfmbList.contract_id}','_blank',width=500,height=400,resizable='no',scrollbars='no')">修改</a>
						</td>
					</tr>
						</c:forEach>
<jsp:include page="../../footTable.jsp"></jsp:include>
</body>
</html>
