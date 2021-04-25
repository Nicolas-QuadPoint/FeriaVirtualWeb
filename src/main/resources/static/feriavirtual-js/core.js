/**
 * Se asume que jquery está incluido.
 */
function cargarContenido(nombreContenido){

    $('#contenedorPrincipal').load(nombreContenido, function(res, status, xhr){
        if(status == "success")
            console.log("External content loaded successfully!");
        if(status == "error")
            console.log("Error: " + xhr.status + ": " + xhr.statusText);
    });
}