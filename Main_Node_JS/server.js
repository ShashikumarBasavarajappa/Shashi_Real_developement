var http = require('http');

//create a server object:
var server = http.createServer(function (req, res) {
  res.writeHead(200, {"Content-Type": "text/html"});
  res.write('Hello World!'); //write a response to the client
  res.end("Shashi"); //end the response
}).listen(8888); //the server object listens on port 8080


