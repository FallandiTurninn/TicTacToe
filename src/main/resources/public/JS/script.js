$(document).ready(function(){
    $("td").click(function(){
        var data = {'column': this.id};
        $.ajax({
           method: 'POST',
            data: data,
            url: 'game/move',
            success: function(data) {
                alert(data);
            }
        });
    });
});
