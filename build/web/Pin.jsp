
<%@page import="model.Atm"%>
<%@page import="dao.AtmDao"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>ATM Management System - Change PIN</title>
<style>
  body {
    font-family: Arial, sans-serif;
    background-color: #f5f5f5;
    margin: 0;
    padding: 0;
    display: flex;
    align-items: center;
    justify-content: center;
    min-height: 100vh;
    background-image: url('atm2.jpg');
    background-repeat: no-repeat;
    background-size: cover;
  }
  .changepin-container {
    background-color: #fff;
    border-radius: 8px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    padding: 20px;
    text-align: center;
  }
  h1 {
    margin-top: 0;
  }
  .pin-input {
    width: 100%;
    padding: 10px;
    margin-bottom: 20px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
  }
  .action-buttons {
    display: flex;
    justify-content: space-between;
    align-items: center;
  }
  .action-buttons button {
    background-color: #007bff;
    color: #fff;
    border: none;
    border-radius: 4px;
    padding: 10px 20px;
    cursor: pointer;
    transition: background-color 0.3s ease;
  }
  .action-buttons button:hover {
    background-color: #0056b3;
  }
</style>


</head>
<body>
<div class="changepin-container">
  <h1>ATM Management System</h1>
  <form id="changepinForm" method="post" action="Pin.jsp">
    <label for="newPin" style="display: block; margin-bottom: 10px;">New PIN:</label>
    <input type="password" id="newPin" name="newPin" class="pin-input" placeholder="Enter new PIN">
    <label for="confirmPin" style="display: block; margin-top: 20px; margin-bottom: 10px;">Confirm PIN:</label>
    <input type="password" id="confirmPin" name="confirmPin" class="pin-input" placeholder="Confirm new PIN">
    <input type="submit" value="Submit">
  </form>
  <div class="action-buttons">
<!--    <button onclick="changePin()">Change PIN</button>-->
    <button onclick="menu()">Back</button>
  </div>
      <%
      String np=null,cp=null;
      np=request.getParameter("newPin");
      cp=request.getParameter("confirmPin");
      if (cp!=null && np!=null){
          int a, b;
          a=Integer.parseInt(np);
          b=Integer.parseInt(cp);
          if(a!=b){
              out.println("<font color=red size=4>new pin and confirm pin must be same</font>");
          }else{
            int accno;
        accno= Integer.parseInt(session.getAttribute("userid").toString());
          AtmDao ad= new AtmDao();
          if(ad.updatePin(accno, a))
              out.println("<font color=green size=4>Pin changed Successfully</font>");
          else
              out.println("<font color=red size=4>Pin not changed</font>");
        }
      }
    %>
</div>
    
<script>
  function changePin() {
    const newPin = document.getElementById("newPin").value;
    const confirmPin = document.getElementById("confirmPin").value;

    if (newPin !== confirmPin) {
      alert("PINs do not match. Please try again.");
      return;
    }

    // Process the change PIN logic here
    // You can add your logic to update the PIN or perform other actions
    alert("PIN changed successfully!");
  }
  function menu(){
          window.location.href = "FrontPage.jsp";
  }
  function goBack() {
    window.history.back();
  }
</script>
</body>
</html>
