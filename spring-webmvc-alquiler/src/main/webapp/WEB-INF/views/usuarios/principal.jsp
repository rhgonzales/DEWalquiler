<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Menú Principal Administrador</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <style type="text/css">
      body {
        padding-top: 60px;
        padding-bottom: 40px;
      }
    </style>
    <link href="css/bootstrap-responsive.css" rel="stylesheet">

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
	
		<!-- Cierre de Sesión -->
		
		<script>
		function myFunction()
		{
		 alert("Hasta la próxima sesión");
		 }
		</script> 
		
		

								   
								   
        <style type="text/css">
<!--
.style1 {color: #CCCCCC}
-->
        </style>
</head>

  <body>
  
  
  
  <script src="http://code.jquery.com/jquery.js"></script>
  <script src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.carousel.js"></script>
	
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
      

	  <div id="welcome-carousel" class="carousel slide"><!-- class of slide for animation -->
          <div class="carousel-inner">
            <div class="item active"><!-- class of active since it's the first item -->
              <img src="img/guitar.jpg" alt="" width="400" height="400"/>
			  <div class="carousel-caption">
                <p>Bass Guitar!</p>
              </div>
            </div>
            <div class="item">
              <img src="img/drums.jpg" alt="" width="400" height="400"/>
			  <div class="carousel-caption">
                <p>Drums!</p>
              </div>
            </div>
            <div class="item">
              <img src="img/2nd.jpg" alt="" width="350" height="350"/>
              <div class="carousel-caption">
                <p>Second Guitar!</p>
              </div>
            </div>
            <div class="item">
              <img src="img/console.jpg" alt="" width="350" height="350"/>
			  <div class="carousel-caption">
                <p>Dj Console!</p>
              </div>
            </div>
			<div class="item">
              <img src="img/saxofon.jpg" alt="" width="400" height="400"/>
			  <div class="carousel-caption">
                <p>Saxophone!</p>
              </div>
            </div>
           
          </div><!-- /.carousel-inner -->
          <!--  Next and Previous controls below
                href values must reference the id for this carousel -->
            <a class="carousel-control left" href="#welcome-carousel" data-slide="prev">&lsaquo;</a>
            <a class="carousel-control right" href="#welcome-carousel" data-slide="next">&rsaquo;</a>
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
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap-transition.js"></script>
    <script src="js/bootstrap-alert.js"></script>
    <script src="js/bootstrap-modal.js"></script>
    <script src="js/bootstrap-dropdown.js"></script>
    <script src="js/bootstrap-scrollspy.js"></script>
    <script src="js/bootstrap-tab.js"></script>
    <script src="js/bootstrap-tooltip.js"></script>
    <script src="js/bootstrap-popover.js"></script>
    <script src="js/bootstrap-button.js"></script>
    <script src="js/bootstrap-collapse.js"></script>
    <script src="js/bootstrap-carousel.js"></script>
    <script src="js/bootstrap-typeahead.js"></script>

  </body>
</html>

