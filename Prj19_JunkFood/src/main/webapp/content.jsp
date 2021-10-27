<%@page import="java.util.ArrayList"%>
<h1>${titolo}</h1>
<table>
  <tr>
    <th>Prodotto</th>
    <th>Azione</th>
  </tr>
  
  <% 
  ArrayList<String> prodotti = (ArrayList<String>) request.getAttribute("prodotti");
  
  for (String p : prodotti){
  %>
  
  <tr>
    <td><%= p %></td>
    <td><a href="">compra</a></td>
  </tr>
  
  <% } %>
</table>
