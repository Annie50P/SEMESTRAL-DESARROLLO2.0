<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>SemestralDevII</title>
</head>
<body>
	<h1>INICIO SESIÓN</h1>
	<div class="contenerdor-sesion">
		<form action="controladores/LogController.jsp" method="post">
			<div class="contenedor-inputs">
				<input type="text" name="email" class="input-email" placeholder="email" required>
				<input type="password" name="pass" class="input-pass" placeholder="Password" required>
				<input type="submit" class="btn-enviar" name="btn-enviar" value="Iniciar sesión">

			</div>
		</form>
         <br>
        ¿No tienes una cuenta?<a href="principal/registro.jsp">Registrarse</a> 
       </div>

</body>
</html>