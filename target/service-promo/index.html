<!DOCTYPE html>
<html>
<head>
 <link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
 <link href="http://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker.min.css" rel="stylesheet">
 <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.0.3/css/font-awesome.min.css" rel="stylesheet">
 <link href="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.0/summernote.css" rel="stylesheet">
 <style>
			* {box-sizing: border-box;}
			ul {list-style-type: none;}
			body {font-family: Verdana, sans-serif; width: 100%;}

			.month {
					padding: 25px 25px;
					width: 100%;
					background: #1abc9c;
					text-align: center;
			}

			.month ul {
					margin: 0;
					padding: 0;
			}

			 .container.first {
			 	width: 100%;
				display: flex;                  /* establish flex container */
				flex-direction: row;            /* default value; can be omitted */
				flex-wrap: nowrap;              /* default value; can be omitted */
				justify-content: space-between; /* switched from default (flex-start, see below) */
				background-color: lightyellow;
			}

			.container.first div.pad {
				padding-right:5%;
				padding-top: 15px;
			}

			.month ul li {
					color: white;
					font-size: 20px;
					text-transform: uppercase;
					letter-spacing: 3px;
			}

			.month .prev {
					float: left;
					padding-top: 10px;
			}

			.month .next {
					float: right;
					padding-top: 10px;
			}

			.reset {
			 		margin-top: -3%;
    			margin-right: -95%;
	 }

			#month {
				width: 20%;
				margin-left: 40%;
				padding-left: 5%;
				background: #1abc9c;
				color: white;
			}

			#month option {
				background: white;
				color: black;
			}

			.error_promo {
				color:red;
				display: none;
			}

			#year {
				width: 20%;
				height:auto;
				margin-left: 40%;
				padding-left: 5%;
				background: #1abc9c;
				color: white;
				font-size: 25px;
			}

			#year option {
				background: white;
				color: black;
				font-size: 15px;
			}

			.weekdays {
					margin: 0;
					padding: 10px 0;
					background-color: #ddd;
			}

			.weekdays li {
					display: inline-block;
					width: 13.6%;
					color: #666;
					text-align: center;
			}

			.days {
					padding: 10px 0;
					background: #eee;
					margin: 0;
			}

			.days li {
					list-style-type: none;
					display: inline-block;
					width: 13.6%;
					height:75px;
					text-align: center;
					font-size: 15px;
					color: #777;
			}

			.prev_month{
				opacity: 0.5;
			}

			.next_month{
				opacity: 0.5;
			}

			.days li .active {
					padding: 5px;
					background: #1abc9c;
					color: white !important
			}

			.days li.active {
					background: #80ccff;
			}

			.input-group-addon.def {
				width: 35%;
				text-align: left;
			}

			.input-group {
				width: 100%;
			}

			/* Add media queries for smaller screens */
			@media screen and (max-width:720px) {
					.weekdays li, .days li {width: 13.1%;}
			}

			@media screen and (max-width: 420px) {
					.weekdays li, .days li {width: 12.5%;}
					.days li .active {padding: 2px;}
			}

			@media screen and (max-width: 290px) {
					.weekdays li, .days li {width: 12.2%;}
			}
		</style>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.15.1/moment.min.js"></script>
