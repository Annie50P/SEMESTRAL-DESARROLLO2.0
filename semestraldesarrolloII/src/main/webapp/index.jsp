<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>SemestralDevII</title>
	
<style>
body {
			background-color: beige;
			display: flex;
			flex-direction: column;
			align-items: center;
			justify-content: center;
			height: 100vh;
			margin: 0;
		}

		.contenedor-sesion {
			text-align: center;
		}

		.contenedor-inputs {
			margin-top: 20px;
		}
		.btn-enviar {
			width: 314px; 
			height: 40px; 
			margin-bottom: 10px;
			padding: 5px;
		}
		.input-email,
		.input-pass {
			width: 300px; 
			height: 40px; 
			margin-bottom: 10px;
			padding: 5px;
		}
		.titulo1{
		 font-size: 70px;
		 margin-top: -100px;
	    }
	    .subtitulo{
	    font: small-caption;
	    font-size: 17px;
	    margin-left: 20px;;
	    }
		.img1{
		width: 200px;
        height: 200px;
        margin-left: -1000px;
		}
		
	</style>
</head>
<body>
    <img class= "img1"src="imagenes/logo2.0.png" alt="logo">
	<h2 class="titulo1">Azure AirLink</h2>
	<div class="contenerdor-sesion">
		<form action="controladores/LogController.jsp" method="post">
			<div class="contenedor-inputs">
				<input type="text" name="email" class="input-email" placeholder="email" required><br>
				<br>
				<input type="password" name="pass" class="input-pass" placeholder="Password" required><br>
				 <br>
				<input type="submit" class="btn-enviar" name="btn-enviar" value="Iniciar sesión">

			</div>
		</form>
         <br>
        <h2 class="subtitulo">¿No tienes una cuenta?<a href="principal/registro.jsp">Registrarse</a> </h2>
       </div>
</body>
</html>