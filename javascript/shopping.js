$(document).ready(function() {
	var cart=[];
	$(".addbutton").click(function() {
		
		
		var p=$(this).parent();
		var gp=$(p).parent();
		var price=gp.children("#price").text();
		var fruit=gp.children("#fruit").text();
		cart.push({fruit:fruit,price:price});
		});

$("#submit").click(printReceipt);
function printReceipt(){
	var total=0;
	for (var i=0 ;i< cart.length ;i++){
		var item= cart[i];
		total += Number(item.price);
		console.log("$" + item.price + " "+item.fruit);
		
		
	} 
	console.log("Total : $" + total);
}




});	