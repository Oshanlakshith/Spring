
function generateCustomerId() {
    if (customerDB.length == 0) {
        $("#cusID").val("C00-0001");
    } else if (customerDB.length > 0) {
        var id = customerDB[customerDB.length - 1].getId().split("-")[1];
        var tempId = parseInt(id);
        tempId = tempId + 1;
        if (tempId <= 9) {
            $("#cusID").val("C00-000" + tempId);
        } else if (tempId <= 99) {
            $("#cusID").val("C00-00" + tempId);
        } else if (tempId <= 999) {
            $("#cusID").val("C00-0" + tempId);
        } else if (tempId <= 9999) {
            $("#cusID").val("C00-" + tempId);
        }
    }
}