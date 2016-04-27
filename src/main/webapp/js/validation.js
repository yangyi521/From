var validator;
$(document).ready(function(){      //Jquery判断整个页面加载完成 
	validator = $("#FormId").validate({    
		rules:{
			username:{
				required:true,
				minlength:3,
				maxlength:6,
			},
			password:{
				required:true,
				minlength:3,
				maxlength:6,
			},
           "confirm-password":{
				equalTo: "#password",
			},
			
		},
		messages:{
			
		 username:{
			 required:'此选项必填',
			 minlength:'用户名长度至少为3位',
		     maxlength:'用户名长度最大为6位',
		 },
		 password:{
			 required:'此选项必填',
			 minlength:'密码的长度至少为3位',
			 maxlength:'密码的长度最大为6位',
		 },
		  "confirm-password":{
				equalTo: '两次输入的密码不一致',
			},
		/*groups:{
		  login:"username password confirm-password"		
			}*/
		
		},
		/*errorPlacement:function(error, element) {  
			 error.insertBefore("#info");  
		}, */
		focusInvalid:true,
		/*errorClass:"wrong",*/
	});
});
