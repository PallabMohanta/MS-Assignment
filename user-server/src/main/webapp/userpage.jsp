<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>User Page</title>
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
      <span class="text-center navText">User System</span>
    </nav>
    
    <h2 class="text-center">User Page</h2>

    <!-- Form -->
    <div class="form-wrapper">
      <h3>Hello ${userName}, How are you</h3>
      <br />
      <br />
      <br />
      <div class="text-center">
      	<small>Click here to log out!</small>
      	<form action="/login" method="get">
        	<button type="submit" class="btn btn-danger">Logout</button>
      	</form>
      </div>
    </div>
  </body>
</html>
