$.ajax({
	url:"/err/getAjaxError",
	method:"post",
	async:false,
	success:function(data){
		console.info(data);
		if(data.status == 200 && data.msg == 'OK'){
			alert("ajax请求成功=>"+data.msg);
		}else{
			alert("ajax请求失败=>"+data.msg);
		}
	},
	error:function(){
		alert("ajax请求错误");
	}
});

	