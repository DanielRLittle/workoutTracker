function mainMenu() {
    window.location.href = './frontpage.html';
}

function userPage() {
    window.location.href = './userPage.html';
}

function updateUserPage() {
    window.location.href = './updateUser.html';
}

function loginPage() {
    window.location.href = './loginPage.html';
}

function createUserPage() {
    window.location.href = './createUser.html';
}

function loginFromCreate() {
    document.getElementById("hidingButton").style.display = "none";
    window.location.href = './loginPage.html';
}

function afterUpdateUser() {
    document.getElementById("redirectAfterUpdate").innerHTML = "A fresh login is required for your username to take effect, redirecting...";
    timeout(3000);
}

function afterDeleteUser() {
    document.getElementById("redirectAfterUpdate").innerHTML = "Account has been deleted, redirecting...";
    timeout(2000);
}


function timeout(int) {
    setTimeout(() => {
        mainMenu();
    }, int);
}