(function() {
  window.onbeforeunload = function() {
    window.scrollTo(0, 0);
  };

  $(document).ready(function() {

    var scroll_pos = 0;
    var filx_scroll = $('#flixhome');
    var flix_nav = filx_scroll.offset();
    $(document).scroll(function() {
      scroll_pos = $(this).scrollTop();
      if (scroll_pos > flix_nav.top) {
        $('#flix-navbar').css('background-color', '#000000');
      } else {
        $('#flix-navbar').css('background-color', 'transparent');
      }
    });
})();
