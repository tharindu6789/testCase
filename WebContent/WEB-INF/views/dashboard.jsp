<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.testcase.model.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<c:set var="baseURL" value="http://localhost:8080/TestCaseGenProject/" />
<title>Test Case Generator</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.min.js"></script>
<script
	src="https://rawgit.com/mar10/jquery-ui-contextmenu/master/jquery.ui-contextmenu.js"></script>
<style>
body {
	background-image: url("${baseURL}/static/img/dashboard.jpg");
	background-position: center;
	background-size: cover;
}

table, th, td {
	border: 1px solid black;
}

.hasmenu2 {
	border: 1px solid #008;
	margin: 3px;
	padding: 5px;
	width: 30px;
}

/* Optionally define a fixed width for menus */
.ui-menu {
	width: 220px;
}
/* Allow to use <kbd> elements inside the title to define shortcut hints. */
.ui-menu kbd {
	padding-left: 1em;
	float: right;
}

/* Define a custom icon */
.ui-icon.custom-icon-firefox {
	background-image: url(application_firefox.gif);
	background-position: 0 0;
}
</style>
<style>
.tree {
	min-height: 20px;
	padding: 19px;
	margin-bottom: 20px;
	background-color: #fbfbfb;
	border: 1px solid #999;
	-webkit-border-radius: 4px;
	-moz-border-radius: 4px;
	border-radius: 4px;
	-webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.05);
	-moz-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.05);
	box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.05)
}

.tree li {
	list-style-type: none;
	margin: 0;
	padding: 10px 5px 0 5px;
	position: relative
}

.tree li::before, .tree li::after {
	content: '';
	left: -20px;
	position: absolute;
	right: auto
}

.tree li::before {
	border-left: 1px solid #999;
	bottom: 50px;
	height: 100%;
	top: 0;
	width: 1px
}

.tree li::after {
	border-top: 1px solid #999;
	height: 20px;
	top: 25px;
	width: 25px
}

.tree li span {
	-moz-border-radius: 5px;
	-webkit-border-radius: 5px;
	border: 1px solid #999;
	border-radius: 5px;
	display: inline-block;
	padding: 3px 8px;
	text-decoration: none;
	font-size: 12px;
}

.tree li.parent_li>span {
	cursor: pointer
}

.tree>ul>li::before, .tree>ul>li::after {
	border: 0
}

.tree li:last-child::before {
	height: 30px
}

.tree li.parent_li>span:hover, .tree li.parent_li>span:hover+ul li span
	{
	background: #eee;
	border: 1px solid #94a0b4;
	color: #000
}
</style>
<style>
/* Remove the navbar's default margin-bottom and rounded borders */
.navbar {
	margin-bottom: 0;
	border-radius: 0;
}

/* Set height of the grid so .sidenav can be 100% (adjust as needed) */
.row.content {
	height: 450px
}

/* Set gray background color and 100% height */
.sidenav {
	padding-top: 20px; //
	background-color: #f1f1f1;
	height: 100%;
}

/* Set black background color, white text and some padding */
footer {
	background-color: #555;
	color: white;
	padding: 15px;
}

/* On small screens, set height to 'auto' for sidenav and grid */
@media screen and (max-width: 767px) {
	.sidenav {
		/* height: auto; */
		padding: 15px;
	}
}

