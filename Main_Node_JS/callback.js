var maxTime = 1000;

var eventHandler = function(v, callback) {
	//CallBack is the Functionality, In which we are calling when ever it's requires 
	//So that it's usefull to Develop fast and Perfect development
	console.log("--------Test--------");
	handleResults(3);
};

var handleResults = function(error, results, time) {
	console.log("Main Console");
	if (error) {
		console.log("yes : " + error.message);
	} else {
		console.log("no " + time + " " + "ms");
	}
};

// During Asynchronos Code Callback Not in our Hand
// We need to Handle Ourself.



eventHandler(3, handleResults);
eventHandler(5, handleResults);
eventHandler(10, handleResults);

console.log("=========Test=========");