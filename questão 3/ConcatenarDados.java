package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConcatenarDadosServlet")
public class ConcatenarDados extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            String nome = request.getParameter("nome");
            String estadoCivil = request.getParameter("estadoCivil");
            String faixaEtaria = request.getParameter("faixaEtaria");

            String dadosConcatenados = "Nome: " + nome + "<br>";
            dadosConcatenados += "Estado Civil: " + estadoCivil + "<br>";
            dadosConcatenados += "Faixa Etária: " + faixaEtaria + "<br>";

            out.println("<html>");
            out.println("<head><title>Dados Concatenados</title></head>");
            out.println("<body>");
            out.println("<h1>Dados Concatenados:</h1>");
            out.println("<p>" + dadosConcatenados + "</p>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}
