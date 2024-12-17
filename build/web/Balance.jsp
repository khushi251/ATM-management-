<%@page import="model.Atm"%>
<%@page import="dao.AtmDao"%>
<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>ATM Management System - Balance</title>
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
  .balance-container {
    background-color: #fff;
    border-radius: 8px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    padding: 20px;
    text-align: center;
  }
  h1 {
    margin-top: 0;
  }
  .account-info {
    margin-bottom: 20px;
  }
  .back-button {
    background-color: #007bff;
    color: #fff;
    border: none;
    border-radius: 4px;
    padding: 10px 20px;
    cursor: pointer;
    transition: background-color 0.3s ease;
  }
  .back-button:hover {
    background-color: #0056b3;
  }
</style>
</head>
<body>
<div class="balance-container">
  <h1>ATM Management System</h1>
  <div class="account-info">
      <% int s;
     Atm a=new Atm();
      s=Integer.parseInt(session.getAttribute("userid").toString());
      AtmDao ad=new AtmDao();
      a=ad.searchByUser(s);
      %>
      <p>Account Number: <span id="accountNumber" ><%=s %>  </span></p>
    <p>Available Balance: <span id="balance"><%=a.getBalance() %></span></p>
  </div>
  <button class="back-button" onclick="goBack()">Back</button>
</div>
<script>
  function goBack() {
    window.location.href="FrontPage.jsp";
  }
</script>
</body>
</html>
