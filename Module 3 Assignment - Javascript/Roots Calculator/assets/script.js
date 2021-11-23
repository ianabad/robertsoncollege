"use strict";

// Var Declaration

// var for input values & validation
let aInput;
let aValueAsNumber;
let aValid = true;
let bInput;
let bValueAsNumber;
let bValid = true;
let cInput; 
let cValueAsNumber;
let cValid = true;

// var for formula 
let rootsOne;
let rootsTwo;
let bSquare;
let fourAC;
let rootPart;
let denom;

// var for alerts
const alert1 = "Invalid entry for a. Must be a non-zero integer between -99 and +99";
const alert2 = "Invalid entry for b. Must be an integer between -99 and +99";
const alert3 = "Invalid entry for c. Must be an integer between -99 and +99";


/*---------------------------------------------------------------------------*/

// Calculation and IFS Statements
function calculate() {

    // to put input value as number - it is bit redundant because it was not working on my pc when I only did aInput
    aInput = document.getElementById("aInput").valueAsNumber;
        aValueAsNumber = parseFloat(aInput); 
    bInput = document.getElementById("bInput").valueAsNumber;
        bValueAsNumber = parseFloat(bInput);
    cInput = document.getElementById("cInput").valueAsNumber;
        cValueAsNumber = parseFloat(cInput);

    // initialization for the formula
    bSquare = bValueAsNumber ** 2;
    fourAC = 4 * aValueAsNumber * cValueAsNumber;
    denom = 2 * aValueAsNumber;
    rootPart = Math.sqrt(bSquare - fourAC);
    rootsOne = ((-bValueAsNumber + rootPart)/denom).toFixed(3);
    rootsTwo = ((+bValueAsNumber + rootPart)/denom).toFixed(3);

    // Value validation
    if (aValueAsNumber % 1 != 0 || aValueAsNumber == 0 || aValueAsNumber < -99 || aValueAsNumber > 99) {
        aValid = false;
        document.getElementById("aInput").style.borderColor = "red";
        document.getElementById("solution").innerHTML = "";
    }
        else {
            aValid = true;
            document.getElementById("aInput").style.borderColor = ""; 
        } // end of else

    if (bValueAsNumber % 1 != 0 || bValueAsNumber < -99 || bValueAsNumber > 99) {
        bValid = false;
        document.getElementById("bInput").style.borderColor = "red";
        document.getElementById("solution").innerHTML = "";
    }
        else {bValid = true;
            document.getElementById("bInput").style.borderColor = ""; 
        } // end of else
    if (cValueAsNumber % 1 != 0 || cValueAsNumber < -99 || cValueAsNumber > 99) {
        cValid = false;
        document.getElementById("cInput").style.borderColor = "red";
        document.getElementById("solution").innerHTML = "";
    }
        else {cValid = true
            document.getElementById("cInput").style.borderColor = ""; 
        } // end of else

/*---------------------------------------------------------------------------*/

    // alerts
    if (aValid == false && bValid == false && cValid == false) {
        alert(alert1 + '\n' + alert2  +'\n' + alert3); 
    }
    else if (aValid == false && bValid == false) {
        alert(alert1 + '\n' + alert2);
    }
    else if (bValid == false && cValid == false) {
        alert(alert2  +'\n' + alert3);
    }
    else if (aValid == false && cValid == false) {
        alert(alert1 + '\n' + alert3);
    }
    else if (aValid == false) {
        alert(alert1);
    }
    else if (bValid == false) {
        alert(alert2);
    }
    else if (cValid == false) {
        alert(alert3);
    } 
    else if (bSquare < fourAC) { // First Solution
        document.getElementById("solution").innerHTML = "Solution: <em>x</em>\'s roots are imaginary";
    }
    else if (bSquare == fourAC) { // Second Solution
        document.getElementById("solution").innerHTML = "Solution: <em>x</em> = " + rootsOne;
    }
    else if (bSquare > fourAC) { // Third Solution
        document.getElementById("solution").innerHTML = "Solution: <em>x</em> = " + rootsOne + ", <em>x</em> = " + rootsTwo;
    }
    // end of else 

}



// https://gist.github.com/moitorrijos/4980258 credit for the root formula