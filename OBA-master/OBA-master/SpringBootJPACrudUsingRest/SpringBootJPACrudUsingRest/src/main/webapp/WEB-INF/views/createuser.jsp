<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<body>

<div style="margin:50px">
<h1> Create User Details </h1>

<form method="get" action="createprocess">


   <span>Account Number</span>

   <input type="text" name="acc_no_fk" required />
   
    <span>  User Id </span>

   <input type="text" name="user_id" required />
   
    <span>  Password </span>

   <input type="password" name="password" required />

 <span>  Transaction Password </span>

   <input type="password" name="trans_pass" required />

   </div>


    <input type="submit" value="Register for internet banking"/>

</form>

</div>

</body>
</html>