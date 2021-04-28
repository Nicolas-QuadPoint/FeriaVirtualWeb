/**
 * Se asume que jquery está incluido.
 * Permite cargar de forma dinámica cualquier fragmento que
 * esté en la carpeta /fragments. Dichos fragmentos no son
 * páginas html completas, sino que solo unos trozos de página que
 * serán puestas en el elemento <div> con el id #contenedorPrincipal.
 * 
 * Este es genérico, y permite el uso de callbacks
 */
function cargarContenido(nombreContenido,callbackOk=(res,status,xhr)=>{},callbackError=(res,status,xhr)=>{}){

    $('#contenedorPrincipal').load(nombreContenido, function(res, status, xhr){
        if(status == "success"){
            console.log("External content loaded successfully!");
            callbackOk(res,status,xhr);
        }
        if(status == "error"){
            console.log("Error: " + xhr.status + ": " + xhr.statusText);
            callbackError(res,status,xhr);
        }
            
    });
}

function haciaFragmentoUsuarios(res,status,xhr){
    
    /*
    $('#contenedorPrincipal').load(nombreContenido, function(res, status, xhr){
            if(status == "success"){
                console.log("External content loaded successfully!");
                callbackOk(res,status,xhr);
            }
            if(status == "error"){
                console.log("Error: " + xhr.status + ": " + xhr.statusText);
                callbackError(res,status,xhr);
            }
        }
    );*/

    $("#usuarios-card").on('overlay.removed.lte.cardrefresh', function(hola){
        console.log('Paso por loaded!!');
        $("#dtusuarios").DataTable();
    });

    $('#usuarios-card-btn-refresh').trigger('click');

}