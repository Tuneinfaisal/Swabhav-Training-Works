const items = document.querySelector(".items");
const submitButton = document.querySelector(".btn");
// const number = document.getElementById("inputText");
let itemsArr = [];

function item(number,str) {
    const text = {name:number,value:str};
    itemsArr.push(text);
    addToLocalStorage(text);
}

function renderItems() {
    items.innerHTML = "";
    items.forEach(function (item) {
        const li = document.createElement("li");
        li.setAttribute("class","item");
        li.setAttribute("item-id");
        li.innerHTML = `${item.name} &nbsp ${moment().startOf('hour').fromNow()}`;
        console.log(item.value);
        items.appendChild(li);
    })
}

function addToLocalStorage(text) {
    localStorage.setItem("text",JSON.stringify(text));
    renderItems();
}

function getLocalStorage() {
    const data = localStorage.getItem("text");
    if(data) {
        itemsArr = JSON.parse(data);
        renderItems();
    }
}
getLocalStorage();

function load() {
    console.log()
    const number = document.getElementById("inputText").value;
    var fact = "http://numbersapi.com/" + number + "?json" + number;
    console.log(fact);
    const xhr = new XMLHttpRequest();
    xhr.open("get",fact,true);
    xhr.getAllResponseHeaders("content-type", "applicaiton/json");
    xhr.onload = function() {
        item(this.responseText,number);
    }
}