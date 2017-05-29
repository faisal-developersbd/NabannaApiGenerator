/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




        $(window).bind('resize', function () {
            var vWidth = $(window).width();
            if (vWidth > 1000) {
                $("#category").setGridWidth(900);
            }
            else {
                $("#category").setGridWidth($(window).width());
            }
        }).trigger('resize');

        //jQGrid

        var AdminFunctionsLastSel = 1;
        //setup function table
        $("#category").jqGrid({
            url: 'crops',
            datatype: 'json',
            mtype: 'GET',
            width: 'auto',
            height: 'auto',
            colModel: [{
                label: 'Category Name',
                name: 'cat_name',
                index: 'cat_name',
                width: 250,
                editable: true,
                edittype: 'text',
               
            },
           
             {
                 name: 'Edit', index: 'Edit', width: 75, editable: false, align: 'center', sortable: false
             },
             {
                 name: 'Delete', index: 'Delete', width: 75, editable: false, align: 'center', sortable: false
             }],

            gridComplete: function () {
                var ids = $("#category").jqGrid('getDataIDs');
                //loop through all rows in the table and set required column data
                for (var i = 0; i < ids.length; i++) {
                    var rowdata = $('#category').jqGrid('getRowData', ids[i]);
                    var cl = ids[i];
                    s = "<div title='edit' onclick='UpdateProductCategory(" + ids[i] + ");' onmouseover=$(this).addClass('ui-state-hover'); onmouseout=$(this).removeClass('ui-state-hover'); class='ac-person'>Edit</div>";
                    $("#tblProductCategory").setRowData(ids[i], { Edit: s });

                    s = "<div title='delete' onclick='DeleteProductCategory(" + ids[i] + ");' onmouseover=$(this).addClass('ui-state-hover'); onmouseout=$(this).removeClass('ui-state-hover'); class='ac-person'>Delete</div>";
                    $("#tblProductCategory").setRowData(ids[i], { Delete: s });
                }
            },
            pager: $('#categoryPager'),
            rowNum: 18,
            rowList: [10, 20, 30],
            sortname: "cat_id",
            sortorder: "desc",
            viewrecords: true,
//            imgpath: '/Content/custom-theme/images',
            caption: 'Product Category Details',
            editurl: '#',
            loadError: function (xhr, st, err) { },
            loadComplete: function () { $("#category").trigger("reloadGrid"); },
            onCellSelect: function (rowID, iCol, cellContent) {
                if (rowID && (rowID !== AdminFunctionsLastSel)) {
                    $("#category").trigger("reloadGrid");
                    //disable edit row on last selection
                    $('#category').editRow(AdminFunctionsLastSel, false);
                    //save the last row selected
                    if (AdminFunctionsLastSel != 0) $('#category').saveRow(AdminFunctionsLastSel, false);
                    //enable row edit on current row
                    $('#category').editRow(rowID, true);
                    AdminFunctionsLastSel = rowID;
                }
            }
        });

        $("#category").jqGrid('navGrid', '#categoryPager', {
            search: false,
            edit: false,
            add: false,
            del: false
        }, {
            url: '#',
            closeAfterEdit: true
        }, {
            url: '#',
            closeAfterAdd: true
        }, {
            url: '#',
            closeAfterDelete: true
        }, {});

        //End jQGrid

        //Textbox Validation



      

        //End Textbox validation

        // Check charcode for ProductCategory1 Balance

     

        // End  charcode for ProductCategory1 Balance

    }); 
})(jQuery);

