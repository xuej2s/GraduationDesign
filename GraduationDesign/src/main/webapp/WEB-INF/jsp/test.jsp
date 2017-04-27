<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
<meta charset="utf-8" />
<title>Bootstrap表格插件 - Bootstrap后台管理系统模版Ace下载</title>
<meta name="keywords"
	content="Bootstrap模版,Bootstrap模版下载,Bootstrap教程,Bootstrap中文" />
<meta name="description"
	content="站长素材提供Bootstrap模版,Bootstrap教程,Bootstrap中文翻译等相关Bootstrap插件下载" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<!-- basic styles -->

<link
	href="${pageContext.request.contextPath }/assets/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/assets/css/font-awesome.min.css" />

<!--[if IE 7]>
		  <link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->

<!-- page specific plugin styles -->

<!-- fonts -->

<link rel="stylesheet"
	href="${pageContext.request.contextPath }/assets\css\cyrillic.css" />

<!-- ace styles -->

<link rel="stylesheet"
	href="${pageContext.request.contextPath }/assets/css/ace.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/assets/css/ace-rtl.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/assets/css/ace-skins.min.css" />

<!--[if lte IE 8]>
		  <link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/ace-ie.min.css" />
		<![endif]-->

<!-- inline styles related to this page -->

<!-- ace settings handler -->

<script
	src="${pageContext.request.contextPath }/assets/js/ace-extra.min.js"></script>

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

<!--[if lt IE 9]>
		<script src="${pageContext.request.contextPath }/assets/js/html5shiv.js"></script>
		<script src="${pageContext.request.contextPath }/assets/js/respond.min.js"></script>
		<![endif]-->
</head>

<body>
	<form action="ChannelManageAction.a" method="post"
		enctype="multipart/form-data" class="form-horizontal"
		id="basic_validate" novalidate="novalidate">
		<div class="control-group">
			<label class="control-label">频道名称:</label>
			<div class="controls">
				<input style="width: 180px" type="text" name="channelName">
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="s2">频道类型:</label>
			<div class="controls">
				<select style="width: 200px;" name="channelType" id="s2">
					<app:dictselect dictType="1105" />
				</select>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">频道信号源:</label>
			<div class="controls">
				<input style="width: 180px" type="text" name="channelSignal"
					onblur="checkChannelSignal('',this.value)"> <span
					id="showMsg" style="color: red"></span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">频道logo地址:</label>
			<div class="controls">
				<input type="file" name="fileContent" id="fileContent">
			</div>
		</div>
		<div class="form-actions" style="padding-left: 180px;">
			<button type="submit" name="doAddChannelInfo" class="btn btn-primary">
				<i class="icon-ok icon-white"></i>保存
			</button>
			&nbsp;&nbsp;
			<button type="button" class="btn btn-primary cancelBtn">
				<i class="icon-remove icon-white"></i>取消
			</button>
		</div>
	</form>

	<!-- /.main-container -->

	<!-- basic scripts -->

	<!--[if !IE]> -->

	<script
		src="${pageContext.request.contextPath }/assets\js\jquery-2.0.3.min.js"></script>

	<!-- <![endif]-->

	<!--[if IE]>
<script src="${pageContext.request.contextPath }/assets\js\jquery-1.10.2.min.js"></script>
<![endif]-->

	<!--[if !IE]> -->

	<script type="text/javascript">
		window.jQuery
				|| document
						.write("<script src='${pageContext.request.contextPath }/assets/js/jquery-2.0.3.min.js'>"
								+ "<"+"/script>");
	</script>

	<!-- <![endif]-->

	<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='${pageContext.request.contextPath }/assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
</script>
<![endif]-->

	<script type="text/javascript">
		if ("ontouchend" in document)
			document
					.write("<script src='${pageContext.request.contextPath }/assets/js/jquery.mobile.custom.min.js'>"
							+ "<"+"/script>");
	</script>
	<script
		src="${pageContext.request.contextPath }/assets/js/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/assets/js/typeahead-bs2.min.js"></script>

	<!-- page specific plugin scripts -->

	<script
		src="${pageContext.request.contextPath }/assets/js/jquery.dataTables.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/assets/js/jquery.dataTables.bootstrap.js"></script>

	<!-- ace scripts -->

	<script
		src="${pageContext.request.contextPath }/assets/js/ace-elements.min.js"></script>
	<script src="${pageContext.request.contextPath }/assets/js/ace.min.js"></script>

	<!-- inline scripts related to this page -->

	<script type="text/javascript">
		jQuery(function($) {
			var oTable1 = $('#sample-table-2').dataTable({
				"aoColumns" : [ {
					"bSortable" : false
				}, null, null, null, null, null, {
					"bSortable" : false
				} ]
			});

			$('table th input:checkbox').on(
					'click',
					function() {
						var that = this;
						$(this).closest('table').find(
								'tr > td:first-child input:checkbox').each(
								function() {
									this.checked = that.checked;
									$(this).closest('tr').toggleClass(
											'selected');
								});

					});

			$('[data-rel="tooltip"]').tooltip({
				placement : tooltip_placement
			});
			function tooltip_placement(context, source) {
				var $source = $(source);
				var $parent = $source.closest('table')
				var off1 = $parent.offset();
				var w1 = $parent.width();

				var off2 = $source.offset();
				var w2 = $source.width();

				if (parseInt(off2.left) < parseInt(off1.left)
						+ parseInt(w1 / 2))
					return 'right';
				return 'left';
			}
		})
	</script>

</body>
</html>
<script>
	var _hmt = _hmt || [];
	(function() {
		var hm = document.createElement("script");
		hm.src = "//hm.baidu.com/hm.js?a43c39da34531f4da694d4499c5614d4";
		var s = document.getElementsByTagName("script")[0];
		s.parentNode.insertBefore(hm, s);
	})();
</script>