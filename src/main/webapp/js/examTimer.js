//localStorage.setItem("examTime", 300);
var count =localStorage.getItem("examTime");
var playing;
function countdown(){
  displayTime(); 
  if (count == 0) {
    alert("Time up");
   // localStorage.removeItem("examTime");
   
  } else{
    localStorage.setItem("examTime",count);
    setTimeout(countdown, 100);
    if(localStorage.getItem("examTime")>=0){
    count--;
    }
  }
}
countdown();
function displayTime() {

  var tenths = count;  
  var sec = Math.floor(tenths / 10);
  var hours = Math.floor(sec / 3600);
  sec -= hours * (3600);
  var mins = Math.floor(sec / 60);
  sec -= mins * (60);

  if (hours < 1) {
    document.getElementById('exam_time').innerHTML = LeadingZero(mins)+':'+LeadingZero(sec);
  }
  else {
    document.getElementById('exam_time').innerHTML = hours+':'+LeadingZero(mins)+':'+LeadingZero(sec);
  }
}

function LeadingZero(Time) {
  return (Time < 10) ? "0" + Time : + Time;
}