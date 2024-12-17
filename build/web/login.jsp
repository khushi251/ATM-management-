<%@page import="dao.AtmDao"%>
<%@page session="true" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>ATM Management Login</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f0f0f0;
                margin: 0;
                display: flex;
                align-items: center;
                justify-content: center;
                height: 100vh;
                background-image: url('atm2.jpg');
            }

            .login-container {
                background-color: white;
                padding: 20px;
                border-radius: 5px;
                box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
                width: 300px;
                text-align: center;
            }

            .login-container h2 {
                margin-bottom: 20px;
            }

            .input-group {
                margin-bottom: 15px;
            }

            .input-group label {
                display: block;
                margin-bottom: 5px;
            }

            .input-group input {
                width: 100%;
                padding: 8px;
                border: 1px solid #ccc;
                border-radius: 3px;
            }

            .login-button {
                background-color: #007bff;
                color: white;
                padding: 10px 20px;
                border: none;
                border-radius: 3px;
                cursor: pointer;
            }

            .signup-link {
                margin-top: 10px;
                color: #007bff;
                text-decoration: none;
            }
        </style>
    </head>
    <body>
        <div class="login-container">
            <h2>ATM Management Login</h2>
            <form>
                <div class="input-group">
                    <label for="accountNumber">Account Number</label>
                    <input type="text" id="accountNumber" name="accountNumber" required>
                </div>
                <div class="input-group">
                    <label for="pin">PIN</label>
                    <input type="password" id="pin" name="pin" required>
                </div>
                <button class="login-button" type="submit">Login</button>
            </form>
            <a class="signup-link" href="registration.jsp">Don't have an account? Sign up</a>


            <%
                String acc = null, pin = null, msg;
                acc = request.getParameter("accountNumber");
                pin = request.getParameter("pin");
                int a,p;
                if (acc != null && pin != null) {
                    a=Integer.parseInt(acc);
                    p=Integer.parseInt(pin);
                    
                    AtmDao ad = new AtmDao();
                    if (ad.login(a, p)) {
                        session.setAttribute("userid", acc);
                        session.setAttribute("password", pin);
                        response.sendRedirect("FrontPage.jsp");
                    } else {
                        out.println("<br>");
                        out.println("<font color=red size=4>Invalid UserID or Password</font>");
                        //response.sendRedirect("registration.jsp");
                    }
                }

            %>
        </div> 
    </body>
</html>