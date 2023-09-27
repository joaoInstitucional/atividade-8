package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculadoraIdadeServlet")
public class CalculadoraIdadeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            int anoNascimento = Integer.parseInt(request.getParameter("anoNascimento"));

            // Verifique se a pessoa já fez aniversário este ano
            boolean fezAniversario = "sim".equals(request.getParameter("fezAniversario"));

            // Obtém o ano atual
            int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

            // Calcula a idade atual
            int idade = anoAtual - anoNascimento;

            // Se a pessoa ainda não fez aniversário, subtrai 1 da idade
            if (!fezAniversario) {
                idade--;
            }

            out.println("<html>");
            out.println("<head><title>Idade Atual</title></head>");
            out.println("<body>");
            out.println("<h1>Idade Atual:</h1>");
            out.println("<p>Ano de Nascimento: " + anoNascimento + "</p>");
            out.println("<p>Fazendo Aniversário este Ano? " + (fezAniversario ? "Sim" : "Não") + "</p>");
            out.println("<p>Idade Atual: " + idade + " anos</p>");
            out.println("</body>");
            out.println("</html>");
        } catch (NumberFormatException e) {
            out.println("Por favor, insira um ano de nascimento válido.");
        } finally {
            out.close();
        }
    }
}