.predict_step{
color:rgb(76,152,216);
}
</style>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a href="#"><img class="navbar-brand" style="padding: 0px;"
					src="../static/img/logo.png"></a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#"></a></li>
					<li><a href="#">Projects</a></li>
					<li><a href="#"></a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">

					<li>
						<%
							User currentUser = (User) (session.getAttribute("user"));
							if (currentUser == null) {
								response.sendRedirect("error");
							} else {
						%> <a>Hi,<%=currentUser.getFirst_name()%></a> <%
 	}
 %>
					</li>

					<li><a href="http://localhost:8080/TestCaseGenProject/logout/"><span
							class="glyphicon glyphicon-log-in"></span> Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container-fluid ">
		<div class="row content" style="height: 600px">
			<div class="col-md-4 sidenav">
				<div class="well">
					<p>My Projects</p>
				</div>
				<div class="tree">
					<ul id=project_list style="margin-left: -50px;">
						<li><span class="hasmenu">YahooAutomationProject</span>
							<ul>
								<li><span><i class="icon-minus-sign"></i>Functional
										Requirement</span>
									<ul>
										<li><span><i class="icon-leaf"></i>TS_YahooMailSignup</span>
											<ul>
												<li><span style="border-color:green; color: green;"><i class="icon-leaf"></i>TC_CreateAccount</span>
												</li>
												<li><span style="border-color:red; color: red;"><i class="icon-leaf"></i>TC_SignUpwithoutFirstName</span>
												</li>
											</ul></li>

									</ul></li>
								<li><span><i class="icon-minus-sign"></i>Non
										Functional Requirement</span>
									<ul>
										<li><span><i class="icon-leaf"></i>TS_HandleMultipleUserLogin</span>
											<ul>
												<li><span style="border-color:green; color: green;"><i class="icon-leaf"></i>TC_LoginMultipleUsersAccounts</span>
												</li>
											</ul></li>
										<li><span><i class="icon-leaf"></i>TS_YahooEmailLoadingTime</span>
											<ul>
												<li><span style="border-color:green; color: green;"><i class="icon-leaf"></i>TC_EmailLoadingExpectedTime</span>
												</li>
											</ul></li>

									</ul></li>
							</ul></li>

					</ul>
				</div>





			</div>
			<div class="col-md-6">
				<div class="container-fluid">
					<div class="well">
						<button class="btn btn-primary" href="#modal" data-toggle="modal">Create</button>


						<button class="btn btn-success" form="requirement_form">Save</button>
						
						<button class="btn btn-secondary">Help</button>
						<button class="btn btn-info" id="predictor">Step Predictor</button>
						<button class="btn btn-success" >Export Excel</button>
						<button class="btn btn-danger">Delete</button><br><br>
						<button class="btn btn-warning" id="generateBtn">Generate Func</button>
						<button class="btn btn-warning" id="generateNonBtn">Generate Non-Func</button>
					</div>
					<div class="well">
						<form id="requirement_form">
							<input name="id" hidden="" id="project_id" /> <h4>Enter functional
							requirement here</h4>
							<textarea rows="10" cols="75" name="func_require"
								id="func_require"
								placeholder="enter functional requirement here"></textarea>
							<br> <h4>Enter non-functional requirement here</h4>
							<textarea rows="10" cols="75" name="non_func_require"
								id="non_func_require"
								placeholder="enter non-functional requirement here"></textarea>
						</form>

					</div>
				</div>
			</div>
			<div class="col-md-2 "></div>
		</div>
	</div>
	<!-- Project Modal START -->
	<div id="modal" class="modal fade" aria-hidden="false">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-body">
					<div class="row">
						<div class="col-lg-12 ">
							<h3 class="m-t-none m-b ">Create New Project</h3>
							<form id="projectForm" action="projectCon" method="post">
								<div class="form-group">
									<label>Project Name</label> <input type="text"
										name="projectName" class="form-control">

								</div>
								<div class="form-group">
									<input type="submit" value="Create"
										class="btn btn-success pull-right">
								</div>


								<button class="btn btn-primary m-t-n-xs" data-dismiss="modal">Close</button>
							</form>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<!--Project modal END  -->
	<!-- TEst suite Modal START -->
	<div id="testsuite-modal" class="modal fade" aria-hidden="false">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-body">
					<div class="row">
						<div class="col-lg-12 ">
							<h3 class="m-t-none m-b ">Create New Test Suite</h3>
							<form action="projectCon" method="post">
								<div class="form-group">
									<label>Description</label> <input type="text"
										name="project_name" class="form-control">
								</div>
								<div class="form-group">
									<input type="submit" value="Create"
										class="btn btn-success pull-right">
								</div>


								<button class="btn btn-primary m-t-n-xs" data-dismiss="modal">Close</button>
							</form>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<!--test suite modal END  -->

	<!-- TEst suite Modal START -->
	<div id="testcase-modal" class="modal fade" aria-hidden="false">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-body">
					<div class="row">
						<div class="col-lg-12 ">
							<h3 class="m-t-none m-b ">Test Case</h3>

							<b>Description :</b><span id="description"></span><br />
							<br /> <b>Prerequisite :</b><span id="prerequisite"></span> <br />
							<br />
							<table style="border-style: solid;">
								<thead>
									<tr>
										<th>Step No</th>
										<th>Test Step</th>
									</tr>
								</thead>
								<tbody id="test_body">

								</tbody>
							</table>
							<br> <b>Alternatives Flow :</b><span id="alternative"></span><br />
							<br /> <b>Expected Result :</b><span id="expected_result"></span>

						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<!--test suite modal END  -->

	<!-- TEst suite Modal 1 START -->
	<div id="testcase-modalpredic" class="modal fade" aria-hidden="false">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-body">
					<div class="row">
						<div class="col-lg-12 ">
							<h3 class="m-t-none m-b ">Test Case-Create Account</h3>

							<b>Description :</b><span id="description">target about
								validate user </span><br />
							<br /> <b>Prerequisite :</b><span id="prerequisite2">prerequisite open sign up page. </span> <br /> <br />
							<table style="border-style: solid;">
								<thead>
									<tr>
										<th>Step No</th>
										<th>Test Step</th>
									</tr>
								</thead>
								<tbody id="test_body">
									<tr>
										<td>1</td>
										<td>Open the google chrome web browser.</td>
									</tr>
									<tr>
										<td>2</td>
										<td>type “yahoo mail signup” in the browser.</td>
									</tr>
									<tr>
										<td>3</td>
										<td>navigate to Yahoo sign up page.</td>
									</tr>
									<tr class="predict_step">
										<td>Predicted Step 1</td>
										<td>Verify that "signup" button is available.</td>
									</tr>
									<tr>
										<td>4</td>
										<td>click on signup button.</td>
									</tr>
									<tr>
										<td>5</td>
										<td>view signup page with empty data fields.</td>
									</tr>
									<tr class="predict_step">
										<td>Predicted Step 2</td>
										<td>Verify that "first name" text field is available.</td>
									</tr>
									<tr>
										<td>6</td>
										<td>insert first name as “Micheal” into text field.</td>
									</tr>
									<tr class="predict_step">
										<td>Predicted Step 3</td>
										<td>Verify that "last name" text field is available.</td>
									</tr>
									<tr>
										<td>7</td>
										<td>insert last name as “Cornor” into text field.</td>
									</tr>
								
									<tr>
										<td>8</td>
										<td>insert with valid email and insert
											michaelparker@yahoo.com as email.</td>
									</tr>
									<tr>
										<td>9</td>
										<td>insert with correct password and insert “1qaz2wsx” as
											password.</td>
									</tr>
									<tr>
										<td>10</td>
										<td>select in country code and select Srilanka(+94) as
											code.</td>
									</tr>
										<tr class="predict_step">
										<td>Predicted Step 4</td>
										<td>Verify that "mobile no" text field is available.</td>
									</tr>
									<tr>
										<td>11</td>
										<td>insert mobile no “771234567” to “mobile no” field.</td>
									</tr>
									<tr>
										<td>12</td>
										<td>select “April” value in “Month” drop down.</td>
									</tr>
									<tr>
										<td>13</td>
										<td>select “25” value in “Day” drop down.</td>
									</tr>
									<tr>
										<td>14</td>
										<td>select “1990” value in “Year” drop down.</td>
									</tr>
									<tr>
										<td>15</td>
										<td>select “Male” value in “Gender” selection field.</td>
									</tr>
									<tr>
										<td>16</td>
										<td>able click “Continue” button.</td>
									</tr>
									<tr>
										<td>17</td>
										<td>display success message.</td>
									</tr>
								</tbody>
							</table>
							<br> <b>Alternatives Flow :</b><span id="alternative">user able to log in to insert personal mobile no for mobile no text field. </span><br />
							<br /> <b>Expected Result :</b><span id="expected_result">outcome
								should be successfully create account. </span><br>
							<hr>
							<button class="btn btn-success">Export Excel</button>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<!--test suite modal END  -->
	<!-- TEst suite Modal 1 START -->
	<div id="testcase-modal-signup" class="modal fade" aria-hidden="false">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-body">
					<div class="row">
						<div class="col-lg-12 ">
							<h3 class="m-t-none m-b ">Test Case-Signup Without First Name</h3>

							<b>Description :</b><span id="description">target about
								validate user</span><br />
							<br /> <b>Prerequisite :</b><span id="prerequisite3">prerequisite open sign up page.</span> <br /> <br />
							<table style="border-style: solid;">
								<thead>
									<tr>
										<th>Step No</th>
										<th>Test Step</th>
									</tr>
								</thead>
								<tbody id="test_body">
									<tr>
										<td>1</td>
										<td>outcome should be incomplete signup without first name.</td>
									</tr>
									<tr class="predict_step">
										<td>Predicted Step 1</td>
										<td>Verify that "last name" text field is available.</td>
									</tr>
									<tr>
										<td>2</td>
										<td>insert last name as “Cornor” into text field.</td>
									</tr>
									<tr>
										<td>3</td>
										<td>insert with valid email and insert michaelparker@yahoo.com as email.</td>
									</tr>
									<tr>
										<td>4</td>
										<td>insert with correct password and insert “1qaz2wsx” as password.</td>
									</tr>
									<tr class="predict_step">
										<td>Predicted Step 2</td>
										<td>Verify that "mobile no" text field is available.</td>
									</tr>
									<tr>
										<td>5</td>
										<td>insert mobile no “771234567” to “mobile no” field.</td>
									</tr>
									<tr>
										<td>6</td>
										<td>select “April” value in “Month” drop down.</td>
									</tr>
									<tr>
										<td>7</td>
										<td>select “25” value in “Day” drop down.</td>
									</tr>
									<tr>
										<td>8</td>
										<td>select “1990” value in “Year” drop down.</td>
									</tr>
									<tr>
										<td>9</td>
										<td>able click “Continue” button.</td>
									</tr>
									<tr>
										<td>10</td>
										<td>display error message.</td>
									</tr>				
								</tbody>
							</table>
							<br> <b>Alternatives Flow :</b><span id="alternative">user able to log in to insert personal mobile no for mobile no text field. </span><br />
							<br /> <b>Expected Result :</b><span id="expected_result">outcome should be incomplete signup without first name.</span><br>
							<hr>
							<button class="btn btn-success">Export Excel</button>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<!--test suite modal END  -->
	<!-- TEst suite Modal login START -->
	<div id="testcase-modal-login" class="modal fade" aria-hidden="false">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-body">
					<div class="row">
						<div class="col-lg-12 ">
							<h3 class="m-t-none m-b ">Test Case-login multiple users accounts</h3>

							<b>Description :</b><span id="description">handle multiple users login</span><br />
							<br /> <b>Prerequisite :</b><span id="prerequisite4">prerequisite 100 Yahoo email accounts.</span> <br /> <br />
							<table style="border-style: solid;">
								<thead>
									<tr>
										<th>Step No</th>
										<th>Test Step</th>
									</tr>
								</thead>
								<tbody id="test_body">
									<tr>
										<td>1</td>
										<td>Open the google chrome web browser.</td>
									</tr>
									<tr>
										<td>2</td>
										<td>type “yahoo mail” in the browser.</td>
									</tr>
									<tr>
										<td>3</td>
										<td>navigate to Yahoo login page.</td>
									</tr>
									
									<tr>
										<td>4</td>
										<td>log in with internal user credentials.</td>
									</tr>
									<tr>
										<td>5</td>
										<td>can log with internal user and insert username as username.</td>
									</tr>
									<tr class="predict_step">
										<td>Predicted Step 1</td>
										<td>Verify that "next" button is available.</td>
									</tr>
									<tr>
										<td>6</td>
										<td>clicks on next button.</td>
									</tr>
									<tr class="predict_step">
										<td>Predicted Step 2</td>
										<td>Verify that "password" text field is available.</td>
									</tr>
									<tr>
										<td>7</td>
										<td>insert password to “Password” field.</td>
									</tr>
								<tr class="predict_step">
										<td>Predicted Step 3</td>
										<td>Verify that "sign" button is available.</td>
									</tr>
									<tr>
										<td>8</td>
										<td>click sign button.</td>
									</tr>
									<tr>
										<td>9</td>
										<td>After completed login should navigate to Yahoo email page.</td>
									</tr>
									<tr>
										<td>10</td>
										<td>sign out from home page.</td>
									</tr>
									<tr>
										<td>11</td>
										<td>navigate again to login page.</td>
									</tr>
									<tr>
										<td>12</td>
										<td>insert new users credentials.</td>
									</tr>
									<tr>
										<td>13</td>
										<td>iteration is happens for 100 users.</td>
									</tr>
								</tbody>
							</table>
							<br> <b>Alternatives Flow :</b><span id="alternative">user must be able to log in to the Yahoo mails by using his secondary internal user email address</span><br />
							<br /> <b>Expected Result :</b><span id="expected_result">outcome should be user able to login multiple users accounts</span><br>
							<hr>
							<button class="btn btn-success">Export Excel</button>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<!--test suite modal END  -->
	<!-- TEst suite Modal login START -->
	<div id="testcase-modal-load-mail" class="modal fade" aria-hidden="false">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-body">
					<div class="row">
						<div class="col-lg-12 ">
							<h3 class="m-t-none m-b ">Test Case-email loading expected time</h3>

							<b>Description :</b><span id="description">Yahoo email loading time.</span><br />
							<br /> <b>Prerequisite :</b><span id="prerequisite54">Prerequisite login with Yahoo. .</span> <br /> <br />
							<table style="border-style: solid;">
								<thead>
									<tr>
										<th>Step No</th>
										<th>Test Step</th>
									</tr>
								</thead>
								<tbody id="test_body">
									<tr>
										<td>1</td>
										<td>Yahoo email loading time.</td>
									</tr>
									<tr>
										<td>2</td>
										<td>System should display “Project budget for 2016” email.</td>
									</tr>
									<tr class="predict_step">
										<td>Predicted Step 3</td>
										<td>Verify that "Project budget for 2016" link is available.</td>
									</tr>
									<tr>
										<td>3</td>
										<td>click “Project budget for 2016” email.</td>
									</tr>
									
									<tr>
										<td>4</td>
										<td>Email should load and navigate to email content page.</td>
									</tr>
									
								</tbody>
							</table>
							<br> <b>Alternatives Flow :</b><span id="alternative">yahoo user able to login with his secondary email account. </span><br />
							<br /> <b>Expected Result :</b><span id="expected_result">result should be verify email loading expected time.</span><br>
							<hr>
							<button class="btn btn-success">Export Excel</button>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<!--test suite modal END  -->
