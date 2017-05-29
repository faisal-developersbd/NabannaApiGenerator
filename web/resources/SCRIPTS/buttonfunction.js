/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function clearAll()
{
    $('#sodiumInputText').val("");
    $('#phosphorasInputText').val("");
    $('#potasiamInputText').val("");
    $('#salphurInputText').val("");
}
(function ($)
{
    $(document).ready(function(){
//         alert('jquery interfaced successfully');
       
        
         $('#analizeButton').click(function() {
             $.ajax({
                 url: "/NabannaSpringVersion/saveEmp",
                 type:"POST",
                 data:JSON.stringify(
                         {
                             emp:{
                                 id:$('#sodiumInputText').val(),
                                 name:$('#phosphorasInputText').val(),
                                 salary:$('#potasiamInputText').val(),
                                 designation:$('#salphurInputText').val(),
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