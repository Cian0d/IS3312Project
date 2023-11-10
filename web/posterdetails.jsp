<!-- Java imports to make this page dynamic -->
<%@page import="java.util.ArrayList"%>
<%@page import="models.Poster"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

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
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Displays the title of the tab -> in this instance, it is based dynamically on whichever poster is chosen -->
        <title>${poster.getPosterName()} Details</title>
    </head>
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
        <li class="nav-item"><a href="basket.jsp" class="nav-link">Basket</a></li>
      </ul>
    </header>

<!DOCTYPE html>
<html>
<!-- Getting the information from the Poster java class -->  
    <body class="bg-info">
        <h2 class="py-5 text-center border border-primary">${oldPoster.getPosterName()}</h2>
  <section class="bg-info">
            <div class="container px-4 px-lg-5 mt-5 ">
                <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
                   
                           
                    <div class="col mb-5">
                        <div class="card h-100">
                            <!-- Product image-->
                            <img class="card-img-top" src="${oldPoster.getPosterImage()}" alt="There should probably be a picture of a poster here, methinks" />
                        </div>
                    </div>
                      </div>
                    </div>
        </section>
<!-- Calls upon the basketServlet to dynamically add this item to the basket -->  

<!-- Dynamically displays the poster information based on your chosen poster -->  
        <div> 
            <hr/>
            <p class="text-center"><b>DESCRIPTION:</b></p>
            <p class="text-center">
                ${oldPoster.getPosterDescription()}
            </p>
            <hr/>
        </div>
        
        <div> 
            <p class="text-center"><b>TYPE:</b></p>
            <p class="text-center">
                ${oldPoster.getPosterType()}
            </p>
            <hr/>
        </div>
            
            <div> 
            <p class="text-center"><b>SIZE:</b></p>
            <p class="text-center">
                ${oldPoster.getPosterSize()}
            </p>
            <hr/>
        </div>
         
            <div> 
            <p class="text-center"><b>MATERIAL:</b></p>
            <p class="text-center">
                ${oldPoster.getPosterMaterial()}
            </p>
            <hr/>
        </div>
            
            <div> 
            <p class="text-center"><b>AGE:</b></p>
            <p class="text-center">
                ${oldPoster.getPosterAge()}
            </p>
            <hr/>
        </div>
            
            <div> 
            <p class="text-center"><b>PRICE:</b></p>
            <p class="text-center">
              €${oldPoster.getPosterPrice()}
            </p>
        </div>
            
            <form action="basketServlet" class="d-flex justify-content-center" method="get">
                

              
              
                
                <input type="hidden" name="posterName" value="${oldPoster.getPosterName()}">
                <input type="hidden" name="posterPrice" value="${oldPoster.getPosterPrice()}">
                <input type="hidden" name="posterID" value="${oldPoster.getPosterID()}">
                <input type="submit" value="Add To Cart">
                </form>
          
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
            