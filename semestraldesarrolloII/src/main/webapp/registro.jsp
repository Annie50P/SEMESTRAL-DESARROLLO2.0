<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>REGISTRARSE</title>
</head>
<body>
    <h1>Formulario de registro</h1>
    
    
    
    <form action="RegistroControlador" method="post">
        <div class="contenedor-inputs">
            <label>Nombre</label>
            <input type="text" name="nombre" class="input-nombre" placeholder="Nombre" required><br>
            
            <label>Apellido</label>
            <input type="text" name="apellido" class="input-apellido" placeholder="Apellido" required><br>
            
            <label>Email</label>
            <input type="email" name="email" class="input-email" placeholder="Email" required><br>
            
            <label>Password</label>
            <input type="password" name="pass" class="input-contrasena" placeholder="Contraseña" required><br>
            
            <label>Fecha de nacimiento</label>
            <input type="date" name="fechaNacimiento" class="input-fecha-nacimiento" placeholder="Fecha de Nacimiento" required><br>
            
            <label>País</label>
            <input type="text" name="pais" class="input-pais" placeholder="País" required><br>
            
            <label>Cédula</label>
            <input type="text" name="cedula" class="input-cedula" placeholder="Cédula" required><br>     
            
            <input type="submit" class="btn-registrar" name="btn-registrar" value="Regístrate">
        </div>
    </form>
</body>
</html>
