/**
 * @author  AaronJiang
 * @date    2018/05/03
 * @mail    1327994105@qq.com
 * @description login
 * @version 1.0
 */

$(function(){

    $(".go-btn").on("click",function(){
        $(this).css({
            backgroundColor:"rgba(255,106,106,1)",
            border:"1px solid rgba(255,106,106,1)",
            boxShadow:"0 0 6px 7px rgba(255,106,106,0.5)"
        })
    })


    // //背景轮换
    // var i = 1;
    // setInterval(function(){
    //     if(i>2){
    //         i=1;
    //     }
    //     var img = "../static/image/loginbg/"+i+".jpg";
    //     $(".background-image").animate({
    //         background:"url("+img+") no-repeat center fixed",
    //         backgroundSize:"cover"
    //     },300);
    //     i++;
    // },2000);

    //控制音乐
    $(".control-audio-btn").on("click",function(){
        var $audio = $("#bg-audio");
        if($audio.paused){
            $audio.play();
            $(this).css({color:"rgba(255,255,0,1)"});
        } else{
            $audio.pause();
            $(this).css({color:"rgba(255,69,0,1)"});
        }
        $("#audio-icon").toggleClass("icon-zanting");
        $("#audio-icon").toggleClass("icon-bofang");
    });
})()
