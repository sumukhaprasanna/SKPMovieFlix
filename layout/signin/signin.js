/**
 * Created by darac on 7/6/2016.
 */
$(document).ready(function(){

  $("#signin-btn").on('click', function(e){
    e.preventDefault();
    window.location.href="../member/member.home.html";
  });

  $("#already-btn").on('click', function(e){
    e.preventDefault();
    window.location.href="../signup/signup.html";
  });
})
