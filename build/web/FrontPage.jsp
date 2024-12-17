<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Transaction Selection</title>
<style>
  body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    display: flex;
    align-items: center;
    justify-content: center;
    min-height: 100vh;
    background-color: #f0f0f0;
    background-image: url('atm2.jpg');
    background-repeat: no-repeat;
    background-size: cover;
    }

  .container {
    background-color: lightgrey;
    border: 1px solid black;
    border-radius: 5px;
    padding: 20px;
    box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);
    text-align: center;
  }

  h1 {
    margin-top: 0;
  }

  .transaction-button {
    display: block;
    width: 150px;
    padding: 10px;
    margin: 10px auto;
    border: 1px solid black;
    border-radius: 5px;
    text-decoration: none;
    color: #333;
    transition: background-color 0.3s, color 0.3s;
  }

  .transaction-button:hover {
    background-color: #333;
    color: white;
  }
</style>
</head>
<body>
  <div class="container">
    <h1>Select Your Transaction Please</h1>
    <a href="Deposit.jsp" class="transaction-button">Deposit</a>
    <a href="WithDraw.jsp" class="transaction-button">Withdraw</a>
    <a href="Pin.jsp" class="transaction-button">PIN</a>
    <a href="Balance.jsp" class="transaction-button">Balance</a>
    <a href="logOut.jsp" class="transaction-button">Log Out</a>
  </div>
</body>
</html>
