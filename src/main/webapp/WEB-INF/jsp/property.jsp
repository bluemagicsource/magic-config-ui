<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN">
<html>
	<head>
		<title>Property Detail</title>
		<link rel="stylesheet" href="./css/magic.css" />
	</head>
	<script src="./js/pattern.js"></script>
	<script>StyleFix.register(function(css, raw) {if (PrefixFree.functions.indexOf('radial-gradient') > -1) {css = css.replace(/radial-gradient\(([a-z-\s]+\s+)?at ([^,]+)(?=,)/g,function($0, shape, center) {return 'radial-gradient(' + center + (shape ? ', ' + shape : '');});}return css;});</script>

	<%@include file="includes.jsp" %>

	<table class="propertyDetail">
		<tr>
			<td>Key:</td>
			<td><c:out value="${propertyDetail.property.key}" /></td>
		</tr>
		<tr>
			<td>Value:</td>
			<td><c:out value="${propertyDetail.property.value}" /></td>
		</tr>
		<tr>
			<td>Tags:</td>
			<td>
				<c:forEach var="tagInfo" items="${propertyDetail.tags}">
					<span class="tag <c:out value='${tagInfo.tag.obligation.toString().toLowerCase()}' />" style="color:<c:out value='${tagInfo.color}' />; background-color:<c:out value='${tagInfo.backgroundColor}' />"><c:out value="${tagInfo.tag.toString()}" /></span>
				</c:forEach>
			</td>
		</tr>
		<tr>
			<td>Created:</td>
			<td><c:out value='${propertyDetail.created}' /></td>
		</tr>
		<tr>
			<td>Owner:</td>
			<td><c:out value='${propertyDetail.owner}' /></td>
		</tr>
	</table>

</html>