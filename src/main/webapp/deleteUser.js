const urlById = `http://35.242.137.2:8080/workoutTracker-1.0/api/users/${output.id}`;

function deleteUser() {
    window.location.href = './deletePage.html';
}

function confirmDeleteUser() {
    requestData(urlById, "DELETE", "");
    afterDeleteUser();
}