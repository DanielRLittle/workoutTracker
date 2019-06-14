
const urlById = `http://35.242.137.2:8080/workoutTracker-1.0/api/users/${output.id}`;

function deleteUser() {
    window.location.href = './deletePage.html';
}

function confirmDeleteUser() {
    let output = window.sessionStorage.getItem("User");
    output = JSON.parse(output);
    requestData(urlById, "DELETE", "");
    afterDeleteUser();
}