</body>
<script>
	function treeList() {

		$('.tree li:has(ul)').addClass('parent_li').find(' > span').attr(
				'title', 'Collapse this branch');
		$('.tree li.parent_li > span').on(
				'click',
				function(e) {
					var children = $(this).parent('li.parent_li').find(
							' > ul > li');
					if (children.is(":visible")) {
						children.hide('fast');
						$(this).attr('title', 'Expand this branch')
								.find(' > i').addClass('icon-plus-sign')
								.removeClass('icon-minus-sign');
					} else {
						children.show('fast');
						$(this).attr('title', 'Collapse this branch').find(
								' > i').addClass('icon-minus-sign')
								.removeClass('icon-plus-sign');
					}
					// e.stopPropagation();
				});

	}
	function hideTree() {
		var children2 = $('.tree li.parent_li > span').parent('li.parent_li')
				.find(' > ul > li');
		children2.hide('fast');
	}
	//right button click
	/* 
	 $(document).ready(function(){ 
	 //document.oncontextmenu = function() {return false;};

	 $(document).mousedown(function(e){ 
	 if( e.button == 2 ) { 
	 alert('Right mouse button!'); 
	 return false; 
	 } 
	 return true; 
	 }); 
	 }); */
	//right click menu
	$(document)
			.contextmenu(
					{
						delegate : ".hasmenu",
						autoFocus : true,
						preventContextMenuForPopup : true,
						preventSelect : true,
						taphold : true,
						menu : [ {
							title : "Create Test Suite",
							cmd : "testsuite_create",
							uiIcon : "ui-icon-scissors"
						}, {
							title : "Copy <kbd>Ctrl+C</kbd>",
							cmd : "copy",
							uiIcon : "ui-icon-copy"
						}, {
							title : "Paste <kbd>Ctrl+V</kbd>",
							cmd : "paste",
							uiIcon : "ui-icon-clipboard",
							disabled : true
						}, {
							title : "----"
						}, {
							title : "More",
							children : [ {
								title : "Sub 1 (callback)",
								action : function(event, ui) {
									alert("action callback sub1");
								}
							}, {
								title : "Edit <kbd>[F2]</kbd>",
								cmd : "sub2",
								tooltip : "Edit the title"
							}, ]
						} ],
						// Handle menu selection to implement a fake-clipboard
						select : function(event, ui) {
							var $target = ui.target;
							switch (ui.cmd) {
							case "testsuite_create":
								$('#testsuite-modal').modal('show');
								break
							case "paste":
								break
							}
							// alert("select " + ui.cmd + " on " + $target.text());
							// Optionally return false, to prevent closing the menu now
						},
						// Implement the beforeOpen callback to dynamically change the entries
						beforeOpen : function(event, ui) {
							var $menu = ui.menu, $target = ui.target, extraData = ui.extraData; // passed when menu was opened by call to open()

							// console.log("beforeOpen", event, ui, event.originalEvent.type);

							ui.menu.zIndex($(event.target).zIndex() + 1);

							$(document)
							//				.contextmenu("replaceMenu", [{title: "aaa"}, {title: "bbb"}])
							//				.contextmenu("replaceMenu", "#options2")
							//				.contextmenu("setEntry", "cut", {title: "Cuty", uiIcon: "ui-icon-heart", disabled: true})
							.contextmenu("setEntry", "copy",
									"Copy '" + $target.text() + "'")
									.contextmenu("setEntry", "paste",
											"Paste" + ("  :")).contextmenu(
											"enableEntry", "paste", (""));

							// Optionally return false, to prevent opening the menu now
						}
					});

	var base_url = "http://localhost:8080/TestCaseGenProject/";
	$(document)
			.ready(
					function() {
						/* start-load projects from db */
						$
								.ajax({
									type : 'get',
									url : base_url + 'project/',
									dataType : 'json',
									success : function(data) {
										$
												.each(
														data,
														function(i, obj) {
															if (obj.status == 1) {
																var html = '<li><span class="hasmenu projectItem" id="P'+obj.id+'">'
																		+ obj.projectName
																		+ '</span>'
																		+ '<ul><li id="F'+obj.id+'"><span><i class="icon-minus-sign"></i>Functional Testcases</span></li>'
																		+ '<li><span><i id="NF'+obj.id+'" class="icon-minus-sign"></i>Non Functional Testcases</span></li></ul>'
																		+ '</li>';
																$(
																		"#project_list")
																		.append(
																				html);
															}

														});
										treeList();
										hideTree();
									}
								});/*end- load projects from db */

						/*start- click on project list item */
						$("#project_list:has(li)").on(
								"click",
								".projectItem",
								function(e) {
									//test case json 
									testcase1 = {
										description : "des",
										prerequisite : "adas",
										test_step : [ {
											id : 1,
											step : "asd"
										}, {
											id : 2,
											step : "asd2"
										} ],
										outcome : "out",
										alternative : "al"
									};
									e.preventDefault();
									var current = this.id;
									var id = current.replace("P", "");
									$("#project_id").val(id);
									$.ajax({
										type : "GET",
										url : base_url + 'project/' + id,
										dataType : 'json',
										success : function(data) {
											$("#non_func_require").val(
													data.non_func_require);
											$("#func_require").val(
													data.func_require);
										}
									});
								});

						/*end- click on project list item */
						/*start- save requirement */
						$("#requirement_form")
								.submit(
										function(e) {
											e.preventDefault();
											$
													.ajax({
														type : 'post',
														url : base_url
																+ 'project_update/',
														contentType : "application/json",
														data : JSON
																.stringify($(
																		"#requirement_form")
																		.serializeObject()),
														success : function(
																data,
																textStatus, XHR) {
															console.log(XHR);
															if (XHR.status == 200) {
																alert("Successfully Updated!");
																window.location = base_url
																		+ "dashboard";
															} else {
																alert("Failed. data not updated!")
															}
														}
													});
										});
						/*end- save requirement */
					});

	//project form submission
	$("#projectForm").submit(function(e) {
		e.preventDefault();
		var formData = $(this).serialize();
		$.ajax({
			type : 'post',
			url : base_url + 'project/',
			contentType : "application/json",
			data : JSON.stringify($("#projectForm").serializeObject()),
			success : function(data, textStatus, XHR) {
				console.log(XHR);
				if (XHR.status == 201) {
					alert("Successfully created!");
					window.location = base_url + "dashboard";
				} else {
					alert("Failed. data not saved!")
				}
			}
		});
	});
	$.fn.serializeObject = function() {
		var o = {};
		var a = this.serializeArray();
		$.each(a, function() {
			if (o[this.name] !== undefined) {
				if (!o[this.name].push) {
					o[this.name] = [ o[this.name] ];
				}
				o[this.name].push(this.value || '');
			} else {
				o[this.name] = this.value || '';
			}
		});
		return o;
	};
	/*start- click on project list item */
	$("body").on("click", "#generateBtn", function(e) {
		e.preventDefault();
		var prerequites = [];
		var id = $("#project_id").val();
		$.ajax({
			url : base_url + 'testcase_rule/prerequisite/' + id,
			type : "GET",
			dataType : 'json',
			contentType : 'application/json',
			success : function(data) {
				console.log(data);
				prerequites = data;
				loadModal(id, prerequites);
			}	
		});

	});

	function loadModal(id, prerequites) {

		var prerequite = [];

		var testcase_descriptions = [];
		var alternatives = [];
		var outcome = [];

		$.get(base_url + "testcase_rule/tc_description/" + id, function(data) {
			$.each(data, function(i, obj) {
				testcase_descriptions.push(obj);
			});
		});
		/* $.get(base_url + "testcase_rule/prerequisite/" + id, function(data) {
			$.each(data, function(i, obj) {
				prerequite.push(obj);
			});
		}); */
		$.get(base_url + "testcase_rule/tc_alternative/" + id, function(data) {
			$.each(data, function(i, obj) {
				alternatives.push(obj);
			});
		});
		$.get(base_url + "testcase_rule/tc_outcome/" + id, function(data) {
			$.each(data, function(i, obj) {
				outcome.push(obj);
			});
		});
		$
				.ajax({
					type : "GET",
					url : base_url + 'project_testcase/' + id,
					dataType : 'json',
					contentType : 'application/json',
					success : function(data) {
						$.each(data,function(index,obj){
							var modal_id=index;
							modalgenerate(modal_id);
							$("#test_body"+modal_id).empty(); // line added here
							var description = data[modal_id][0];
							var prerequisite=data[modal_id][1];
							var alternative = data[modal_id][2];
							var expected_result = data[modal_id][3];

							$("#description"+modal_id).text(description);
							$("#prerequisite"+modal_id).text(prerequisite);
							$("#alternative"+modal_id).text(alternative);
							$("#expected_result"+modal_id).text(expected_result);
							$("#testcase-modal"+modal_id).modal('show');
							for (i = 4; i < data[modal_id].length; i++) {
								$("#test_body"+modal_id).append(
										"<tr><td>" + Number(i - 3) + "</td><td>"
												+ data[modal_id][i] + "</td>");
							}
						});
						

						var test_suite = "";
						$.ajax({
									url : base_url + 'testcase_name/' + id,
									type : "GET",
									dataType : 'json',
									contentType : 'application/json',
									success : function(data2) {
										console.log(data2);
										$.ajax({
													url : base_url
															+ 'testcase_description/'
															+ id,
													type : "GET",
													dataType : 'json',
													contentType : 'application/json',
													success : function(data) {
														
														var htm = "";
														var count=0;
														var test_name = "";
														var spanId="style='border-color:green; color: green;";
														var j = [];
														$.each(
																		data2,
																		function(
																				i,
																				obj2) {// check prerequites comparison
																			console.log("PRE:"+prerequites[0][0]);
																				var negatives=['without','unable'];
																				for(k=0;k<negatives.length;k++){
																					if(obj2.indexOf(negatives[k]) !== -1){
																						spanId="style='border-color:red; color: red;";
																						break;
																					}else{
																						spanId="style='border-color:green; color: green;";
																					}
																				}
																			
																			if (prerequites[0][0] === prerequites[i][0]) {
																				test_name += "<li><span "+spanId+" class='tcItem'><i class='icon-leaf'></i>"
																						+ obj2
																						+ "</span></li>";
																						count++;
																			} else {
																				j
																						.push(i);
																			}
																		});
														htm = "<li><span><i class='icon-minus-sign'></i>"
																+ data[0]
																+ "</span>"
																+ "<ul>"
																+ test_name
																+ "</ul> </li>";
														// alert(j.length !==0);
														if (j.length !== 0) {
															test_name = "";
															$
																	.each(
																			j,
																			function(
																					i,
																					obj) {
																				if (prerequites[obj][0] === prerequites[i][0]) {
																					test_name += "<li><span "+spanId+" class='tcItem'><i class='icon-leaf '></i>"
																							+ data2[i]
																							+ "</span></li>";
																					htm += "<li><span><i class='icon-minus-sign '></i>"
																							+ data[i]
																							+ "</span>"
																							+ "<ul>"
																							+ test_name
																							+ "</ul> </li>";
																							count++;
																				} else {
																					test_name += "<li><span "+spanId+" class='tcItem'><i class='icon-leaf'></i>"
																							+ data2[obj]
																							+ "</span></li>";
																					htm += "<li><span><i class='icon-minus-sign'></i>"
																							+ data[obj]
																							+ "</span>"
																							+ "<ul>"
																							+ test_name
																							+ "</ul> </li>";
																							count++;
																				}

																			});
														} else {

														}
														$("#F" + id)
																.append(
																		"<ul>"
																				+ htm
																				+ "</ul>");

														// }
													}
												});
									}
								});

						//treeList();


					}
				});
		
		
	}
	/*end- click on project list item */
	$("#predictor").click(function(e) {
		//$("#testcase-modal2").modal('show');
		//$("#testcase-modal-login").modal('show');
		//$("#testcase-modal-load-mail").modal('show');
		$("#testcase-modal-signup").modal('show');
	});
	
	$("#project_list:has(li)").on("click",".tcItem",function(){
		alert(this.id);
		$("#testcase-modal").modal("show");
	});
	
	function modalgenerate(id){
		
		var html="<div id='testcase-modal"+id+"' class='modal fade' aria-hidden='false'>"+
		"<div class='modal-dialog'>"+
		"<div class='modal-content'>"+
			"<div class='modal-body'>"+
				"<div class='row'>"+
					"<div class='col-lg-12'>"+
						"<h3 class='m-t-none m-b'>Test Case</h3>"+
						"<b>Description :</b><span id='description"+id+"'></span><br />"+
						"<br /> <b>Prerequisite :</b><span id='prerequisite"+id+"'></span> <br /><br />"+						
						"<table style='border-style: solid;'>"+
							"<thead><tr>"+
									"<th>Step No</th>"+
									"<th>Test Step</th>"+
								"</tr>"+
							"</thead>"+
							"<tbody id='test_body"+id+"'>"+
							"</tbody>"+
						"</table>"+
						"<br> <b>Alternatives Flow :</b><span id='alternative"+id+"'></span><br />"+
						"<br /> <b>Expected Result :</b><span id='expected_result"+id+"'></span>"+
					"</div>"+
				"</div>"+
			"</div>"+
		"</div>"+
	"</div>"+
"</div>";

$("body").append(html);
	}
	
	
	/*start- click on project list item */
	$("body").on("click", "#generateNonBtn", function(e) {
		e.preventDefault();
		var prerequites = [];
		var id = $("#project_id").val();
		$.ajax({
			url : base_url + 'testcase_rule_non/prerequisite/' + id,
			type : "GET",
			dataType : 'json',
			contentType : 'application/json',
			success : function(data) {
				console.log(data);
				prerequites = data;
				loadModalNon(id, prerequites);
			}	
		});

	});
	

	function loadModalNon(id, prerequites) {

		var prerequite = [];

		var testcase_descriptions = [];
		var alternatives = [];
		var outcome = [];

		$.get(base_url + "testcase_rule_non/tc_description/" + id, function(data) {
			$.each(data, function(i, obj) {
				testcase_descriptions.push(obj);
			});
		});
		/* $.get(base_url + "testcase_rule/prerequisite/" + id, function(data) {
			$.each(data, function(i, obj) {
				prerequite.push(obj);
			});
		}); */
		$.get(base_url + "testcase_rule_non/tc_alternative/" + id, function(data) {
			$.each(data, function(i, obj) {
				alternatives.push(obj);
			});
		});
		$.get(base_url + "testcase_rule_non/tc_outcome/" + id, function(data) {
			$.each(data, function(i, obj) {
				outcome.push(obj);
			});
		});
		$
				.ajax({
					type : "GET",
					url : base_url + 'project_testcase_non/' + id,
					dataType : 'json',
					contentType : 'application/json',
					success : function(data) {
						$.each(data,function(index,obj){
							var modal_id=index;
							modalgenerate(modal_id);
							$("#test_body"+modal_id).empty(); // line added here
							var description = data[modal_id][0];
							var prerequisite=data[modal_id][1];
							var alternative = data[modal_id][2];
							var expected_result = data[modal_id][3];

							$("#description"+modal_id).text(description);
							$("#prerequisite"+modal_id).text(prerequisite);
							$("#alternative"+modal_id).text(alternative);
							$("#expected_result"+modal_id).text(expected_result);
							$("#testcase-modal"+modal_id).modal('show');
							for (i = 4; i < data[modal_id].length; i++) {
								$("#test_body"+modal_id).append(
										"<tr><td>" + Number(i - 3) + "</td><td>"
												+ data[modal_id][i] + "</td>");
							}
						});
						

						var test_suite = "";
						$.ajax({
									url : base_url + 'testcase_name_non/' + id,
									type : "GET",
									dataType : 'json',
									contentType : 'application/json',
									success : function(data2) {
										console.log(data2);
										$.ajax({
													url : base_url
															+ 'testcase_description_non/'
															+ id,
													type : "GET",
													dataType : 'json',
													contentType : 'application/json',
													success : function(data) {
														
														var htm = "";
														var count=0;
														var test_name = "";
														var spanId="style='border-color:green; color: green;";
														var j = [];
														$.each(
																		data2,
																		function(
																				i,
																				obj2) {// check prerequites comparison
																			console.log("PRE:"+prerequites[0][0]);
																				var negatives=['without','unable'];
																				for(k=0;k<negatives.length;k++){
																					if(obj2.indexOf(negatives[k]) !== -1){
																						spanId="style='border-color:red; color: red;";
																						break;
																					}else{
																						spanId="style='border-color:green; color: green;";
																					}
																				}
																			
																			if (prerequites[0][0] === prerequites[i][0]) {
																				test_name += "<li><span "+spanId+" class='tcItem'><i class='icon-leaf'></i>"
																						+ obj2
																						+ "</span></li>";
																						count++;
																			} else {
																				j
																						.push(i);
																			}
																		});
														htm = "<li><span><i class='icon-minus-sign'></i>"
																+ data[0]
																+ "</span>"
																+ "<ul>"
																+ test_name
																+ "</ul> </li>";
														// alert(j.length !==0);
														if (j.length !== 0) {
															test_name = "";
															$
																	.each(
																			j,
																			function(
																					i,
																					obj) {
																				if (prerequites[obj][0] === prerequites[i][0]) {
																					test_name += "<li><span "+spanId+" class='tcItem'><i class='icon-leaf '></i>"
																							+ data2[i]
																							+ "</span></li>";
																					htm += "<li><span><i class='icon-minus-sign '></i>"
																							+ data[i]
																							+ "</span>"
																							+ "<ul>"
																							+ test_name
																							+ "</ul> </li>";
																							count++;
																				} else {
																					test_name += "<li><span "+spanId+" class='tcItem'><i class='icon-leaf'></i>"
																							+ data2[obj]
																							+ "</span></li>";
																					htm += "<li><span><i class='icon-minus-sign'></i>"
																							+ data[obj]
																							+ "</span>"
																							+ "<ul>"
																							+ test_name
																							+ "</ul> </li>";
																							count++;
																				}

																			});
														} else {

														}
														$("#NF" + id)
																.append(
																		"<ul>"
																				+ htm
																				+ "</ul>");

														// }
													}
												});
									}
								});

						//treeList();


					}
				});
		
		
	}
</script>
</html>
