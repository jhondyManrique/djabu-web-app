<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Inventario</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/inventario.css" />
  </head>
  <body>
    <div class="container">
      <div class="container_nav">
        <div class="container_logo">
          <img src="${pageContext.request.contextPath}/assets/img/dbajulogo.jpg" alt="djabu logo" />
        </div>
        <nav>
          <button class="menu_toggle">
            <img src="${pageContext.request.contextPath}/assets/icons/menu.jpg" alt="" />
          </button>
          <div class="container_buscar">
            <label for=""
              ><img class="buscar" src="${pageContext.request.contextPath}/assets/icons/buscar.jpg" alt="icono buscar"
            /></label>
            <input type="text" />
          </div>
          <ul class="menu">
            <li>
              <a href=""><img src="${pageContext.request.contextPath}/assets/icons/inicio.jpg" alt="" />Inicio</a>
            </li>
            <li>
              <a href=""><img src="${pageContext.request.contextPath}/assets/icons/perfil.jpg" alt="" />Perfil</a>
            </li>
            <li>
              <a href=""><img src="${pageContext.request.contextPath}/assets/icons/clientes.jpg" alt="" />Clientes</a>
            </li>
            <li>
              <a href=""><img src="${pageContext.request.contextPath}/assets/icons/empleados.jpg" alt="" />Empleados</a>
            </li>
            <li>
              <a href=""
                ><img src="${pageContext.request.contextPath}/assets/icons/agregar.jpg" alt="" />Agregar Producto</a
              >
            </li>
            <li>
              <a href=""><img src="${pageContext.request.contextPath}/assets/icons/ventas.jpg" alt="" />Ventas</a>
            </li>
            <li>
              <a href=""><img src="${pageContext.request.contextPath}/assets/icons/pedidos.jpg" alt="" />Pedidos</a>
            </li>
          </ul>
        </nav>
      </div>
      <div class="container_table">
        <h1 class="inv">INVENTARIO</h1>
        <table>
          <thead>
            <tr>
              <th>Id</th>
              <th>Producto</th>
              <th>Cantidad</th>
              <th>Precio</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>01</td>
              <td>Camiseta sencilla</td>
              <td>12</td>
              <td>01</td>
            </tr>
            <tr>
              <td>01</td>
              <td>Camiseta sencilla</td>
              <td>12</td>
              <td>01</td>
            </tr>
            <tr>
              <td>01</td>
              <td>Camiseta sencilla</td>
              <td>12</td>
              <td>01</td>
            </tr>
            <tr>
              <td>01</td>
              <td>Camiseta sencilla</td>
              <td>12</td>
              <td>01</td>
            </tr>
            <tr>
              <td>01</td>
              <td>Camiseta sencilla</td>
              <td>12</td>
              <td>01</td>
            </tr>
            <tr>
              <td>01</td>
              <td>Camiseta sencilla</td>
              <td>12</td>
              <td>01</td>
            </tr>
            <tr>
              <td>01</td>
              <td>Camiseta sencilla</td>
              <td>12</td>
              <td>01</td>
            </tr>
            <tr>
              <td>01</td>
              <td>Camiseta sencilla</td>
              <td>12</td>
              <td>01</td>
            </tr>
          </tbody>
        </table>
        <footer><h3>&copy copyright</h3></footer>
      </div>
    </div>
    <script src="${pageContext.request.contextPath}/js/index.js"></script>
  </body>
</html>
