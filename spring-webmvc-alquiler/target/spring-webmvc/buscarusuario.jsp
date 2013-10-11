<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Búsqueda de Usuario</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link href="stylesheets/bootstrap.css" rel="stylesheet">
    <style type="text/css">
      body {
        padding-top: 60px;
        padding-bottom: 40px;
      }
    </style>
    <link href="stylesheets/bootstrap-responsive.css" rel="stylesheet">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="../assets/js/html5shiv.js"></script>
    <![endif]-->

    <!-- Fav and touch icons -->
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
      <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
                    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
                                   <link rel="shortcut icon" href="../assets/ico/favicon.png">
  </head>

  <body>
  
  <script src="http://code.jquery.com/jquery.js"></script>
  <script src="javascript/bootstrap.min.js"></script>
	<script type="text/javascript" src="javascript/bootstrap.carousel.js"></script>
	
	<script>
          $(document).ready(function(){
            $('.carousel').carousel();
          });
    </script>

    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="brand" href="#">Alquiler de Sala</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
				<li><a href="Principal.html"><i class="icon-home"></i> Inicio</a></li>
				<li><a href="BuscarReserva.html"><i class="icon-book"></i> Reserva</a></li>
				<li><a href="BuscarSala.html"><i class="icon-pencil"></i>Sala</a></li>
				<li><a href="BuscarInstrumento.html"><i class="icon-asterisk"></i> Instrumento</a></li>
				<li><a href="BuscarServicio.html"><i class="icon-tasks"></i> Servicio</a></li>
				<li><a href="BuscarArmado.html"><i class="icon-filter"></i> Armado</a></li>
				<li><a href="BuscarUsuario.html"><i class="icon-user"></i> Usuario</a></li>
				<li><a href="ListadoCliente.html"><i class="icon-user"></i> Cliente</a></li>
            </ul>
            <form class="navbar-form pull-right">
              <span class="style1">Bienvenido</span> <a href="LogueoAdmin.html" class="navbar-link" onClick="myFunction()" value="Administrador">Administrador</a>
              <!-- <button type="submit" class="btn">Iniciar Sesión</button> -->
            </form>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container">

      <!-- Main hero unit for a primary marketing message or call to action -->
      <div class="hero-unit">
      

	  <form>
    <fieldset>
    <legend>Filtros de Búsqueda</legend>
	<label>Usuario</label>
    <input type="text" placeholder="Usuario">
	<label>Local</label> 
	<select>
                                    <option value="1">San Miguel</option>
                                    <option value="2">San Borja</option>
                                    <option value="3">Miraflores</option>
                                </select>
	<label>Nombre o Apellido</label>
    <input type="text" placeholder="Nombre o Apellido">
								
    
    <p>
    <button type="submit" class="btn btn-primary"><i class="icon-search icon-white"></i> Buscar</button>
    <a class="btn btn-primary" href="registrarusuario.jsp">Nuevo</a>
    </p>
	
	<table class="table table-condensed" border="1">
    <caption>Listado de Usuario</caption>
    <thead>
    <tr class="success">
    <th>#</th>
    <th>Usuario</th>
	<th>Nombre</th>
	<th>Apellido Paterno</th>
	<th>Apellido Materno</th>
	<th>Local</th>
	<th>Edit</th>
	<th>Delete</th>
    </tr>
    </thead>
    <tbody>
    <tr class="success">
    <td>1</td>
    <td>aosorio</td>
	<td>Alfredo</td>
	<th>Osorio</th>
	<th>Rios</th>
	<th>San Miguel</th>
	<td><a href="EditarUsuario.html"><i class="icon-pencil"></i></a></td>
	<td><i class="icon-remove"></td>
    </tr>
    </tbody>
	<tbody>
    <tr class="info">
    <td>2</td>
    <td>jrios</td>
	<td>Johana</td>
	<th>Rios</th>
	<th>Osorio</th>
	<th>San Borja</th>
	<td><a href="EditarUsuario.html"><i class="icon-pencil"></i></a></td>
	<td><i class="icon-remove"></td>
    </tr>
    </tbody>
    </table>
	<div class="pagination">
    <ul>
    <li><a href="#">Prev</a></li>
    <li><a href="#">1</a></li>
    <li><a href="#">2</a></li>
    <li><a href="#">3</a></li>
    <li><a href="#">4</a></li>
    <li><a href="#">5</a></li>
    <li><a href="#">Next</a></li>
    </ul>
    </div>

	  </div>
      </div>

      <!-- Example row of columns -->
      

      

      <footer>
        <p>&copy; Alquileres S.A</p>
      </footer>

    </div> <!-- /container -->

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="javascript/jquery.js"></script>
    <script src="javascript/bootstrap-transition.js"></script>
    <script src="javascript/bootstrap-alert.js"></script>
    <script src="javascript/bootstrap-modal.js"></script>
    <script src="javascript/bootstrap-dropdown.js"></script>
    <script src="javascript/bootstrap-scrollspy.js"></script>
    <script src="javascript/bootstrap-tab.js"></script>
    <script src="javascript/bootstrap-tooltip.js"></script>
    <script src="javascript/bootstrap-popover.js"></script>
    <script src="javascript/bootstrap-button.js"></script>
    <script src="javascript/bootstrap-collapse.js"></script>
    <script src="javascript/bootstrap-carousel.js"></script>
    <script src="javascript/bootstrap-typeahead.js"></script>

  </body>
</html>

