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

var numberOfQuestions = 1;
var options = [];

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

function askAgain(num) {
    for (let i = 0; i < num; i++) {
        var p = document.createElement('p');
        var txt = document.createTextNode('What is option number ' + (i++) + '?');
        p.appendChild(txt);
        var element = document.getElementById('main');
        element.appendChild(p);


    }
}

function setNum(num) {
    numberOfQuestions = num;
}

function hide() {
    document.getElementById('options').style.display = "none";
}

function unHide() {
    document.getElementById('options').style.display = "block";
}

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

function postData() {
    var val = document.getElementById("form").value;

        var tbl = "<table><tr><td>"+val+"</td></tr></table>";

        var w = window.open("page2.html");

        w.document.write(tbl);
}
