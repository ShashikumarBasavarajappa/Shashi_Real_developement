/**
 * http://usejsdoc.org/
 */

console.log("=*************=")

try{
	var a = 10;
	var c = a+b;
}catch(err){
	console.log(err);
}

const fs =  require('fs');

function nodeStyleCallback(err,data){
	if(err){
		console.error("There was some error : " +  err);
		return;
	}
	
	console.log(data);
}

fs.readFile('Test1', nodeStyleCallback)

fs.readFile('Test', nodeStyleCallback)


