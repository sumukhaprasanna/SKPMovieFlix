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
        $('#flix-navbar').addClass('bck-sparkle').removeClass('bck-trans');
      } else {
        $('#flix-navbar').addClass('bck-trans').removeClass('bck-sparkle');
      }
    });

    //new release
    var newReleasePoster = document.getElementById('new-release-list');
    var html = '<div class="movie-tile"';
    for (var i = 0; i < 25; i++) {
      html += "><img id=flix-play-" + i + " src=" + movieData[i].Poster + "";
    }
    html += "</div>";
    newReleasePoster.innerHTML = html;

    //trending
    var trendingPoster = document.getElementById('watch-trending-list');
    var htmlTrending = '<div class="movie-tile"';
    for (var j = 25; j < 50; j++) {
      htmlTrending += "><img id=flix-play-" + j + " src=" + movieData[j].Poster + "";
    }
    htmlTrending += "</div>";
    trendingPoster.innerHTML = htmlTrending;

    //favorite
    var favoritePoster = document.getElementById('watch-favorite-list');
    var htmlFavorite = '<div class="movie-tile"';
    for (var k = 45; k < 64; k++) {
      htmlFavorite += "><img id=flix-play-" + k + " src=" + movieData[k].Poster + "";
    }
    htmlFavorite += "</div>";
    favoritePoster.innerHTML = htmlFavorite;

    //Action & Adventure
    var adventurePoster = document.getElementById('watch-adventure-list');
    var htmlAdventure = '<div class="movie-tile"';
    for (var l = 5; l < 24; l++) {
      htmlAdventure += "><img id=flix-play-" + l + " src=" + movieData[l].Poster + "";
    }
    htmlAdventure += "</div>";
    adventurePoster.innerHTML = htmlAdventure;
 
    //Comedies
    var comidiesPoster = document.getElementById('watch-comedies-list');
    var htmlComedies = '<div class="movie-tile"';
    for (var m = 30; m < 40; m++) {
      htmlComedies += "><img id=flix-play-" + m + " src=" + movieData[m].Poster + "";
    }
    htmlComedies += "</div>";
    comidiesPoster.innerHTML = htmlComedies;

    //TV Dramas
    var dramaPoster = document.getElementById('watch-dramas-list');
    var htmlDramas = '<div class="movie-tile"';
    for (var n = 10; n < 25; n++) {
      htmlDramas += "><img id=flix-play-" + k + " src=" + movieData[n].Poster + "";
    }
    htmlDramas += "</div>";
    dramaPoster.innerHTML = htmlDramas;

    //Documentaries
    var documentariesPoster = document.getElementById('watch-documentaries-list');
    var htmlDocumentaries = '<div class="movie-tile"';
    for (var o = 45; o < 65; o++) {
      htmlDocumentaries += "><img id=flix-play-" + o + " src=" + movieData[o].Poster + "";
    }
    htmlDocumentaries += "</div>";
    documentariesPoster.innerHTML = htmlDocumentaries;

    var x = $(".tile-wrapper").offset();
    var b = parseInt(x.left);
    $(".tile-wrapper").attr('scrollVal',b); 

     $(".prev").on('click', function(event) {
        var ele = $(this).siblings( ".tile-wrapper" );
        var z = parseInt($(ele).attr('scrollVal'));
        var z1 = parseInt($(".prev").offset().left);
        var z2 = parseInt($(".next").offset().left);
        var z3 = (2*z2);
        if((z > z1 || z == z1) && z < z3){
        $(ele).scrollLeft(z+450);
        $(ele).attr('scrollVal', z+450);
        }
    });

    $(".next").on('click', function(event) {
        var ele = $(this).siblings( ".tile-wrapper" );
        var z = parseInt($(ele).attr('scrollVal'));
        var z1 = parseInt($(".prev").offset().left);
        var z2 = parseInt($(".next").offset().left);

        if(z > (z1-450) && z != z1){
        $(ele).scrollLeft(z-450);
        $(ele).attr('scrollVal', z-450);
        }
        if(z == z1){
         $(ele).scrollLeft(0);
         $(ele).attr('scrollVal', z1); 
        }
    });
  });
})();
