<%-- 
    Document   : menu
    Created on : 22/04/2019, 09:23:02 AM
    Author     : LEO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="description" content="bootstrap default admin template">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Dashboard V1 | Prince Admin Template</title>


        <!-- Start global css -->
        <link rel="stylesheet" href="assets/global/plugins/Waves/dist/waves.min.css"/>
        <link rel="stylesheet" href="assets/global/plugins/bootstrap/dist/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="assets/icons_fonts/font-awesome/css/font-awesome.min.css"/>
        <!-- End global css -->

        <!-- Start page plugin css -->
        <link rel="stylesheet" href="ssets/global/plugins/jqvmap/dist/jqvmap.css"/>
        <!-- End page plugin css -->

        <!-- Start template global css -->
        <link href="assets/global/css/components.min.css" type="text/css" rel="stylesheet"/>
        <!-- End template global css -->

        <!-- Start layout css -->
        <link rel="stylesheet" href="assets/layouts/layouts_left_menu/left_menu_layout.min.css"/>
        <!-- End layout css -->

        <!-- Start favicon ico -->
        <link rel="icon" href="assets/favicon/prince.ico" type="image/x-icon"/>
        <link rel="icon" type="image/png" sizes="192x192" href="assets/favicon/prince-192x192.png">
        <link rel="apple-touch-icon" sizes="180x180" href="assets/favicon/prince-180x180.png">
        <!-- End favicon ico -->
    </head>
    <body class="nav-medium">
        <div class="container body">
            <div class="main_container">
                <!-- Start Loader -->
                <div class="page-loader">
                    <div class="preloader loading">
                        <span class="slice"></span>
                        <span class="slice"></span>
                        <span class="slice"></span>
                        <span class="slice"></span>
                        <span class="slice"></span>
                        <span class="slice"></span>
                    </div>
                </div>
                <!-- End Loader -->

                <!-- Start Scroll Top -->
                <a href="javascript:" id="scroll" style="display: none;"><span></span></a>
                <!-- End Scroll Top -->

                <!-- start Left Menu-->
                <%@include file="izquierda.jsp" %>
                <!-- End Left Menu -->

                <!-- start top navigation -->
                <%@include file="header.jsp" %>
                <div class="clearfix"></div>
                <!-- End top navigation -->
                <!-- Start Contain Section -->
                <div class="container-fluid right_color">
                    <div class="page-main-header">
                        <!-- Page Title -->
                        <h2 class="page-name-title">Menu Principal</h2>
                        <!--  Breadcrumb -->
                        <ol class="breadcrumb">
                            <li><a href="#">Inicio</a></li>
                            <li class="text-info">Menu</li>
                            <li class="active">Principal</li>
                        </ol>
                    </div>

                    <div class="contain-section dashboard_v1">
                        <div class="row">
                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                                <div class="tile-stats bg-primary">
                                    <div class="icon"><i class="fa fa-users"></i></div>
                                    <div class="count">143</div>
                                    <h3>New Sign ups</h3>
                                    <a href="javascript:"><p>View More <i class="fa fa-hand-o-right"></i></p></a>
                                </div>
                            </div>
                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                                <div class="tile-stats bg-purple">
                                    <div class="icon"><i class="fa fa-comments-o"></i></div>
                                    <div class="count">59</div>
                                    <h3>New Message</h3>
                                    <a href="javascript:"><p>View More <i class="fa fa-hand-o-right"></i></p></a>
                                </div>
                            </div>
                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                                <div class="tile-stats bg-pink">
                                    <div class="icon"><i class="fa fa-sort-amount-desc"></i></div>
                                    <div class="count">05</div>
                                    <h3>New Updates</h3>
                                    <a href="javascript:"><p>View More <i class="fa fa-hand-o-right"></i></p></a>
                                </div>
                            </div>
                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                                <div class="tile-stats bg-inverse">
                                    <div class="icon"><i class="fa fa-check-square-o"></i></div>
                                    <div class="count">43</div>
                                    <h3>New Today</h3>
                                    <a href="javascript:"><p>View More <i class="fa fa-hand-o-right"></i></p></a>
                                </div>
                            </div>
                        </div>

                    </div>

                </div>
                <!-- End Contain Section -->

                <!-- Start Footer Section -->
                <footer class="footer">
                    © 2019 All rights reserved. Template designed by <a class="text-primary" href="javascript:">Prince</a>
                </footer>
                <!-- End Footer Section -->
            </div>
        </div>

        <!-- Start core js -->
        <script src="assets/global/plugins/jquery/dist/jquery.min.js"></script>
        <script src="assets/global/plugins/bootstrap/dist/js/bootstrap.min.js"></script>
        <script src="assets/global/plugins/Waves/dist/waves.min.js"></script>
        <script src="assets/global/plugins/screenfull.js/dist/screenfull.min.js"></script>
        <script src="assets/global/plugins/jquery-slimscroll/jquery.slimscroll.js"></script>
        <!-- Start core javascript -->

        <!-- Start global js -->
        <script src="assets/global/js/left-menu.min.js"></script>
        <!-- End global js -->

        <!-- Start page plugin js -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.18.1/moment.min.js"></script>
        <script src="assets/global/plugins/chart.js/dist/Chart.min.js"></script>
        <script src="assets/global/plugins/chart.js/samples/utils.js"></script>
        <script src="assets/global/plugins/jquery.sparkline/jquery.sparkline.js"></script>
        <script src="assets/global/plugins/jqvmap/dist/jquery.vmap.js"></script>
        <script src="assets/global/plugins/jqvmap/dist/maps/jquery.vmap.world.js"></script>
        <script src="assets/global/plugins/jqvmap/examples/js/jquery.vmap.sampledata.js"></script>
        
        <script src="assets/global/js/left-menu.min.js"></script>
        <!-- End page plugin js -->
        <script src="assets/global/plugins/datatables/media/js/jquery.dataTables.min.js"></script>
        <script src="assets/global/plugins/datatables/media/js/dataTables.bootstrap.min.js"></script>
        <!-- Start page js -->
        <script src="assets/global/js/dashboard_v1.min.js"></script>
        <script src="assets/global/js/datatable.min.js"></script>
        <!-- End page js -->
    </body>
</html>