</head>
<body>
<div class="container first">
 <div class="pad" style="width:50%;">
  <div class="month">
   <button type="button" class="btn reset">Reset</button>
   <ul>
    <select class="form-control" id="year">
    </select><br>
    <li class="prev" onclick="prev()">&#10094;</li>
    <li class="next" onclick="next()">&#10095;</li>
    <li class="month_name">
     <select class="form-control" id="month">
     </select>
     </span>
    </li>
   </ul>
  </div>

  <ul class="weekdays">
   <li>Mo</li>
   <li>Tu</li>
   <li>We</li>
   <li>Th</li>
   <li>Fr</li>
   <li>Sa</li>
   <li>Su</li>
  </ul>

  <ul class="days">
  </ul>
 </div>
 <div class="pad" style="width:50%;">
  <div class="container" style="width:100%;">
   <ul class="nav nav-tabs">
    <li><a data-toggle="tab" href="#menu1">Register Promo</a></li>
    <li><a data-toggle="tab" href="#menu2">Edit Promo</a></li>
   </ul>
   <div class="tab-content">
    <div id="menu1" class="tab-pane in active">
     <div class="input-group create pad">
      <span class="input-group-addon def"><b>Promo Code</b></span>
      <input type="text" class="input-sm form-control" id="promoCode">
     </div>
     <div class="error_promo">Error Coy .....</div>
     <div class="input-daterange input-group pad" id="datepicker">
      <span class="input-group-addon def"><b>From</b></span>
      <input type="text" class="input-sm form-control" name="start" id="startDate"/>
      <span class="input-group-addon"><b>To</b></span>
      <input type="text" class="input-sm form-control" name="end" id="endDate"/>
     </div>
     <div class="input-group create pad">
      <span class="input-group-addon def"><b>Promo Link</b></span>
      <input type="text" class="input-sm form-control" id="promoLink">
     </div>
     <div class="input-group">
      <br><label>Description: </label>
      <textarea id="summernote">
						<!--<p class="text-primary alert-warning alert lead">-->
							</textarea>
     </div>
     <div class="input-group create pad container first">
      <div>
       <button type="button" class="btn" id="resetPromo"><b>Reset</b></button>
      </div>
      <div>
       <button type="button" class="btn" id="submitPromo"><b>Submit</b></button>
      </div>
     </div>
    </div>
    <div id="menu2" class="tab-pane">

    </div>
   </div>
  </div>
 </div>
 <!--Elemen bawah-->
