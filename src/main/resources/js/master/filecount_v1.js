var sessionKey, table;
$(document).ready(function(){
   $('#detail_table').dataTable({
        "language": {
            "paginate": {
                "previous": "首页",
                "next": "下一页"
            },
            "info": "显示_START_到_END_, 共计_TOTAL_条数据",
            "emptyTable": "无记录",
            "infoEmpty": "共计0",
        },
        /* 分页设置 */
        "serverSide": true,					// 打开后台分页
        "bPaginate": true,
        "bLengthChange": false,
        /* 搜索设置 */
        "bFilter": true,
        "bSort": false,
        /* 显示总条数 */
        "bInfo": true,
        "bAutoWidth": false,
        "ajax":{
     		"url":ctx+"manage/search",
        	"data":function(d){
//        		var userName=$("#userName").val();
//        		var fileName=$("#fileName").val();
//        		var fileFormat=$("#fileFormat").val();
//        		var startTime=$("#file_startTime").val();
//        		var endTime=$("#file_endTime").val();
//        		var status=$("#status").val();
//        		d.userName=userName;
//        		d.fileName=fileName,
//        		d.fileFormat=fileFormat,
//        		d.startTimeDetail=startTime,
//        		d.endTimeDetail=endTime,
//        		d.status=status
             }
     },
     "columns":[
	        	 {"data": null,"targets": 0},//序号
	             {
	            	 data:"user.userName",
	                 render:function(data, type, row) {
	                	 if(data == "" || data == null) {
	            			 return "-";
	            		 }
	            		 return data;
	                 }
	             },
	             {
	            	 data:"fileName",
	            	 render:function(data, type, row) {
	            		 if(data == "" || data == null) {
	            			 return "-";
	            		 }else if(data.length > 13){
	            			 return '<a class="tooltip-toggle" data-toggle="tooltip" data-placement="bottom" herf="#" title="'+data+'">'+data.substring(0,13)+'...</a>';
	            		 }
	            		 return data;
	            	 }
	             },
	             {
	            	 data:"fileSize",
	            	 render:function(data, type, row) {
	            		 if(data == "" || data == null) {
	            			 return "-";
	            		 }
	            		 return  (data/1024).toFixed(2);
	            	 }
	             }
	    ],
    });
})

