<%-- 
    Document   : inputview
    Created on : May 6, 2017, 7:51:29 PM
    Author     : root
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="<c:url value="/resources/CSS/table.css" />" rel="stylesheet" />
        <link href="<c:url value="/resources/CSS/footer.css" />" rel="stylesheet" />
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
        <link rel="<c:url value="/Content/Site.css" />" rel="stylesheet" />
        <link rel="<c:url value="/Content/ui.jqgrid.css" />" rel="stylesheet" />
        
       
     
    </head>
    <body>
        <div class="container">
            
            <div class="row">
                
                <div class="col-lg-12">
                    <nav class="navbar navbar-toggleable-md navbar-inverse bg-inverse">
                        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <a class="navbar-brand" href="#">Navbar</a>

                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav mr-auto">
                                <li class="nav-item active">
                                    <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#">Link</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link disabled" href="#">Disabled</a>
                                </li>
                            </ul>
                            <form class="form-inline my-2 my-lg-0">
                                <input class="form-control mr-sm-2" type="text" placeholder="Search">
                                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                            </form>
                        </div>
                    </nav>
                </div>
            </div>
            <div class="container-fluid" style="margin-top: 5%">
                <div class="row">
                    <div class="col-lg-12">
                        <form name="analizeform" >
                            <div class="row">
                                <div class="col-lg-5">
                                    <div class="form-group row">
                                        <label for="example-text-input" class="col-3 col-form-label">Class</label>
                                        <div class="col-5">
                                            <div class="btn-group">
                                                <button class="btn btn-secondary btn-md" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                    Large button
                                                </button>
                                                <button type="button" class="btn btn-md btn-secondary dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                    <span class="sr-only">Toggle Dropdown</span>
                                                </button>
                                                <div class="dropdown-menu">
                                                    <a class="dropdown-item" href="#">Action</a>
                                                    <a class="dropdown-item" href="#">Another action</a>
                                                    <a class="dropdown-item" href="#">Something else here</a>
                                                    <div class="dropdown-divider"></div>
                                                    <a class="dropdown-item" href="#">Separated link</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>


                            </div>

                            <div class="row">
                                <div class="col-lg-5">
                                    <div class="form-group row">
                                        <label id="crop_name" class="col-3 col-form-label">Crops</label>
                                        <div class="col-5">
                                            <div class="btn-group">
                                                <button class="btn btn-secondary btn-md" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                    Large button
                                                </button>
                                                <button type="button" class="btn btn-md btn-secondary dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                    <span class="sr-only">Toggle Dropdown</span>
                                                </button>
                                                <div class="dropdown-menu">
                                                    <a class="dropdown-item" href="#">Action</a>
                                                    <a class="dropdown-item" href="#">Another action</a>
                                                    <a class="dropdown-item" href="#">Something else here</a>
                                                    <div class="dropdown-divider"></div>
                                                    <a class="dropdown-item" href="#">Separated link</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>


                            </div>

                            <div class="row">
                                <div class="col-lg-5">
                                    <div class="form-grop row">
                                        <label id="soil_type" class="col-3 col-form-label">Soil Type</label>
                                        <div class="col-5">
                                            <div class="btn-group">
                                                <button class="btn btn-secondary btn-md" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                    Large button
                                                </button>
                                                <button type="button" class="btn btn-md btn-secondary dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                    <span class="sr-only">Toggle Dropdown</span>
                                                </button>
                                                <div class="dropdown-menu">
                                                    <a class="dropdown-item" href="#">Action</a>
                                                    <a class="dropdown-item" href="#">Another action</a>
                                                    <a class="dropdown-item" href="#">Something else here</a>
                                                    <div class="dropdown-divider"></div>
                                                    <a class="dropdown-item" href="#">Separated link</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>


                            </div>

                            <div class="row" style="margin-top: 2%">
                                <div class="col-md-5">
                                    <div class="input-group">
                                        <span class="input-group-addon" id="sizing-addon1">@.</span>
                                        <input type="text" class="form-control" placeholder="Soil Quantity" id="soilQualityText" aria-describedby="sizing-addon1">
                                    </div>
                                </div>
                            </div>



                            <div class="row">
                                <div class="col-lg-5">
                                    <div class="input-group">
                                        <span class="input-group-addon">
                                            <input type="checkbox" aria-label="">
                                        </span>
                                        <input type="text" class="form-control" id="sodiumInputText" placeholder="Sodium">
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-lg-5">
                                    <div class="input-group">
                                        <span class="input-group-addon">
                                            <input type="checkbox" aria-label="">
                                        </span>
                                        <input type="text" class="form-control" id="phosphorasInputText" placeholder="Phosphoras">
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-lg-5">
                                    <div class="input-group">
                                        <span class="input-group-addon">
                                            <input type="checkbox" aria-label="">
                                        </span>
                                        <input type="text" class="form-control" id="potasiamInputText" placeholder="Potasiam">
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-lg-5">
                                    <div class="input-group">
                                        <span class="input-group-addon">
                                            <input type="checkbox" aria-label="">
                                        </span>
                                        <input type="text" class="form-control" id="salphurInputText" placeholder="Salphur">
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-lg-5">
                                    <div class="input-group">
                                        <span class="input-group-addon">
                                            <input type="checkbox" aria-label="">
                                        </span>
                                        <input type="text" class="form-control" id="zinkInputText" placeholder="Zink">
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-lg-5">
                                    <div class="input-group">
                                        <span class="input-group-addon">
                                            <input type="checkbox" aria-label="">
                                        </span>
                                        <input type="text" class="form-control" id="boronInputText" placeholder="Boron">
                                    </div>
                                </div>
                            </div>
                            <div class="row" style="margin-top: 2%">

                                <div class="col-lg-10 ">
                                    <button type="button" class="btn btn-secondary" id="analizeButton" name="analizeButton" >ANALIZE FERTILIZER</button>
                                    <button type="button" class="btn btn-secondary" id="resetButton" name="reset" >RESET</button>
                                </div>

                            </div>

                        </form>

                    </div>
                </div>


            </div>
            <div id="div1"><h1>hello</h1>
           </div>
                    <div >
                        
                <table id="crops"></table>
                <div id="cropsPager"></div>
          
            </div>
            <div class="container-fluid">
                <a id="back-to-top" href="#" class="btn btn-primary btn-lg back-to-top" role="button" title="Click to return on the top page" data-toggle="tooltip" data-placement="left"><span class="glyphicon glyphicon-chevron-up"></span></a>

                <div class="row" style="margin-top: 5%">
                    <footer>
    <div class="footer" id="footer">
        <div class="container">
            <div class="row">
                <div class="col-lg-2  col-md-2 col-sm-4 col-xs-6">
                    <h3> Lorem Ipsum </h3>
                    <ul>
                        <li> <a href="#"> Lorem Ipsum </a> </li>
                        <li> <a href="#"> Lorem Ipsum </a> </li>
                        <li> <a href="#"> Lorem Ipsum </a> </li>
                        <li> <a href="#"> Lorem Ipsum </a> </li>
                    </ul>
                </div>
                <div class="col-lg-2  col-md-2 col-sm-4 col-xs-6">
                    <h3> Lorem Ipsum </h3>
                    <ul>
                        <li> <a href="#"> Lorem Ipsum </a> </li>
                        <li> <a href="#"> Lorem Ipsum </a> </li>
                        <li> <a href="#"> Lorem Ipsum </a> </li>
                        <li> <a href="#"> Lorem Ipsum </a> </li>
                    </ul>
                </div>
                <div class="col-lg-2  col-md-2 col-sm-4 col-xs-6">
                    <h3> Lorem Ipsum </h3>
                    <ul>
                        <li> <a href="#"> Lorem Ipsum </a> </li>
                        <li> <a href="#"> Lorem Ipsum </a> </li>
                        <li> <a href="#"> Lorem Ipsum </a> </li>
                        <li> <a href="#"> Lorem Ipsum </a> </li>
                    </ul>
                </div>
                <div class="col-lg-2  col-md-2 col-sm-4 col-xs-6">
                    <h3> Lorem Ipsum </h3>
                    <ul>
                        <li> <a href="#"> Lorem Ipsum </a> </li>
                        <li> <a href="#"> Lorem Ipsum </a> </li>
                        <li> <a href="#"> Lorem Ipsum </a> </li>
                        <li> <a href="#"> Lorem Ipsum </a> </li>
                    </ul>
                </div>
                <div class="col-lg-3  col-md-3 col-sm-6 col-xs-12 ">
                    <h3> Lorem Ipsum </h3>
                    <ul>
                        <li>
                            <div class="input-append newsletter-box text-center">
                                <input type="text" class="full text-center" placeholder="Email ">
                                <button class="btn  bg-gray" type="button"> Lorem ipsum <i class="fa fa-long-arrow-right"> </i> </button>
                            </div>
                        </li>
                    </ul>
                    <ul class="social">
                        <li> <a href="#"> <i class=" fa fa-facebook">   </i> </a> </li>
                        <li> <a href="#"> <i class="fa fa-twitter">   </i> </a> </li>
                        <li> <a href="#"> <i class="fa fa-google-plus">   </i> </a> </li>
                        <li> <a href="#"> <i class="fa fa-pinterest">   </i> </a> </li>
                        <li> <a href="#"> <i class="fa fa-youtube">   </i> </a> </li>
                    </ul>
                </div>
            </div>
            <!--/.row--> 
        </div>
        <!--/.container--> 
    </div>
    <!--/.footer-->
    
    <div class="footer-bottom"id="div1">
        <div class="container">
            <p class="pull-left"> Copyright © Footer 2017 Sk. Faisal. All right reserved. </p>
            <div class="pull-right">
                <ul class="nav nav-pills payments">
                	<li><i class="fa fa-cc-visa"></i></li>
                    <li><i class="fa fa-cc-mastercard"></i></li>
                    <li><i class="fa fa-cc-amex"></i></li>
                    <li><i class="fa fa-cc-paypal"></i></li>
                </ul> 
            </div>
        </div>
    </div>
    <!--/.footer-bottom--> 
</footer>
                </div>
            </div>

        </div>


      
        <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
        <script src="<c:url value="/resources/SCRIPTS/bootstrap.min.js" />" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
            <script src="<c:url value="/resources/SCRIPTS/jquery-1.7.1.min.js" />"></script>
         <script src="<c:url value="/resources/SCRIPTS/jquery/i18n/grid.locale-en.js" />" ></script>
           <script src="<c:url value="/resources/SCRIPTS/jquery/jquery.jqGrid.min.js" />" ></script>
            <script src="<c:url value="/resources/SCRIPTS/jquery-ui-1.8.20.min.js" />"></script>
        <script src="<c:url value="/resources/SCRIPTS/inputviewscripts.js" />" crossorigin="anonymous"></script>
       

    </body>
</html>
