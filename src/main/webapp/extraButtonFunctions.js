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

function afterUpdateUser() {
    document.getElementById("redirectAfterUpdate").innerHTML = "A fresh login is required for your username to take effect, redirecting...";
    timeout();
}

function timeout(){
    setTimeout(() => {
        mainMenu();    
        }, 3000);  
}