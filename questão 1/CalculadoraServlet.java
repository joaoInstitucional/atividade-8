package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculadoraServlet")
public class CalculadoraServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            int numero1 = Integer.parseInt(request.getParameter("numero1"));
            int numero2 = Integer.parseInt(request.getParameter("numero2"));

            // Realize as operações matemáticas
            int soma = numero1 + numero2;
            int subtracao = numero1 - numero2;
            int multiplicacao = numero1 * numero2;
            int divisao = numero1 / numero2;
            int restoDivisao = numero1 % numero2;

            out.println("<html>");
            out.println("<head><title>Resultado</title></head>");
            out.println("<body>");
            out.println("<h1>Resultados das operações matemáticas:</h1>");
            out.println("<p>Número 1: " + numero1 + "</p>");
            out.println("<p>Número 2: " + numero2 + "</p>");
            out.println("<p>Soma: " + soma + "</p>");
            out.println("<p>Subtração: " + subtracao + "</p>");
            out.println("<p>Multiplicação: " + multiplicacao + "</p>");
            out.println("<p>Divisão: " + divisao + "</p>");
            out.println("<p>Resto da Divisão: " + restoDivisao + "</p>");
            out.println("</body>");
            out.println("</html>");
        } catch (NumberFormatException e) {
            out.println("Por favor, insira números inteiros válidos.");
        } finally {
            out.close();
        }
    }
}