</div>
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script src="http://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.0/summernote.min.js"></script>
<script src="https://rawgit.com/creativeprogramming/summernote-addclass/master/summernote-ext-addclass.js"></script>
<script>
			var monthNames = ["January", "February", "March", "April", "May", "June",
  											"July", "August", "September", "October", "November", "December"];
			var d;
			var curDate;
			var curMonth;
			var curYear;
			var yearMax;
			var yearMin;

			function printDate(date){
				var now = new Date(date);

				var totalDate 	= new Date(now.getFullYear(), now.getMonth()+1, 0).getDate();
				var firstMonth 	= new Date(now.getFullYear(), now.getMonth(), 1).getDay();
				var lastMonth 	= new Date(now.getFullYear(), now.getMonth(), totalDate).getDay();
				var monthName 	= monthNames[now.getMonth()];
				curMonth 				= monthName;
				curYear 				= now.getFullYear();

				$('#month').val(now.getMonth());
				$('#year').val(curYear);

				if(firstMonth != 1){
					if(firstMonth == 0){
						appendPrev(6, now);
					}
					else{
						appendPrev(firstMonth - 1, now);
					}
				}

				for(var i = 1; i <= totalDate; i++){
					if(i == now.getDate()){
						$(".days").append('<li class="cur_month active"><span class="active"><b>'+i+'</b></span></li>');
					}
					else{
						$(".days").append('<li class="cur_month"><span><b>'+i+'</b></span></li>');
					}
				}

				if(lastMonth != 0){
					appendNext((7 - lastMonth))
				}
			}

			function appendNext(total){
				for(var i = 1; i <= total; i++){
					$(".days").append('<li class="next_month"><span>'+i+'</span></li>');
				}
			}

			function appendPrev(total, date){
				for(var i = 0; i < total; i++){
					var prevMonth = new Date(date.getFullYear(), date.getMonth(), (i +1 - total)).getDate();
					$(".days").append('<li class="prev_month"><span>'+prevMonth+'</span></li>');
				}
			}

			function setDate(date){
				d =  new Date(date);
			}

			function next(){
				d = moment(d).add(1, 'months');
				$('li').remove(".days > li")
				printDate(d);
			}

			function prev(){
				d = moment(d).subtract(1, 'months');
				$('li').remove(".days > li")
				printDate(d);
			}

			function setMonthDropdown(){
				for(var i = 0; i < monthNames.length; i++){
  				$('#month').append('<option value="'+i+'">'+monthNames[i]+'</option>')
  			}
			}

			function setYearDropdown(d){
				yearMin = d.getFullYear() - 25;
				yearMax = d.getFullYear() + 25;

				for(var i = yearMin; i <= yearMax; i++){
  				$('#year').append('<option value="'+i+'">'+i+'</option>');
  			}
			}

			$(document).on("click", ".days > li.cur_month",function() {
				curDate = $(this).text();
				d = new Date(curYear+"/"+curMonth+"/"+curDate);
				$('.days > li > span').removeClass('active');
				$('.days > li').removeClass('active');
				var el = $(this).children('span') //Wajib masuk dalam var
				el.addClass('active');
				el.parent().addClass('active');
			});

			$(document).on("click", ".days > li.prev_month",function() {
				curDate = $(this).text();
				var temp = moment(d).subtract(1, 'months');
				var now = new Date(temp)
				d = new Date(now.getFullYear()+"/"+(now.getMonth()+1)+"/"+curDate);
				$('li').remove(".days > li")
				printDate(d);
			});

			$(document).on("click", ".days > li.next_month",function() {
				curDate = $(this).text();
				var temp = moment(d).add(1, 'months');
				var now = new Date(temp)
				d = new Date(now.getFullYear()+"/"+(now.getMonth()+1)+"/"+curDate);
				$('li').remove(".days > li")
				printDate(d);
			});

			$(document).on("change", "#month",function() {
				var a = $(this).val();
       	var b = curYear+"/"+(parseInt(a)+1)+"/"+curDate;
      	d = new Date(b);
   			$('li').remove(".days > li")
				printDate(d);
			});

			$(document).on("change", "#year",function() {
				var a = $(this).val();
      	var b = a+"/"+curMonth+"/"+curDate;
      	d = new Date(b);
      	$('li').remove(".days > li")
				printDate(d);
			});

			$(document).on("click", ".reset",function() {
				d = new Date();
				curDate = d.getDate();
				$('li').remove(".days > li")
				printDate(d);
			});

			$('.input-daterange').datepicker({
				format: "dd/mm/yyyy",
				weekStart: 1,
				todayBtn: "linked",
				clearBtn: true,
				calendarWeeks: true,
				autoclose: true,
				todayHighlight: true
			});

			$('#summernote').summernote({
					addclass: {
							debug: false,
							classTags: [{title:"Button","value":"btn btn-success"},"jumbotron", "lead","img-rounded","img-circle", "img-responsive","btn", "btn btn-success","btn btn-danger","text-muted", "text-primary", "text-warning", "text-danger", "text-success", "table-bordered", "table-responsive", "alert", "alert alert-success", "alert alert-info", "alert alert-warning", "alert alert-danger", "visible-sm", "hidden-xs", "hidden-md", "hidden-lg", "hidden-print"]
					},
					height: 250,
					toolbar: [
							// [groupName, [list of button]]
							['img', ['picture']],
							['style', ['style', 'addclass', 'clear']],
							['fontstyle', ['bold', 'italic', 'ul', 'ol', 'link', 'paragraph']],
							['fontstyleextra', ['strikethrough', 'underline', 'hr', 'color', 'superscript', 'subscript']],
							['extra', ['video', 'table', 'height']],
							['misc', ['undo', 'redo', 'codeview', 'help']]
					]
			});

			$(document).on("click", "#submitPromo",function() {
		   var data = {};
		   data["promoCode"]   = $('#promoCode').val();
		   data["startDate"]   = $('#startDate').val();
			  data["endDate"]     = $('#endDate').val();
		   data["promoLink"]   = $('#promoLink').val();
		   data["promoDesc"]   = $('.note-editable.panel-body').html();

       console.log(data);

       $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "api/add-promo",
        data: JSON.stringify(data),
        dataType: 'json',
        timeout: 600000,
        success: function (data) {
         console.log(data)
        },
        error: function (e) {
         console.log(e)
        }
       });
			});

			window.onload = function() {
				setMonthDropdown();
				curDate = (new Date()).getDate();
				setDate(new Date());
				setYearDropdown(d);
				printDate(d);
			};
		</script>
</body>
</html>