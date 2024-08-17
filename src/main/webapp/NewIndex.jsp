<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.model.Product" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.service.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Amazon.com</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="css/Style.css">
</head>
<body>
    <header>
        <div class="navbar">
            <div class="nav-logo border">
            
               <div class="logo"Style="background-image: url('image/logo.png');"></div>
            </div> 
            <div class="nav-address border">
                <p class="add-first">DeliverTo</p>
                <div class="add-icon">
                    <i class="fa-solid fa-location-dot"></i>
                    <p class="add-sec">India</p>
                </div>
            </div>
            <div class="nav-search border">
                <select class="search-select">
                    <option>Deals</option>
                </select>
                <input placeholder="Search Amazon" class="search-input">
                <div class="search-icon">
                    <i class="fa-solid fa-magnifying-glass"></i>
                </div>
            </div>
            <div class="span-signin border">
    <a href="customerLogin.html" class="anker"><p><span>Hello,sign in/<span></p>
                <p class="nac-sec">Account & list</p></a>
            </div>
            <div class="span-return border">
                <p><span>Returns</span></p>
                <p class="nac-sec">& Orders </p>
            </div>
            <div class="nav-cart border">
                <i class="fa-solid fa-cart-shopping"></i>
    <a href="Profile" class="anker">Cart</a>
            </div>
        </div>
        <div class="panel">
            <div class="panel-all">
                    <i class="fa-solid fa-bars"></i>
                    All
            </div>
             <div class="panel-ops">
                    <p>Today's Deals</p>
                    <p>Customer Services</p>   
                    <p>Registry</p>
                    <p>Gift Cards</p>
                    <p>Sell</p>
             </div>
           <div class="panel-deals">
            Shop deals in Electronics
           </div>
        </div>
    </header>
    <div class="hero-section" style="background-image: url('image/main.jpg');">
        <div class="hero-msg">
            <p>
                You are on amazon.com.You can also shop on Amazon india for millions of products with fast local delivery. <a href=" ">click here to go to amazon.in</a>
            </p>
        </div>
    </div>
    <%
        ProductServiceImple service=new ProductServiceImple();

        ArrayList<Product> list = service.showAllProduct();
        Iterator<Product> itr = list.iterator();

       while(itr.hasNext()) {
	      Product student = new Product();
	      student = itr.next();
	
   	
     %>
    <div class="shop-section">
    
        <div class="box">
            <div class="box-content">
                <h2>Makeup Products</h2>
                <div class="box-img" style="background-image: url('image/box1.jpg');"></div>
               <%out.print("<a href='GetProductServlet?id=" + student.getProductid() + "'>" + "Add Cart" + "</a>"); %>
            </div>
        </div>
         
        <div class="box">
            <div class="box-content">
                <h2>New Looks For the New Season</h2>
                <div class="box-img" style="background-image: url('image/box2.jpg');"></div>
           <%out.print("<a href='GetProductServlet?id=" + student.getProductid() + "'>" + "Add Cart" + "</a>"); %>
            </div>
        </div>
        <div class="box">
            <div class="box-content">
                <h2>Do up Your Home</h2>
                <div class="box-img" style="background-image: url('image/box3.jpg');"></div>
              <%out.print("<a href='GetProductServlet?id=" + student.getProductid() + "'>" + "Add Cart" + "</a>"); %>
            </div>
        </div>
         
          <div class="box">
            <div class="box-content">
                <h2>Electronics</h2>
                <div class="box-img" style="background-image: url('image/electornics.avif');"></div>
              <%out.print("<a href='GetProductServlet?id=" + student.getProductid() + "'>" + "Add Cart" + "</a>"); %>
            </div>
        </div>
                
        
        <div class="box">
            <div class="box-content">
                <h2>jwellery</h2>
                <div class="box-img" style="background-image: url('image/jwellery1.avif');"></div>
              <%out.print("<a href='GetProductServlet?id=" + student.getProductid() + "'>" + "Add Cart" + "</a>"); %>
            </div>
        </div>
        <div class="box">
            <div class="box-content">
                <h2>Arts</h2>
                <div class="box-img" style="background-image: url('image/arts.avif');"></div>
              <%out.print("<a href='GetProductServlet?id=" + student.getProductid() + "'>" + "Add Cart" + "</a>"); %>
            </div>
        </div>
        <div class="box">
            <div class="box-content">
                <h2>Kurtis new Collection</h2>
                <div class="box-img" style="background-image: url('image/kurtis.webp');"></div>
              <%out.print("<a href='GetProductServlet?id=" + student.getProductid() + "'>" + "Add Cart" + "</a>"); %>
            </div>
        </div>
        <div class="box">
            <div class="box-content">
                <h2>Shoes Section</h2>
                <div class="box-img" style="background-image: url('image/shoes.avif');"></div>
              <%out.print("<a href='GetProductServlet?id=" + student.getProductid() + "'>" + "Add Cart" + "</a>"); %>
            </div>
        </div>
    </div> 
    <%  } %>
    
   
</body>
</html>