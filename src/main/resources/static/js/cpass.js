var serverContext = [[@{/}]];
function savePass(){
    var pass = $("#pass").val();
    var valid = pass == $("#passConfirm").val();
    if(!valid) {
      $("#error").show();
      return;
    }
    $.post(serverContext + "burba",
      {password: pass, oldpassword: $("#oldpass").val()} ,function(data){
        window.location.href = serverContext +"/home.html?message="+data.message;
    })
    .fail(function(data) {
        $("#errormsg").show().html(data.responseJSON.message);
    });
}