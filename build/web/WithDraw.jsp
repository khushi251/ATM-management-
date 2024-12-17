<%@page import="dao.AtmDao"%>
<%@page import="model.Atm"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>ATM Management System - Withdraw</title>
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
  .withdraw-container {
    background-color: #fff;
    border-radius: 8px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    padding: 20px;
    text-align: center;
  }
  h1 {
    margin-top: 0;
  }
  .balance-info {
    margin-bottom: 20px;
  }
  .amount-input {
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
<div class="withdraw-container">
  <h1>ATM Management System</h1>
  <div class="balance-info">
      <%
          int t;
            int accno=Integer.parseInt(session.getAttribute("userid").toString());
          Atm a=new Atm();
          AtmDao ad =new AtmDao();
         a=ad.searchByUser(accno);
          t =a.getBalance();
          
      %>
      <p>Netbalance: <%= t %></p>
  </div>
  <form id="withdrawForm">
    <label for="amount" style="display: block; margin-bottom: 10px;">Amount to Withdraw:</label>
    <input type="number" name="amount" id="amount" class="amount-input" placeholder="Enter amount">
      <input type="submit" value="submit"> 
  </form>
  <div class="action-buttons">
    <button onclick="goBack()">Back</button>
  </div>
   
   <%
    String min_amt=null;
    min_amt=request.getParameter("amount");
    int amt;
    if(min_amt!=null){
        amt=Integer.parseInt(min_amt);
      
       // Atm a =new Atm();
        accno= Integer.parseInt(session.getAttribute("userid").toString());
       // AtmDao ad= new AtmDao();
       
        int bal;
        bal=a.getBalance();
    int total= bal-amt;
    if(ad.updateBalance(accno, total)){
        out.println("Amount WithDraw Successfully");
    }else{
         out.println("Amount WithDraw Failed");
    }
    }
%>
</div>
<script>
  function withdrawAmount() {
    const amount = document.getElementById("amount").value;
    // Process the withdrawal logic here
    // You can add your logic to update the balance or perform other actions
    alert("Amount withdrawn: $" + amount);
  }

   function goBack() {
     window.location.href = "FrontPage.jsp";
  }
</script>
</body>
</html>
