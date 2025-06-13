<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Registrarse</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/registrarse.css?v=1" />
  </head>
  <body>
    <div class="container">
      <div class="container_header">
        <img src="${pageContext.request.contextPath}/assets/img/dbajulogo.jpg"  alt="logo djabu" />
        <div class="container_h1">
          <h1>CREAR CUENTA NUEVA</h1>
        </div>
      </div>
      <div class="container_form">
        <form>
          <label for="username">Usuario</label>
          <input type="text" id="username" name="username" />

          <label for="password">Contraseña</label>
          <input type="password" id="password" name="password" />

          <label for="password">Correo Electronico</label>
          <input type="email" id="email" name="email" />

          <div class="checkbox-container">
            <input type="checkbox" id="remember" name="remember" />
            <label for="remember">Recordarme</label>
          </div>
          <button type="submit">Registrarse</button>
        </form>
      </div>
    </div>
    <footer><h3>&copy copyright</h3></footer>
  </body>
</html>
