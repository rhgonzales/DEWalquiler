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
    <title>Registro de Usuario</title>
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
  <script src="stylesheets/bootstrap.min.js"></script>
	<script type="text/javascript" src="stylesheets/bootstrap.carousel.js"></script>
	
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
	<legend>Datos de Ingreso</legend>
    <label>DNI</label>
	
    <input type="text" placeholder="DNI">
	
	<label>Clave</label>
    <input type="password" placeholder="Clave">
	
	<label>Confirmar Clave</label>
    <input type="password" placeholder="Confirmar Clave">
	
	<label>Fecha Nacimiento</label>
    <input type="text" placeholder="Fecha Nacimiento"><i class="icon-calendar"></i>
	
	<label>Nombres</label>
    <input type="text" placeholder="Nombres">
	
	<label>Apellido Paterno</label>
    <input type="text" placeholder="Apellido Paterno">
	
	<label>Apellido Materno</label>
    <input type="text" placeholder="Apellido Materno">
	
	<label>Email</label>
    <input type="Email" placeholder="Email">								
    
    <p>
    <button type="submit" class="btn btn-primary"><i class="icon-file icon-white"></i> Guardar</button>
    <a class="btn btn-primary" href="buscarusuario.jsp">Cancelar</a>
    </p>
	
    </fieldset>
    </form>	

      <!-- Example row of columns -->
      

      

      <footer>
        <p>&copy; Alquileres S.A</p>
      </footer>
	</div>
    </div> <!-- /container -->

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script javascript="stylesheets/jquery.js"></script>
    <script javascript="stylesheets/bootstrap-transition.js"></script>
    <script javascript="stylesheets/bootstrap-alert.js"></script>
    <script javascript="stylesheets/bootstrap-modal.js"></script>
    <script javascript="stylesheets/bootstrap-dropdown.js"></script>
    <script javascript="stylesheets/bootstrap-scrollspy.js"></script>
    <script javascript="stylesheets/bootstrap-tab.js"></script>
    <script javascript="stylesheets/bootstrap-tooltip.js"></script>
    <script javascript="stylesheets/bootstrap-popover.js"></script>
    <script javascript="stylesheets/bootstrap-button.js"></script>
    <script javascript="stylesheets/bootstrap-collapse.js"></script>
    <script javascript="stylesheets/bootstrap-carousel.js"></script>
    <script javascript="stylesheets/bootstrap-typeahead.js"></script>

  </body>
</html>

