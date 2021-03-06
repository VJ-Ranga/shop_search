/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


const Toast = Swal.mixin({
  toast: true,
  position: 'top-end',
  showConfirmButton: false,
  timer: 3000
});

alert("dddd");

 //get provinces
$.ajax({
        url		: '../ProvinceServlet',
        type		: 'GET',
        data		: {"type":"cmb"},
    success: function(list) {alert(list);
        $('#cmbProvince').empty();
        $('#cmbProvince').html('<option value="0" selected="selected" disabled="disabled">Select Province</option>');
        for(var a=0; a<list.length; a++){
                $('#cmbProvince').append($("<option></option>").attr("value",list[a]['id']).text(list[a]['name']));
        }
    }
});

 //get category
$.ajax({
        url		: '../CategoryServlet',
        type		: 'GET',
        data		: {"type":"cmb"},
    success: function(list) {
        $('#cmbCategory').empty();
        $('#cmbCategory').html('<option value="0" selected="selected" disabled="disabled">Select Category</option>');
        for(var a=0; a<list.length; a++){
                $('#cmbCategory').append($("<option></option>").attr("value",list[a]['id']).text(list[a]['name']));
        }
    }
});

//get district according to province
$("#cmbProvince").change(function() {
    province = $("#cmbProvince").val();
    $("#cmbDistrict").prop("disabled",false);
    
    $.ajax({
        url		: '../DistrictServlet',
        type		: 'GET',
        data		: {"type":"byProId", "id":province},
        success: function(list) {
            $('#cmbDistrict').empty();
            $('#cmbDistrict').html('<option value="0" selected="selected" disabled="disabled">Select District</option>');
            for(var a=0; a<list.length; a++){
                    $('#cmbDistrict').append($("<option></option>").attr("value",list[a]['id']).text(list[a]['name']));
            }
        }
    });
  
});

//get area according to distrcit
$("#cmbDistrict").change(function() {
    province = $("#cmbDistrict").val();
    $("#cmbArea").prop("disabled",false);
    
    $.ajax({
        url		: '../AreaServlet',
        type		: 'GET',
        data		: {"type":"byDisId", "id":province},
        success: function(list) {
            $('#cmbArea').empty();
            $('#cmbArea').html('<option value="0" selected="selected" disabled="disabled">Select Area</option>');
            for(var a=0; a<list.length; a++){
                    $('#cmbArea').append($("<option></option>").attr("value",list[a]['id']).text(list[a]['name']));
            }
        }
    });
  
});
