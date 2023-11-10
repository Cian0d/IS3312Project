<!-- Java imports to make this page dynamic -->
<%@page import="models.AddToBasket"%>
<%@page import="java.util.List"%>
<%@page import="models.Basket"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en"><head>
        <!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"  crossorigin="anonymous"></script>    
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.104.2">
    <!-- Displays the title of the tab -->
    <title>Cian's Poster Store - Basket</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.2/examples/album/">

    

    

<link href="/docs/5.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

    <!-- Favicons -->
<link rel="apple-touch-icon" href="/docs/5.2/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
<link rel="icon" href="/docs/5.2/assets/img/favicons/favicon-32x32.png" sizes="32x32" type="image/png">
<link rel="icon" href="/docs/5.2/assets/img/favicons/favicon-16x16.png" sizes="16x16" type="image/png">
<link rel="manifest" href="/docs/5.2/assets/img/favicons/manifest.json">
<link rel="mask-icon" href="/docs/5.2/assets/img/favicons/safari-pinned-tab.svg" color="#712cf9">
<link rel="icon" href="/docs/5.2/assets/img/favicons/favicon.ico">
<meta name="theme-color" content="#712cf9">


    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }

      .b-example-divider {
        height: 3rem;
        background-color: rgba(0, 0, 0, .1);
        border: solid rgba(0, 0, 0, .15);
        border-width: 1px 0;
        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
      }

      .b-example-vr {
        flex-shrink: 0;
        width: 1.5rem;
        height: 100vh;
      }

      .bi {
        vertical-align: -.125em;
        fill: currentColor;
      }

      .nav-scroller {
        position: relative;
        z-index: 2;
        height: 2.75rem;
        overflow-y: hidden;
      }

      .nav-scroller .nav {
        display: flex;
        flex-wrap: nowrap;
        padding-bottom: 1rem;
        margin-top: -1px;
        overflow-x: auto;
        text-align: center;
        white-space: nowrap;
        -webkit-overflow-scrolling: touch;
      }
    </style>

    
  </head>
 
  </header>
  <!-- This creates the design for my navigation bar at the top of the page. Each button links to their respective jsp's, and the page that the user is currently on is highlighted in blue.-->
    <header class="d-flex justify-content-center py-3 bg-warning">
      <ul class="nav nav-pills">
        <li class="nav-item"><a href="index.jsp" class="nav-link">Home</a></li>
               <li class="nav-item">
                            <c:if test="${empty SKUSER.firstName}">
                                <a class="nav-link" href="./account.jsp">Signup/login
                                </a>
                            </c:if>
                            <c:if test="${not empty SKUSER.firstName}">
                                <a class="nav-link" href="./account.jsp">Hi ${SKUSER.firstName}
                                </a>
                            </c:if>
                        </li>
            
        <li class="nav-item"><a href="/CiansPosterStore/productAdmin?action=listPosters" class="nav-link">All Posters</a></li>
        <li class="nav-item"><a href="basket.jsp" class="nav-link active" aria-current="page">Basket</a></li>
      </ul>
    </header>
  
<!-- Creates a session and calls upon the Basket and AddToBasket java classes in order to make the basket dynamic -->
 <% HttpSession sess = request.getSession();
 String useremail = (String) sess.getAttribute("email");
 
HttpSession basketssession = request.getSession();
      Basket basket = (Basket) basketssession.getAttribute("basket");
      Boolean isNull = false;
      List<AddToBasket> basketItems = null;
      if(basket != null) {
        basketItems = basket.getItems();
      } else {
        isNull = true;
      }
 %>

<body class="bg-info">
       
 
       
 <section>
<!-- If basket isn't empty then display the following -->    
<% if(isNull == false) { %>
 

<div class="container py-5 h-100 bg-info">
    <div class="row d-flex justify-content-center align-items-center h-100 bg-info">
      <div class="col-12">
        <div class="card card-registration card-registration-2" style="border-radius: 15px;">
          <div class="card-body p-0">
            <div class="row g-0">
              <div class="col-lg-8">
                <div class="p-5 bg-info">
                  <div class="d-flex justify-content-between align-items-center mb-5 bg-info">
                    <h1 class="fw-bold mb-0 text-black">Basket</h1>
                  </div>
                  <hr class="my-4">

                 
                  <div class="row mb-4 d-flex justify-content-between align-items-center bg-info">
                    <h4> <u>Order Details</u></h4>  
                    <!-- Calls upon java to dynamically get product details -->  
                     <%
                       for(AddToBasket item : basketItems) {

                       %>
                     
                    <div class="col-md-2 col-lg-2 col-xl-2 py-2 bg-info">
                      <img
                        src="<%= item.getImage() %>"
                        class="img-fluid rounded-3" alt="If there's not a poster here I'm gonna cry">
                    </div>
                    <div class="col-md-3 col-lg-3 col-xl-3 bg-info">
                      <h6><u>Poster Name</u></h6>
                      <h6 class="text-muted"><%= item.getProductName() %> </h6>
                    </div>
                     <div class="col-md-3 col-lg-3 col-xl-3 bg-info">
                      <h6><u>Quantity</u></h6>
                      <h6 class="text-muted"><%= item.getQuantity() %> </h6>
                      

                    </div>
                    <div class="col-md-3 col-lg-2 col-xl-2 offset-lg-1 bg-info">
                        <h6><u>Price</u></h6>
                      <h6 class="mb-0">  <%= item.getItemPrice() %> </h6>
                    </div>
  
                       <%
                       }
                        %>
                       
                       
                  </div>

                  <hr class="my-4">

                </div>
              </div>
              <div class="col-lg-4 bg-info">
                <div class="p-5">
                  <h3 class="fw-bold mb-5 mt-2 pt-1">Summary</h3>
                  <hr class="my-4">

                  <div class="d-flex justify-content-between mb-4">
                    <h5 class="text-uppercase">items: </h5>
                    <h5>  <%= basket.getCount() %> </h5>
                  </div>
                  
                  <hr/>
                  
                  <div class="d-flex justify-content-between mb-4">
                    <h5 class="text-uppercase">Sub-Total: </h5>
                    <h5>€<%= basket.getTotProduct() %></h5>
                  </div>
                  
                  <hr/>
                  
                  <div class="d-flex justify-content-between mb-4">
                    <h5 class="text-uppercase">Standard Shipping: </h5>
                    <h5>€3.50</h5>
                  </div>
                  
                  <hr/>
                  
                    <div class="d-flex justify-content-between mb-4">
                    <h5 class="text-uppercase">Grand Total: </h5>
                    <h5>€<%= basket.getTotProduct()+ 3.50 %></h5>
                  </div>
                  
                  <hr/>

                  <a href="checkout.jsp" class="btn btn-dark btn-block btn-lg"
                    data-mdb-ripple-color="dark">Checkout</a>

                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
     

<!-- If basket is empty then display the following -->    
     <% } else { %>
           <h3>No items currently in your basket</h3>
     <% } %>
</section>        
 </body>

<footer class="text-muted py-3 bg-warning">
  <div class="container">
    <p class="float-end mb-1">
      <a href="#">Back to top</a>
    </p>
    <p class="mb-1">© Cian's Poster Store (2022)</p>
    </div>
</footer>


    <script src="/docs/5.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>

      
  

</body></html>