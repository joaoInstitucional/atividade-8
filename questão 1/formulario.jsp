<%@page import="java.awt.print.Printable"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Operações Matemáticas</title>
</head>
<body>
    <h1>Calculadora</h1>
    <form action="CalculadoraServlet" method="post">
        <label for="numero1">Número 1:</label>
        <input type="number" id="numero1" name="numero1" required>
        <br>
        <label for="numero2">Número 2:</label>
        <input type="number" id="numero2" name="numero2" required>
        <br>
        <input type="submit" value="Calcular">
    </form>
</body>
</html>