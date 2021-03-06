$(document).ready(function() {
    $("td").click(function() {
        var data = {'id' : this.id};
        var elementId = '' + this.id;
        $.ajax({
            method: 'POST',
            data: data,
            url: 'move',
            success: function(data) {
                if(data == -1) {
                    // reset
                    document.getElementById('gameInfo').innerHTML = 'Game started';
                    for (var i = 0; i < 9; i++) {
                        document.getElementById('' + i).innerHTML = '';
                    }
                    return;
                }
                var state = data & 0xFF;
                var blockState = (data >> 8) & 0xFF;
                if (blockState == 1) {
                    document.getElementById(elementId).innerHTML = 'X';
                } else {
                    document.getElementById(elementId).innerHTML = 'O';
                }
                if (state == 1) {
                    document.getElementById('gameInfo').innerHTML = 'X is the WINNER!';
                    document.getElementById('modal-info').innerHTML = 'X is the WINNER!';
                    $("#myModal").modal();
                } else if (state == 2) {
                    document.getElementById('gameInfo').innerHTML = 'O is the WINNER!';
                    document.getElementById('modal-info').innerHTML = 'O is the WINNER!';
                    $("#myModal").modal();
                } else if(state == 3) {
                    document.getElementById('gameInfo').innerHTML = 'Tie!';
                    document.getElementById('modal-info').innerHTML = 'Its a Tie!';
                    $("#myModal").modal();
                }
            }
        });
    });
    $("#restart-game-button").click(function() {
       location.reload(); 
    });
});


