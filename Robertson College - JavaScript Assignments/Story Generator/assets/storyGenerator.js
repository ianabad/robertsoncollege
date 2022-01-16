"use strict;"

// Var Declation
let story = document.getElementById("story");
let generatedStory = document.getElementById("generatedStory");
let initialPage = document.getElementById("initialPage");
let sampleVariable;


// Functions - Done Button
function doneButton(form) {
    generatedStory.style.display = "block";
    // initialPage.style.display = "none";

    for (i=0; i< 5; i++)
        
        if (form.elements[i].value == "") {
            story.children[i].innerHTML = "<span class=\"red\">&lt;a missing text&gt;</span>";
        } else {
            story.children[i].innerHTML = form.elements[i].value;
        }    

    initialPage.style.display = "none";

    document.getElementById("storyForm").reset();

    }


//Function Restart Button
function returnButton() {
    generatedStory.style.display = "none";
    initialPage.style.display = "block";
}
