//this is a single line comment in js
//
/* BLOCK COMMENT - good for whole sections being turned off*/
//

//string ***********************************************************************************
//
//VARIABLES
//sting type of data
//var userName = "jason"; //setting a variable
//
//userName = "bob";  //using a variable
//
// the = is the assignment operator
//
var firstName = "devin";
var lastName = "norris";

// bad variable names 
//var hi there = "something"
//var time = "12:30"; //  //time is a reserve keyword

//var variable12222 = "whaaa"; is far to confusing 

//USING SINGLE AND DUBBLE QUOTE
//var myComment = "who said this";
//var myQuote = '"all the world\'s a stage"'; //single quotes print literal charaters 
//var myQuote = "all the world's a stage";

//
//console.log(myComment);//shows the value of my comment to the console, when we reaload
//console.log(myQuote);

var message = firstName + " " + lastName; //joinging two variables 
//console.log(message);
//target and replace, elements on the page...
var string1 = document.getElementById("string1");
string1.innerHTML = message;
var imagePath = 'images/water-color/thumbs/artwork_01.jpg';
console.log(imagePath);
message= message.toUpperCase();
console.log(message)


//NUMBER***********************************************************************************
var level = 1;
var lifes = 3;
var ssNumber= 2342232222;  //this is integer
var cost = 1.50;//this is a float type number
var cost1 = 50;
var cost2 = 50;
var total = cost1 + cost2;//preform math
//console.log(total);
//
//console.log(level);

// ARRAY**********************************************************************************
//create an arrary

var imagelist = new Array; 
imagelist[0] = "images/oil/thumbs/artwork_1.jpg";
imagelist[1] = "images/oil/thumbs/artwork_2.jpg";
imagelist[2] = "images/oil/thumbs/artwork_3.jpg";
imagelist[3] = "images/oil/thumbs/artwork_4.jpg";
imagelist[4] = "images/oil/thumbs/artwork_5.jpg";
imagelist[5] = "images/oil/thumbs/artwork_6.jpg";
imagelist[6] = "images/oil/thumbs/artwork_7.jpg";

//imagelist.push("images/oil/thumbs/artwork_8.jpg";
var imagePlaceholder = document.getElementById('placeholder');
imagePlaceholder.setAttribute("src", imagelist[2]);

console.log(imagelist.length);


// boolean DATA TYPE  **********************************************************************************

// true or false, yes or no, 1 or 0

var oldEnough = false;

var hasContent = true;

var age = 18;
//chack the age

// ifthen statements (branching logic, application logic, buisness logic)  ***************************
if (age <= 20 && age != 5){
    //to young
    oldEnough = false;
}else{
    oldEnough = true;
}
if (oldEnough == true){
    //== means is equal to
    //= get set to
    //more code here
    console.log("you can enter!");
}else{
    console.log("get the fuck outa here")
}

// functions  **********************************************************************************

//
function dynamicGreeting(){
    //create the built-in dare object 
    var now = new Date();
    var time = now.getHours();//extract the hours
    
    if(time < 12){
        alert("good morning");
    }
    if(time == 12){
        alert("time to eat lunch");
    }
    if(time > 12){
        alert("good evening, the time is..." + now.toLocaleString());
    }
}

dynamicGreeting();

                            