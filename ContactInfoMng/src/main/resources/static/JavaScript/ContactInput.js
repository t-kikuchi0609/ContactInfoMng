$(function() {
	$('#submit').click(function() {
		agreeCheck();
	if($('#agreeCheck:visible').length == 1) {
		return false;
	}
        //この辺りから書く
		if(
	      (($('input[name = "tel1"]').val() == '070' && $('input[name = "tel2"]').val().length == 4 && $('input[name = "tel3"]').val().length == 4)) ||
	      (($('input[name = "tel1"]').val() == '080' && $('input[name = "tel2"]').val().length == 4 && $('input[name = "tel3"]').val().length == 4)) ||
	      (($('input[name = "tel1"]').val() == '090' && $('input[name = "tel2"]').val().length == 4 && $('input[name = "tel3"]').val().length == 4)) ||
	      (($('input[name = "tel1"]').val() == '050' && $('input[name = "tel2"]').val().length == 4 && $('input[name = "tel3"]').val().length == 4)) ||
	      (($('input[name = "tel1"]').val().length == 2 && $('input[name = "tel2"]').val().length == 4 && $('input[name = "tel3"]').val().length == 4)) ||
	      (($('input[name = "tel1"]').val().length == 3 && $('input[name = "tel2"]').val().length == 3 && $('input[name = "tel3"]').val().length == 4)) ||
	      (($('input[name = "tel1"]').val().length == 4 && $('input[name = "tel2"]').val().length == 2 && $('input[name = "tel3"]').val().length == 4)) ||
	      (($('input[name = "tel1"]').val().length == 5 && $('input[name = "tel2"]').val().length == 1 && $('input[name = "tel3"]').val().length == 4))){
				var flg = 0;
				var error1 = ("");
				var error2 = ("");
				var error3 = ("");
				var error4 = ("");
				var error5 = ("");
				var error6 = ("");
				flg = 0 + flg;
	       }else{
				error1 = ("電話番号は合計で11桁以下で入力してください\n");
	         	flg += 1;
	       }
       
	    //許ちゃん式正しい書き方
		//0の半角確認 tel
		if((/^0[0-9]+$/.test($('input[name = "tel1"]').val())) &&
		   (/^[0-9]+$/.test($('input[name = "tel2"]').val())) &&
		   (/^[0-9]+$/.test($('input[name = "tel3"]').val()))){
			flg += 0;
		}else{
			error2 = ("電話番号は半角数字で入力してください\n");
			flg += 1;
		}

	    //post_codeの条件   
	   if((($('input[name = "post_code1"]').val() == '') || ($('input[name="post_code1"]').val().length==3)) &&
	     (($('input[name = "post_code2"]').val() == '') || ($('input[name="post_code2"]').val().length ==4))){
			flg += 0;
	   } else {
			error3 = ("郵便番号は3桁+4桁で入力してください\n");
			flg += 1;
		}


		//半角確認 post_code
		if((/^[0-9]+$/.test($('input[name = "post_code1"]').val())) && (/^[0-9]+$/.test($('input[name = "post_code2"]').val())) ||
		($('input[name = "post_code1"]').val()=='') && ($('input[name = "post_code2"]').val()=='')){
			flg += 0;
		}else{
			error4 = ("郵便番号は半角で入力してください\n");
			flg += 1;
		}

		//メールフォーマットチェック
		if(/^[a-zA-Z0-9_+-]+(\.[a-zA-Z0-9_+-]+)*@([a-z][a-z-]*[a-z]*\.)+[a-z]{2,}$/.test($('input[name="mall"]').val())){
			flg += 0;
		}else{
			error5 = ("メールアドレスの形式が正しくありません\n");
			flg += 1;
		}



		if(flg > 0){
			alert(error1 + error2 + error3 + error4 + error5);
			return false;
		}else{
			return true;
		}


 	});
 	
      $('[name="agree"]').change(function() {
        agreeCheck();
      });

});



    function agreeCheck() {
      if(!$('[name="agree"]').is(':checked')) {
        $('#agreeCheck').fadeIn();
        $('#submit').attr('disabled', 'true');
      } else {
        $('#agreeCheck').hide();
        $('#submit').removeAttr('disabled');
      }
    }