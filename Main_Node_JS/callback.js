var maxTime=1000;

var eventHandler =  function(v, callback){
	console.log("ssssssssss");
};

var handleResults = function(error, results, time){
	console.log("sssssssddsss");
	if (error){
		console.log("cccccccccccc");
	}else{
		console.log("nnnnnnnnnnnnnn");
	}
};

eventHandler(3, handleResults);

console.log("============");

