<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>tipo de vuelo</title>
<style>
body {
			background-color: GhostWhite;
			display: flex;
			flex-direction: column;
			align-items: center;
			justify-content: center;
			height: 100vh;
			margin: 0;
		}

.titulo1{

	    display: flex;
        align-items: center;
        background-color: Beige;
        padding: 75px;
        padding-right: 480px;
        padding-left: 480px;
        color: Tan;3
        margin-right:5px;
        font-size: 50px;
        font-family: "Homer Simpson UI";
	    position: relative; 
	    top: -90px;
}

.subtitulo{
         position: relative; 
	     top: -100px;
	      font-size: 20px;
	      font-family: "Consolas";
	      font-weight: normal;


}
 .Ida{
         display: inline-block;
         padding: 12px 20px;
         background-color:Lavender; 
         border: none;
         cursor: pointer;
         font-weight: normal;
         margin-right: 400px;
         position: relative; 
         top: -75px;
       }
            
 .Ida a {
         text-decoration: none;
         color: Black;
        }

.IdaVuelta{
         display: inline-block;
         padding: 13px 23px;
         background-color:Lavender; 
         border: none;
         cursor: pointer;
         font-weight: normal;
         margin-right: -500px;
         position: relative; 
         top: -155px;
         }
         
.IdaVuelta a {
         text-decoration: none;
  
         color: Black;
         }

</style>
</head>
<body>
 <h1 class="titulo1">TIPO DE VUELO</h1>
  <h4 class="subtitulo">¿Què tipo de vuelo deseas reservar?</h4>
</form>
         <br>
        <h2 class="Ida"><a href="inicio.jsp">SOLO IDA</a> </h2>
        <h3 class="IdaVuelta"><a href="ida.jsp">IDA   Y  VUELTA</a> </h2>
</body>
</html>