<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>guitar</title>
  <script src="//cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
  <link href="//cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" rel="stylesheet">
  <link href="//cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
  <script src="//cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script>
  	$(function(){
  		$('#btn').click(function(){
  			var url="${pageContext.request.contextPath}/search?"+$('#ff').serialize();
  			
  			$.ajax({
  				url:url,
  				data:{},
  				dataType:'json',
  				success:function(data){
  					$('#table').empty();
  					for(var i=0;i<data.length;i++){
  						var guitor=data[i]
  						var html="<tr>"
  						+"<td>"+guitor.price+"</td>"
  						+"<td>"+guitor.builder+"</td>"
  						+"<td>"+guitor.model+"</td>"
  						+"<td>"+guitor.type+"</td>"
  						+"<td>"+guitor.backWood+"</td>"
  						+"<td>"+guitor.topWood+"</td></tr>"
  						
  						$('#table').append(html);
  					}
  				}
  			})
  		})
  	})
  </script>
</head>
<body>
	<div class="container-fluid">
  		<div class="row">
		  <div class="col-lg-12 col-md-12 col-sm-12"><h1>吉他搜索</h1></div>
		</div>
		<form class="form-horizontal" id="ff">
			<div class="form-group">
			   <label for="builder" class="col-sm-2 control-label">builder</label>
			   <div class="col-sm-9">
			   	<!-- <input name="builder" type="text" class="form-control" id="builder" placeholder="builder"> -->
			   	<select class="form-control" name="builder" id="builder">
				  <option value="JIANGSU">江苏</option>
				  <option value="SHANGHAI">上海</option>
				  <option value="SHANDONG">山东</option>
				</select>
			   </div>
			</div>
			<div class="form-group">
			   <label for="model" class="col-sm-2 control-label">model</label>
			   <div class="col-sm-9">
			   <input name="model" type="text" class="form-control" id="model" placeholder="model">
			   </div>
			</div>
			<div class="form-group">
			   <label for="type" class="col-sm-2 control-label">type</label>
			   <div class="col-sm-9">
			   		<select class="form-control" name="type" id="type">
					  <option value="ACOUSTIC">ACOUSTIC</option>
					  <option value="ELECTRIC">ELECTRIC</option>
					  <option value="UNSPECIFIED">UNSPECIFIED</option>
					</select>
			   <!-- <input name="type" type="text" class="form-control" id="type" placeholder="type"> -->
			   </div>
			</div>
			<div class="form-group">
			   <label for="backWood" class="col-sm-2 control-label">backWood</label>
			   <div class="col-sm-9">
			   <!-- <input name="backWood" type="text" class="form-control" id="backWood" placeholder="backWood"> -->
			   	<select class="form-control" name="backWood" id="backWood">
					  <option value="CAMPHOR">CAMPHOR</option>
					  <option value="BRICH">BRICH</option>
					  <option value="KOREANPINE">KOREANPINE</option>
					</select>
			   </div>
			</div>
			<div class="form-group">
			   <label for="topWood" class="col-sm-2 control-label">topWood</label>
			   <div class="col-sm-9">
			   <!-- <input name="topWood" type="text" class="form-control" id="topWood" placeholder="topWood"> -->
			   <select class="form-control" name="topWood" id="topWood">
					  <option value="CAMPHOR">CAMPHOR</option>
					  <option value="BRICH">BRICH</option>
					  <option value="KOREANPINE">KOREANPINE</option>
					</select>
			   </div>
			</div>
		  	<!-- <div class="form-group">
		    	<label for="exampleInputAmount" class="col-sm-2 control-label">price</label>
		    	<div class="input-group col-sm-9">
		      		<div class="input-group-addon">¥</div>
		      		<input type="number" class="form-control" min=0 id="exampleInputAmount" placeholder="price" name="price">
		      	<div class="input-group-addon">.00</div>
		    </div> -->
		    <div class="form-group">
			    <div class="col-sm-offset-5 col-sm-4">
			      <button id="btn" type="button" class="btn btn-default" style="margin-top:15px;width:100px;"><span class="glyphicon glyphicon-search" aria-hidden="true"></span>搜索</button>
			    </div>
			  </div>
		  </div>
		</form>
		
		<table class="table table-bordered">
		  <thead>
		  	<tr>
		  		<td><h4>price</h4></td>
		  		<td><h4>builder</h4></td>
		  		<td><h4>model</h4></td>
		  		<td><h4>type</h4></td>
		  		<td><h4>backWood</h4></td>
		  		<td><h4>topWood</h4></td>
		  	</tr>
		  </thead>
		  <tbody id="table">
		  	
		  </tbody>
		</table>
	</div>
</body>
</html>