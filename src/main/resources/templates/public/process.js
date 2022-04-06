// VARIABLES
var numberOfQuestions = 1;
var options = [];

/* CREATES ENTRIES FOR THE USER TO ENTER THEIR QUESTIONS, BASED
 * ON THEIR ANSWER (HOW MANY QUESTIONS THEY WANT FOR THEIR SERVEY)
 */
function questionNum() {

    for (var i = 0; i < numberOfQuestions; i++) {
    /*
        var h21 = document.createElement('h2'); // What is the first question?
        h21.textContent = "What is question number" + (i++) + "?";
        var txt = document.createElement('INPUT') // textbox (QUESTION ASKED)
        txt.setAttribute("type", "text");
        var h22 = document.createElement('h2'); // h2 (What type of question?)
        h22.textContent = "What type of question is it?";
        var rad = document.createElement("INPUT"); //radio buttons (checkbox, radio, text)
        rad.setAttribute("type", "radio");
*/
        var tag = document.createElement('p');
        var text = document.createTextNode("What is question number " + i + "?");
        tag.appendChild(text);
        var element = document.getElementById('main1');
        element.appendChild(tag);

    }
    var sub = document.createElement('INPUT');
    sub.setAttribute("type", "submit");
}

// Creates <p> element that asks how many options there are for their question
function createStuff() {
    var tag = document.createElement('p');
    var text = document.createTextNode('How many options are there for your question?');
    tag.appendChild(text);
    var element = document.getElementById('main');
    element.appendChild(tag);

    var num = document.createElement('INPUT');
    num.setAttribute("type", "text"); // input type=number
    num.setAttribute("id", "num");
    element.appendChild(num);

    //number list
    var radi = document.createElement('INPUT');
    var t

    /*
    var but = document.createElement('INPUT');
    var number = parseInt(document.getElementById("num")); //// number is immediately set to NaN for some reason
    but.setAttribute("type", "button");
    but.setAttribute("onclick", 'askAgain(" ' +number+ ' ")');
    but.setAttribute("value", "Enter");
    element.appendChild(but);
    */
    //askAgain(number);
    //<input id="num" type="number" min="0" max="4">
    //var h2 = document.createElement("h2");
    //h2.textContent = "How many options are there for your question?";
                /*
                document.write("<form action='' method='post'>
                                <input id='num' type='number' min='0' max='4'>
                                <input onclick='questionNum()' type='submit' value='Submit'>
                                </form>");
                */
}

// Creates entries for the user to enter what options they want.
function askAgain(num) {
    for (let i = 0; i < num; i++) {
        var p = document.createElement('p');
        var txt = document.createTextNode('What is option number ' + (i++) + '?');
        p.appendChild(txt);
        var element = document.getElementById('main');
        element.appendChild(p);


    }
}

// SETS THE NUMBER OF QUESTIONS.
function setNum(num) {
    numberOfQuestions = num;
}

// HIDES THE "OPTIONS" SECTION IF THE USER CHOOSES A TEXT QUESTION.
function hide() {
    document.getElementById('options').style.display = "none";
}

/* UNHIDES THE "OPTIONS" SECTION IF USER CHOOSES A RADIO BUTTONS QUESTION
 * OR CHECKBOX QUESTION.
 */
function unHide() {
    document.getElementById('options').style.display = "block";
}

/* SETS THE NUMBER OF OPTIONS TO CHOOSE FROM.
 * EXAMPLE... 3 OPTIONS IN A "FAVOURITE FOOD" RADIO BUTTON QUESTION: PIZZA,
 * BUTTER CHICKEN, OR FAJITAS.
 * PRINTS OUT A NUMBER OF OPTIONS FOR THE USER TO CUSTOMISE.
 */
function setOptionNum(val) {
    var num = parseInt(val);
    console.log(num);

    for (let i = 0; i < num; i++) {
        var p = document.createElement('p');
        var txt = document.createTextNode('Option ' + (i+1) + '?');
        p.appendChild(txt);
        var box = document.createElement('INPUT');
        box.setAttribute("type", "text"); //text box
        var element = document.getElementById('optionSection');
        element.appendChild(p);
        element.appendChild(box);
    }
}

// RETRIEVES THE DATA FROM THE FORM AND OPENS A NEW PAGE
function postData() {
    var val = document.getElementById("form").value;

        var tbl = "<table><tr><td>"+val+"</td></tr></table>";

        var w = window.open("page2.html");

        w.document.write(tbl);
}
