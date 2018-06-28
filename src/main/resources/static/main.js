var arr = [0,0,0,0,0,0,0,0,0,0];
function sum() {
    document.getElementById("val").innerHTML = "Value: " + arr.reduce(function(acc, val) { return acc + val; }, 0);
}
function func(input,output,indx) {
    var x = document.getElementById(input).value;
    $.ajax({
        type: "POST",
        url: "/calculate",
        data: JSON.stringify({ input: x,function: input}),
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function(data){
            var res = data.res;
            document.getElementById(output).innerHTML = res;
            arr[indx] = res;
            sum();
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {
            document.getElementById(output).innerHTML = "";
            arr[indx] = 0;
            sum();
        }
    });
}