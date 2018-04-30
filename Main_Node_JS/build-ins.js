/**
 * http://usejsdoc.org/
 */

var os = require("os");


console.log(os.hostname());

// THis will give you Name of the System HIBAIL55352

console.log(os.loadavg()[2]);

var tomb = function(f) {
	return(Math.round((f/1024/1024)*100)/100);
};

console.log(tomb(os.freemem()));
console.log(tomb(os.totalmem()));

// IN Node Rember Each of the Javascript FIle is a Module

// Remember All these things Always


