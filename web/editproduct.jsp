<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="models.Poster"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">



        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/shop-homepage.css" rel="stylesheet">

    </head>

    <body class="bg-info">


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
    <title>Cian's Poster Store - Edit Product</title>

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
  
      
        <div class="col-lg-12">
            <br/>
        </div>
        <!-- Page Content -->
        <div class="container bg-light py-3">

            <div class="row py-3">

                <div class="col-lg-12">

                    <h1 class="my-4 py-3">Edit Product</h1>



                    <div class="row">
                        <c:url value="/productAdmin" var="updatePosterUrl">
                                        <c:param name="action" value="updateCompleteProduct"/>
                                    </c:url>

                                       
                        
                        <form action="/CiansPosterStore/productAdmin?action=updateCompleteProduct" method="POST">
                            <input id="posterID" name="posterID" type="hidden" value="${oldPoster.posterID}">
                            <div class="form-group row py-3">
                                <label for="posterName" class="col-4 col-form-label">Product Name</label> 
                                <div class="col-8">
                                    <input id="posterName" name="posterName" type="text" value="${oldPoster.posterName}" class="form-control" required="required">
                                </div>
                            </div>
                            <div class="form-group row py-3">
                                <label for="posterDescription" class="col-4 col-form-label">Product Description</label> 
                                <div class="col-8">
                                    <input id="posterDescription" name="posterDescription" type="text" value="${oldPoster.posterDescription}" class="form-control" required="required">
                                </div>
                            </div>
                                <div class="form-group row py-3">
                                <label class="col-4">Product Category</label> 
                                <div class="col-8">
                                   <c:if test="${oldPoster.posterType eq 'Movie'}">
                                    <div class="custom-control custom-radio custom-control-inline">
                                        <input name="posterType" id="posterType_0" type="radio" class="custom-control-input" value="Movie" checked> 
                                        <label for="posterType_0" class="custom-control-label">Movie</label>
                                    </div>
                                    <div class="custom-control custom-radio custom-control-inline">
                                        <input name="posterType" id="posterType_1" type="radio" class="custom-control-input" value="TV"> 
                                        <label for="posterType_1" class="custom-control-label">TV</label>
                                    </div>
                                    <div class="custom-control custom-radio custom-control-inline">
                                        <input name="posterType" id="posterType_2" type="radio" class="custom-control-input" value="Location"> 
                                        <label for="posterType_2" class="custom-control-label">Location</label>
                                    </div>
                                   </c:if>
                                    <c:if test="${oldPoster.posterType eq 'TV'}">
                                    <div class="custom-control custom-radio custom-control-inline">
                                        <input name="posterType" id="posterType_0" type="radio" class="custom-control-input" value="Movie"> 
                                        <label for="posterType_0" class="custom-control-label">Movie</label>
                                    </div>
                                    <div class="custom-control custom-radio custom-control-inline">
                                        <input name="posterType" id="posterType_1" type="radio" class="custom-control-input" value="TV" checked> 
                                        <label for="posterType_1" class="custom-control-label">TV</label>
                                    </div>
                                    <div class="custom-control custom-radio custom-control-inline">
                                        <input name="posterType" id="posterType_2" type="radio" class="custom-control-input" value="Location" checked> 
                                        <label for="posterType_2" class="custom-control-label">Location</label>
                                    </div>
                                   </c:if>
                                    <c:if test="${oldPoster.posterType eq 'Location'}">
                                    <div class="custom-control custom-radio custom-control-inline">
                                        <input name="posterType" id="posterType_0" type="radio" class="custom-control-input" value="Movie"> 
                                        <label for="posterType_0" class="custom-control-label">Movie</label>
                                    </div>
                                    <div class="custom-control custom-radio custom-control-inline">
                                        <input name="posterType" id="posterType_1" type="radio" class="custom-control-input" value="TV"> 
                                        <label for="posterType_1" class="custom-control-label">TV</label>
                                    </div>
                                    <div class="custom-control custom-radio custom-control-inline">
                                        <input name="posterType" id="posterType_2" type="radio" class="custom-control-input" value="Location" checked> 
                                        <label for="posterType_2" class="custom-control-label">Location</label>
                                    </div>
                                   </c:if>   
                                </div>
                            </div> 
                            <div class="form-group row py-3">
                                <label for="posterSize" class="col-4 col-form-label">Product Size</label> 
                                <div class="col-8">
                                    <input id="posterSize" name="posterSize" type="text" value="${oldPoster.posterSize}" class="form-control" required="required">
                                </div>
                            </div>
                                 <div class="form-group row py-3">
                                <label for="posterMaterial" class="col-4 col-form-label">Product Material</label> 
                                <div class="col-8">
                                    <input id="posterMaterial" name="posterMaterial" type="text" value="${oldPoster.posterMaterial}" class="form-control" required="required">
                                </div>
                            </div>
                            <div class="form-group row py-3">
                                <label for="posterAge" class="col-4 col-form-label">Product Age</label> 
                                <div class="col-8">
                                    <input id="posterAge" name="posterAge" type="text" value="${oldPoster.posterAge}" class="form-control" required="required">
                                </div>
                            </div>
                                 <div class="form-group row py-3">
                                <label for="posterPrice" class="col-4 col-form-label">Product Price</label> 
                                <div class="col-8">
                                    <input id="posterPrice" name="posterPrice" type="text" value="${oldPoster.posterPrice}" class="form-control" required="required">
                                </div>
                            </div>
                            <div class="form-group row py-3">
                                <label for="posterImage" class="col-4 col-form-label">Product Image</label> 
                                <div class="col-8">
                                    <input id="posterImage" name="posterImage" type="text" value="${oldPoster.posterImage}" class="form-control" required="required">
                                </div>
                            </div>
          
                            <div class="form-group row">
                                <div class="offset-4 col-8">
                                    <button name="submit" type="submit" class="btn btn-primary">Submit</button>
                                </div>
                            </div>
                        </form> 











                    </div>
                    <!-- /.row -->

                </div>
                <!-- /.col-lg-9 -->

            </div>
            <!-- /.row -->

        </div>
        <!-- /.container -->
        <div class="col-lg-12">
            <br/>
        </div>
<footer class="text-muted py-4 bg-warning">
  <div class="container">
    <p class="float-end mb-1">
      <a href="#">Back to top</a>
    </p>
    <p class="mb-1">© Cian's Poster Store (2022)</p>
    </div>
</footer>

        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    </body>

</html>
