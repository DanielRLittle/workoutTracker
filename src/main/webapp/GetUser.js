const getUserPage = "http://35.242.137.2:8080/workoutTracker-1.0/GetUser.html"

function getUser() {
    let input1 = document.getElementById("input1").value;
    let input2 = document.getElementById("input2").value;
    requestData(urlNeeded, "GET", "").then((x) =>{
        let data = JSON.parse(x.responseText);
        console.log(data);
        for(let ele of data) {
            console.log(ele.firstName);
            console.log(ele.lastName);
            if(ele.firstName === input1 && ele.lastName === input2) {
                console.log(ele.firstName);
                console.log(ele.lastName);
                window.sessionStorage.setItem("User", JSON.stringify(ele));
                window.location.href = getUserPage;
            }
        }
    });
}