<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN">
<html>
	<head>
		<title>Tag Detail</title>
		<link rel="stylesheet" href="./css/magic.css" />
	</head>
	<script src="./js/pattern.js"></script>
	<script>StyleFix.register(function(css, raw) {if (PrefixFree.functions.indexOf('radial-gradient') > -1) {css = css.replace(/radial-gradient\(([a-z-\s]+\s+)?at ([^,]+)(?=,)/g,function($0, shape, center) {return 'radial-gradient(' + center + (shape ? ', ' + shape : '');});}return css;});</script>

	<%@include file="includes.jsp" %>
	
	<table class="tagDetail">
		<tr>
			<td>Tag:</td>
			<td><span class="bigTag <c:out value='${tagDetail.tag.obligation.toString().toLowerCase()}' />" style="color:<c:out value='${tagDetail.color}' />; background-color:<c:out value='${tagDetail.backgroundColor}' />" href="./detail?tag=<c:out value='${tagDetail.tag.toString()}' />"><c:out value="${tagDetail.tag.toString()}" /></span></td>
		</tr>
		<tr>
			<td>Type:</td>
			<td><c:out value='${tagDetail.tag.getClass().getSimpleName()}' /></td>
		</tr>
		<tr>
			<td>Obligation:</td>
			<td><c:out value='${tagDetail.tag.obligation.toString()}' /></td>
		</tr>
		<tr>
			<td>Visibility:</td>
			<td><c:out value='${tagDetail.tag.visibility.toString()}' /></td>
		</tr>
		<tr>
			<td>Occurrences:</td>
			<td><c:out value='${tagDetail.occurrences}' /></td>
		</tr>
		<tr>
			<td>Created:</td>
			<td><c:out value='${tagDetail.created}' /></td>
		</tr>
		<tr>
			<td>Owner:</td>
			<td><c:out value='${tagDetail.owner}' /></td>
		</tr>
	</table>

</html>