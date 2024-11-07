import http from "http";

const server = http.createServer((request, response) => {
    console.info(request.method);
    console.info(request.urg);


    // Fungsi yang menangani rute
    const handleRoute = (url) => {
        if (url === "/haidar"){
            response.writeHead(200, {"Content-Type" : "text/plain"});
            response.write("Hello haidar");
        } else if (url === "/other") {
            response.writeHead(200, { "Content-Type" : "text/plain"});
            response.write("Hello Other");
        } else {
            response.writeHead(404, { "Content-Type" : "text/plain"});
        }
    };

    // Memanggil fungsi handleRoute dengan url dari permintaan
    handleRoute(request.url);

    response.end();
});

server.listen(5000, () => {
    console.log("Server 5000");
});