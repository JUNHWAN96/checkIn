(function(window, document, $) {
        var url = window.location.href;

        // <ul id="main-menu-navigation"> ul태그 안에 a태그들을 찾는다
        var menu = $('#main-menu-navigation').children().find('a');
        var navItem = $('#main-menu-navigation').children();
        $.each(menu,function(idx,item){
            //a 태그의 href 값이랑 현재 주소랑 같을경우 active 클레스 처리 아닐경우 nav-item
            if(item.href == url){
                 $('#main-menu-navigation').children()[idx].className = 'active';
            }else{
                 $('#main-menu-navigation').children()[idx].className = 'nav-item';
            }
        });
})(window, document, jQuery);


