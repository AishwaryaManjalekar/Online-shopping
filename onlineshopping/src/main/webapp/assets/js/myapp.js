$(function() {
	// solving the active menu problem
	switch(menu) {
	
		case 'About Us':
			$('#about').addClass('active');
			break;
		case 'Contact Us':
			$('#contact').addClass('active');
			break;
		case 'All Products':
			$('#listProducts').addClass('active');
			break;
		default:
		    if(menu == "Home") break;
			$('#listProducts').addClass('active');
			$('#a_'+menu).addClass('active');
			break;	
	
	}
		var products =[
		
		
		
		['1','ABC'],
		['2','CYX'],
		['3','PQR'],
		['4','MNO'],
		['5','WVB'],
		['6','HIK']
		
		];
		
		
		var $table =$('#productListTable');
		
		if($table.length){
		
		
		$table.DataTable({
		       lengthMenu : [ [ 3, 5, 10, -1 ],
							[ '3 Records', '5 Records', '10 Records', 'ALL' ] ],
					pageLength : 5,		
		data:products
		})
		
		}
	
});