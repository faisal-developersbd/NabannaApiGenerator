/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function clearAll()
{
    $('#soilQualityText').val("");
    $('#crop_name').val("");
    $('#soil_type').val("");
    $('#soilQualitytText').val("");
    $('#sodiumInputText').val("");
    $('#phosphorasInputText').val("");
    $('#potasiamInputText').val("");
    $('#salphurInputText').val("");
    $('#zinkInputText').val("");
    $('#boronInputText').val("");
}
$(document).ready(function(){
    $("#resetButton").click(function(){
        alert('reset clicked');
        $.ajax({
            url: "/NabannaSpringVersion/cropsgrid", 
            type:"GET",
            success: function(result){
            $("#div1").html(result);
        }});
    });
});
//(function ($)
//{
//    $(document).ready(function(){
//         alert('jquery  successfully');
//         //jQGrid
//     });
//     })(jQuery);
(function ($)
{
    $(document).ready(function(){
        // alert('jquery interfaced successfully');
         //jQGrid


            $(window).bind('resize', function () {
           
            var vWidth = $(window).width();
            if (vWidth > 1000) {
                 
                $("#crops").setGridWidth(900);
                 alert('grid ok');
            }
            else {
                $("#crops").setGridWidth($(window).width());
            }
                  
        }).trigger('resize');
        var AdminFunctionsLastSel = 1;
        //setup function table
     
        $("#crops").jqGrid({
           
            url: '/NabannaSpringVersion/cropsgrid',
            datatype: 'json',
            mtype: 'GET',
            width: 'auto',
            height: 'auto',
            colModel: [{
                label: 'CROP ID',
                name: 'crop_id',
                index: 'crop_id',
                width: 250,
                editable: false,
                edittype: 'text'
                
            },{
                label: 'Category ID',
                name: 'cat_id',
                index: 'cat_id',
                width: 250,
                editable: false,
                edittype: 'text'
                
            },{
                label: 'Crop Name',
                name: 'crop_name',
                index: 'crop_name',
                width: 250,
                editable: false,
                edittype: 'text'
                
            },
           
             {
                 name: 'Edit', index: 'Edit', width: 75, editable: false, align: 'center', sortable: false
             },
             {
                 name: 'Delete', index: 'Delete', width: 75, editable: false, align: 'center', sortable: false
             }],

            gridComplete: function () {
                var ids = $("#crops").jqGrid('getDataIDs');
                alert('Data ');
                //loop through all rows in the table and set required column data
                for (var i = 0; i < ids.length; i++) {
                    var rowdata = $('#crops').jqGrid('getRowData', ids[i]);
                    var cl = ids[i];
                   
                    s = "<div title='edit' onclick='UpdateProductCategory(" + ids[i] + ");' onmouseover=$(this).addClass('ui-state-hover'); onmouseout=$(this).removeClass('ui-state-hover'); class='ac-person'>Edit</div>";
                    $("#crops").setRowData(ids[i], { Edit: s });

                    s = "<div title='delete' onclick='DeleteProductCategory(" + ids[i] + ");' onmouseover=$(this).addClass('ui-state-hover'); onmouseout=$(this).removeClass('ui-state-hover'); class='ac-person'>Delete</div>";
                    $("#crops").setRowData(ids[i], { Delete: s });
                }
            },
            pager: $('#cropsPager'),
            rowNum: 18,
            rowList: [10, 20, 30],
            sortname: "crop_id",
            sortorder: "desc",
            viewrecords: true,
          
            caption: 'CROP LIST',
            editurl: 'updateProductCategory',
            loadError: function (xhr, st, err) { },
            loadComplete: function () { $("#tblProductCategory").trigger("reloadGrid"); },
            onCellSelect: function (rowID, iCol, cellContent) {
                if (rowID && (rowID !== AdminFunctionsLastSel)) {
                    $("#crops").trigger("reloadGrid");
                    //disable edit row on last selection
                    $('#crops').editRow(AdminFunctionsLastSel, false);
                    //save the last row selected
                    if (AdminFunctionsLastSel != 0) $('#tblProductCategory').saveRow(AdminFunctionsLastSel, false);
                    //enable row edit on current row
                    $('#crops').editRow(rowID, true);
                    AdminFunctionsLastSel = rowID;
                }
            }
        });

        $("#crops").jqGrid('navGrid', '#crops', {
            search: false,
            edit: false,
            add: false,
            del: false
        }, {
            url: '/Setup/updateProductCategory',
            closeAfterEdit: true
        }, {
            url: '/Setup/addProductCategory',
            closeAfterAdd: true
        }, {
            url: '/Setup/deleteProductCategory',
            closeAfterDelete: true
        }, {});

        //End jQGrid
        
         $('#analizeButton').click(function() {
             $.ajax({
                 url: "/NabannaSpringVersion/analyzevalue",
                 type:"POST",
                 data:JSON.stringify(
                         {
                             value:{
//                                 crop_name:$('#crop_name').val(),
                                 crop_name:'77',
                                 soil_type:$('#soil_type').val(),
                                 soil_quality_text:$('#soilQualityText').val(),
                         
                                 sodium_input_text:$('#sodiumInputText').val(),
                                 phosphoras_input_text:$('#phosphorasInputText').val(),
                                 potasiam_input_text:$('#potasiamInputText').val(),
                                 salphur_input_text:$('#salphurInputText').val(),
                                 zink_input_text:$('#zinkInputText').val(),
                                 boron_input_text:$('#boronInputText').val()
                             }
                         }),
                         contentType:'application/json; charset=utf-8',
                 success: function(data){
//                     alert('Data posted');
                        clearAll();
        
    }});
             
//              var retval=inset_update;
//              alert('Data: '+retval);
//              if(retval === true){
                   
//                $.ajax({
//                 url:'saveCrops',
//                 type:'POST',
//                 data:JSON.stringify({
//                     acrops:{
//                         crop_id:"10",
//                         crop_name:"1234",
//                         cate_id:"2"
//                     }
//                 }),
//                 
//                 contentType: 'application/json; charset=utf-8',
//                 success:function(data){
//                     alert('Data Post Success');
//                 }
//                 
//             });

//         }else
//         {
//             alert('Data not post');
//         }
            
          
         });
    });
})(jQuery);
$(document).ready(function(){
   
     $(window).scroll(function () {
            if ($(this).scrollTop() > 100) {
                $('#back-to-top').fadeIn();
            } else {
                $('#back-to-top').fadeOut();
            }
        });
        // scroll body to 0px on click
        $('#back-to-top').click(function () {
            $('#back-to-top').tooltip('hide');
            $('body,html').animate({
                scrollTop: 0
            }, 800);
            return false;
        });
        
        $('#back-to-top').tooltip('show');

});