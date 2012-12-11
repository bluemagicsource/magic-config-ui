<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN">
<html>
	<head>
		<meta charset='utf-8'> 
		<title>Show Properties</title>
		<link rel="stylesheet" href="./css/magic.css" />
		<link rel="stylesheet" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
	</head>
	<script type="text/javascript" src="./js/jquery.min.js"></script>
	<script type="text/javascript" src="./js/jquery-ui.min.js"></script>
	<script type="text/javascript" src="./js/pattern.js"></script>
	<script type="text/javascript" src="./js/jquery.jeditable.mini.js"></script>
	<script type="text/javascript" src="./js/jquery.dataTables.min.js"></script>

	<script>StyleFix.register(function(css, raw) {if (PrefixFree.functions.indexOf('radial-gradient') > -1) {css = css.replace(/radial-gradient\(([a-z-\s]+\s+)?at ([^,]+)(?=,)/g,function($0, shape, center) {return 'radial-gradient(' + center + (shape ? ', ' + shape : '');});}return css;});</script>

	<script type="text/javascript">

		function property(key) {
	        //alert('Key ' + key + ' clicked');
	        $("#dialog-modal").hide().load('./detail?key=' + key).dialog({title:'Property Detail', width:400, height:175}).delay(100).show(0, function() {
                $( "#dialog-modal" ).dialog('open');
	        });
	        //return false;
		}
		
		function tag(tag) {
			//alert('Tag ' + tag + ' clicked');
			$("#dialog-modal").hide().load('./detail?tag=' + tag).dialog({title:'Tag Detail', width:400, height:250}).delay(100).show(0, function() {
		        $( "#dialog-modal" ).dialog('open');
			});
		}

		
		$(document).ready(function() {
	        // Handler for .ready() called.
	        $( "#dialog-modal" ).dialog({
                autoOpen: false,
                modal: true
	        });
	        
	        $('#propertyTable').dataTable({
	        	"bJQueryUI":true,
                "bPaginate":false,
                "bLengthChange": false,
                "bFilter":false,
                "bInfo":false
	        });
	        
	        $('.edit').editable('http://www.example.com/save.php');
		});
	</script>

	<%@include file="includes.jsp" %>

	<div id="dialog-modal" title="Basic modal dialog">
	<p>Adding the modal overlay screen makes the dialog look more prominent because it dims out the page content.</p>
	</div>

	<span class="edit">BoooooYAH!</span>

	<table id="propertyTable">
		<thead>
	        <th>Key</th>
	        <th>Tags</th>
	        <th>Value</th>
        </thead>
       	<tbody>
        <c:forEach var="propertyInfo" items="${propertyInfoList}">
	        <tr>
	            <td>
	                <a class="key" href="#" onclick="property('<c:out value='${propertyInfo.property.key}' />')"><c:out value="${propertyInfo.property.key}" /></a>
	            </td>
	            <td>
	                <c:forEach var="tagInfo" items="${propertyInfo.tags}">
	                    <a class="tag <c:out value='${tagInfo.obligation.toString().toLowerCase()}' />" style="color:<c:out value='${tagInfo.color}' />; background-color:<c:out value='${tagInfo.backgroundColor}' />" href="#" onclick="tag('<c:out value='${tagInfo.tag.toString()}' />')"><c:out value="${tagInfo.tag.toString()}" /></a>
		            </c:forEach>
       		    </td>
				<td>
					<c:out value="${propertyInfo.property.value}" />
				</td>
			</tr>
		</c:forEach>
       	</tbody>
	</table>

</html>

