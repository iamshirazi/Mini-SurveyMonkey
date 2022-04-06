/* Stores filled-in question to Question.java and the repository
 * in AccessingDataJpaApplication.
 */
function addItem() {
    var ordlist = document.getElementById('destination');
    var quest = document.getElementById('quest');
    var type = document.getElementByName('type');
    var option = document.getElementByName('option');
    var li = document.createElement('li');
    li.setAttribute('quest', '${questions.quest}');
    li.setAttribute('type', '${questions.type}');
    li.setAttribute('option', '${questions.option}');
    li.appendChild(document.createTextNode(question.value + ", "));
    li.appendChild(document.createTextNode(questionType.value + ", "));
    li.appendChild(document.createTextNode(options.value));
    ordlist.appendChild(li);
}

$(function(){
    $('a[href$="/questions"]').each(function(){
        this.href = this.href.replace(/\/delete$/, "");
        $(this).attr("data-method", "questions").attr("data-confrim", "Are you sure?");
    });
})

/* --------- FROM PROCESS.JS -------- */
// VARIABLES
var numberOfQuestions = 1;
var options = [];

/* CREATES ENTRIES FOR THE USER TO ENTER THEIR QUESTIONS, BASED
 * ON THEIR ANSWER (HOW MANY QUESTIONS THEY WANT FOR THEIR SERVEY)
 */
function questionNum() {

    for (var i = 0; i < numberOfQuestions; i++) {

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
