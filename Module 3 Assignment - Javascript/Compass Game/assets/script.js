"use strict";

// Array for Compass 
let array = [];
array [0] = "N";
array [1] = "E";
array [2] = "S";
array [3] = "W";

//shuffle array command
    // array.sort((a,b) => 0.5 - Math.random()); (Back up code)
const shuffle = (array) => {
    for (let i = array.length - 1; i >= 0; i--) {
           const randomIndex = Math.floor(Math.random() * (i + 1));
           array.push(array[randomIndex]);
           array.splice(randomIndex, 1);
       }
       return array;
  }    

// variable declaration
let topTextSlot;
let bottomTextSlot;
let leftTextSlot;
let rightTextSlot;
let temp;

// initial onload command & shuffle command
function initial() {
    array = shuffle(array);
    topTextSlot = document.getElementById("topTextSlot");
        topTextSlot.innerHTML = array [0];
    bottomTextSlot = document.getElementById("bottomTextSlot");
        bottomTextSlot.innerHTML = array [1];
    leftTextSlot = document.getElementById("leftTextSlot");
        leftTextSlot.innerHTML = array [2];
    rightTextSlot= document.getElementById("rightTextSlot")
        rightTextSlot.innerHTML = array [3];
}

//Compass Button
function switchLeftRight() {
    temp = leftTextSlot.innerHTML;
    leftTextSlot.innerHTML = rightTextSlot.innerHTML;
    rightTextSlot.innerHTML = temp;
}

function switchBottomRight() {
    temp = bottomTextSlot.innerHTML;
    bottomTextSlot.innerHTML = rightTextSlot.innerHTML;
    rightTextSlot.innerHTML = temp;
}

function switchLeftTop() {
    temp = leftTextSlot.innerHTML;
    leftTextSlot.innerHTML = topTextSlot.innerHTML;
    topTextSlot.innerHTML = temp;   
}

// Restart Button 

function restart() {
    document.getElementById("updateButton").disabled = false;
    document.getElementById("topText").disabled = false;
    document.getElementById("bottomText").disabled = false;
    document.getElementById("rightText").disabled = false;
    document.getElementById("leftText").disabled = false;
    leftTextSlot.innerHTML = "";
    topTextSlot.innerHTML = "";
    rightTextSlot.innerHTML = "";
    bottomTextSlot.innerHTML = "";
}

//Update Button

function update() {
    leftTextSlot.innerHTML = document.getElementById("leftText").value;
    topTextSlot.innerHTML = document.getElementById("topText").value;
    bottomTextSlot.innerHTML = document.getElementById("bottomText").value;
    rightTextSlot.innerHTML = document.getElementById("rightText").value;
    document.getElementById("updateButton").disabled = true;
    document.getElementById("topText").disabled = true;
    document.getElementById("bottomText").disabled = true;
    document.getElementById("rightText").disabled = true;
    document.getElementById("leftText").disabled = true;
    alert ("Update buttona and text box are now disabled");
}
