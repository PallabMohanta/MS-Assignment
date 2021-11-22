<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Login Page</title>
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
      crossorigin="anonymous"
    />
    <style>
      #main-body {
        font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
        background-color: white;
      }
      .navText {
        color: #f2f2f2;
        font-size: 38px;
        display: block;
        margin-left: 2vw;
      }
      .form-wrapper {
        background-color: #f2f2f2;
        width: 30vw;
        margin: auto;
        margin-top: 30px;
        padding: 20px;
        border: 1px #505050 solid;
        border-radius: 8px;
      }
      .formLabel,
      .formInput {
        margin-bottom: 10px;
      }
    </style>
  </head>
  <body id="main-body">
    <!-- Nav -->
    <nav class="navbar navbar-light bg-dark">
      <span class="navText">User System</span>
    </nav>
    
    <h2 class="text-center">Login Page</h2>

    <!-- Form -->
    <div class="form-wrapper">
      <form action="/userPage" method="post">
        <div class="form-group">
          <label class="formLabel" for="userId">User Id</label>
          <input type="text" class="form-control formInput" id="userId" name="uid" placeholder="Enter your User Id" autocomplete="false" required />
        </div>
        <div class="form-group">
          <label class="formLabel" for="userPassword">Password</label>
          <input type="password" class="form-control formInput" id="userPassword" name="upwd" placeholder="Enter your Password" autocomplete="false" required />
        </div>
        <button type="submit" class="btn btn-primary">Login</button>
      </form>
      <hr />
      <div class="text-center">
      	New User? Click below button to SignUp!
      	<br />
      	<br />
      	<form action="/userSignUp" method="get">
        	<button type="submit" class="btn btn-success">SignUp</button>
      	</form>
      </div>
    </div>
    	
  </body>
</html>
