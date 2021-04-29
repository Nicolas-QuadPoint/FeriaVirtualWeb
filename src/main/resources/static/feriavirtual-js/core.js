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

function cargarDataTableSeccion(nombreCarta,nombreDataTable,nombreControlEvento){

    $(nombreCarta).on('overlay.removed.lte.cardrefresh', function(hola){
        console.log('Carta actualizada: ' + nombreCarta);
        var t = $(nombreDataTable).DataTable({
            "responsive": true, 
            "lengthChange": false, 
            "autoWidth": false,
            "buttons":['pdf','excel','csv','print']
        });
        t.buttons().container()
        .appendTo( $('#dt-contenedor .col-sm-6:eq(0)') );
    });

    //Esto lo hago para que pueda
    $(nombreControlEvento).trigger('click');


}

function haciaFragmentoUsuarios(res,status,xhr){
    cargarDataTableSeccion('#usuarios-card','#dtusuarios','#usuarios-card-btn-refresh');
    $('#fnu_cmbNacionalidad').select2({width: 'resolve' });
}

function haciaFragmentoProductos(res,status,xhr){
    cargarDataTableSeccion('#productos-card','#dtproductos','#productos-card-btn-refresh');
}