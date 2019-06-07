<%-- 
    Document   : insert
    Created on : 22/04/2019, 09:57:11 AM
    Author     : LEO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="description" content="bootstrap default admin template">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>General Elements | Prince Admin Template</title>
        <link rel="stylesheet" href="assets/global/plugins/Waves/dist/waves.min.css"/>
        <link rel="stylesheet" href="assets/global/plugins/bootstrap/dist/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="assets/icons_fonts/font-awesome/css/font-awesome.min.css"/>

        <link href="assets/global/css/components.min.css" type="text/css" rel="stylesheet"/>

        <link rel="stylesheet" href="assets/layouts/layouts_left_menu/left_menu_layout.min.css"/>

        <link rel="icon" href="assets/favicon/prince.ico" type="image/x-icon"/>
        <link rel="icon" type="image/png" sizes="192x192" href="assets/favicon/prince-192x192.png">
        <link rel="apple-touch-icon" sizes="180x180" href="assets/favicon/prince-180x180.png">

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

                <%@include file="izquierda.jsp" %>
                <%@include file="header.jsp" %>

                <div class="clearfix"></div>
                <!-- End top navigation -->
                <!-- Start Contain Section -->
                <div class="container-fluid right_color">
                    <div class="page-main-header">
                        <!-- Page Title -->
                        <h2 class="page-name-title">General Elements</h2>
                        <!--  Breadcrumb -->
                        <ol class="breadcrumb">
                            <li><a href="#">Home</a></li>
                            <li class="text-info">Forms</li>
                            <li class="active">General Elements</li>
                        </ol>
                    </div>

                    <div class="contain-section">
                        <div class="contain-inner-section">

                            <div class="row">

                                <div class="clearfix"></div>

                                <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                                    <div class="section-header">
                                        <h2>Registrar Horarios</h2>
                                    </div>
                                    <form action="horario" method="POST">
                                        <label>Codigo</label>
                                            <div class="form-group">
                                                <div class="input-group success-input">
                                                    <input class="form-control" type="text" placeholder="Codigo" name="codigo">
                                                    <span class="input-group-addon"><i class="fa fa-check"></i></span>
                                                </div>
                                            </div>
                                        <div class="section-body">
                                            <label>Descripcion</label>
                                            <div class="form-group">
                                                <div class="input-group success-input">
                                                    <input class="form-control" type="text" placeholder="Descripcion" name="descripcion">
                                                    <span class="input-group-addon"><i class="fa fa-check"></i></span>
                                                </div>
                                            </div>

                                            <label>Profesor</label>
                                            <div class="form-group">
                                                <div class="input-group success-input">
                                                    <input class="form-control" type="text" placeholder="Profesor" name="profesor">
                                                    <span class="input-group-addon"><i class="fa fa-check"></i></span>
                                                </div>
                                            </div>

                                            <label>Tiempo Inicio</label>
                                            <div class="form-group">
                                                <div class="input-group purple-input">
                                                    <input class="form-control" type="time" placeholder="Tiempo Inicio" name="tiempoinicio">
                                                    <span class="input-group-addon"><i class="fa fa-check"></i></span>
                                                </div>
                                            </div>

                                            <label>Dia</label>
                                            <div class="form-group">
                                                <div class="input-group purple-input">
                                                    <input class="form-control" type="text" placeholder="Warning Field" name="dia">
                                                    <span class="input-group-addon"><i class="fa fa-check"></i></span>
                                                </div>
                                            </div>

                                            <label>Tiempo Final</label>
                                            <div class="form-group">
                                                <div class="input-group purple-input">
                                                    <input class="form-control" type="time" placeholder="Danger Field" name="tiempofinal">
                                                    <span class="input-group-addon"><i class="fa fa-check"></i></span>
                                                </div>
                                            </div>
                                            <button type="submit" class="btn btn-primary btn-outline float-button-light waves-effect waves-button waves-float waves-light">Guardar</button>
                                            <button type="button" class="btn btn-danger btn-outline float-button-light waves-effect waves-button waves-float waves-light" onclick="cancelarForm(true);">Cancelar</button>
                                        </div>
                                    </form>
                                </div>

                                <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                                    <div class="section-header">
                                        <h2>Size Fields</h2>
                                    </div>
                                    <div class="section-body">
                                        <label>Large field</label>
                                        <div class="form-group">
                                            <input class="form-control input-lg" type="text" placeholder="Large Input">
                                        </div>

                                        <label>Default field</label>
                                        <div class="form-group">
                                            <input class="form-control" type="text" placeholder="Default Input">
                                        </div>

                                        <label>Small field</label>
                                        <div class="form-group">
                                            <input class="form-control input-sm" type="text" placeholder="Small Input">
                                        </div>

                                        <label>Lengths field</label>
                                        <div class="form-group row">
                                            <div class="col-xs-5">
                                                <input class="form-control" type="text" placeholder="5">
                                            </div>
                                            <div class="col-xs-4">
                                                <input class="form-control" type="text" placeholder="4">
                                            </div>
                                            <div class="col-xs-3">
                                                <input class="form-control" type="text" placeholder="3">
                                            </div>
                                        </div>

                                        <label>Large Select</label>
                                        <div class="form-group">
                                            <select class="form-control input-lg">
                                                <option>Option 1</option>
                                                <option>Option 2</option>
                                                <option>Option 3</option>
                                                <option>Option 4</option>
                                                <option>Option 5</option>
                                            </select>
                                        </div>

                                        <label>Default Select</label>
                                        <div class="form-group">
                                            <select class="form-control">
                                                <option>Option 1</option>
                                                <option>Option 2</option>
                                                <option>Option 3</option>
                                                <option>Option 4</option>
                                                <option>Option 5</option>
                                            </select>
                                        </div>

                                        <label>Large Select</label>
                                        <div class="form-group">
                                            <select class="form-control input-sm">
                                                <option>Option 1</option>
                                                <option>Option 2</option>
                                                <option>Option 3</option>
                                                <option>Option 4</option>
                                                <option>Option 5</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>

                                <div class="clearfix"></div>

                                <div class="clearfix"></div>

                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>

                </div>
                <!-- End Contain Section -->    <!-- Start Footer Section -->    
                <footer class="footer">© 2018 All rights reserved. Template designed by <a class="text-primary" href="javascript:">Prince</a></footer>    <!-- End Footer Section -->
            </div>
        </div>
        <script src="assets/global/plugins/jquery/dist/jquery.min.js"></script>
        <script src="assets/global/plugins/bootstrap/dist/js/bootstrap.min.js"></script>
        <script src="assets/global/plugins/Waves/dist/waves.min.js"></script>
        <script src="assets/global/plugins/screenfull.js/dist/screenfull.min.js"></script>
        <script src="assets/global/plugins/jquery-slimscroll/jquery.slimscroll.js"></script>
        <!-- Start core javascript -->

        <!-- Start global js -->
        <script src="assets/global/js/left-menu.min.js"></script>
    </body>
</html>
