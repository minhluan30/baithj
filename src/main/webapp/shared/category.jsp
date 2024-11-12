<%-- 
    Document   : Left
    Created on : Sep 28, 2023, 12:08:09 PM
    Author     : KHOACNTT
--%>

<%@page import="model.TheLoai"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Dao.TheLoaiDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
     TheLoaiDao  theloaiDao = new TheLoaiDao();
     ArrayList<TheLoai> dstheLoai= theloaiDao.getAll();
%>

<div class="card mb-3">
    <h3 class="card-header">Danh mục loại</h3>  
        <ul class="list-group list-group-flush">
            <%
               for(TheLoai x : dstheLoai)
               {
            %>
             <li class="list-group-item"><a class="text-decoration-none" href="product.jsp?maloai=<%=x.getMaloai() %>"> <%=x.getTenloai() %> </a></li>           
            <%
               }
            %>
        </ul>   
</div>