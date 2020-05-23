/**
 * 
 */
// 1.捕获按键弹起事件
// 在文档准备好的时候，
$(function() {
	// 获取keyUp()事件
	$("#word").keyup(function() {
		// 2.获取输入框的值
		var word = $(this).val();
		if (word == "") {
			//如果输入框没东西，把提示框藏起来
			$("#div01").hide();
		} else {
			// 3.请求数据
			$.post("FindWordServlet", {
				word : word
			}, function(data, status) {
				// 4.返回值，并显示（之前display:none）
				$("#div01").html(data);
				$("#div01").show();
			})
		}
	});
})
