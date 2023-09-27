<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Concatenar Dados</title>
</head>
<body>
    <h1>Formulário de Dados Pessoais</h1>
    <form action="ConcatenarDadosServlet" method="post">
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" required>
        <br>
        <label for="estadoCivil">Estado Civil:</label>
        <select id="estadoCivil" name="estadoCivil" required>
            <option value="Solteiro(a)">Solteiro(a)</option>
            <option value="Casado(a)">Casado(a)</option>
            <!-- Adicione outras opções de estado civil aqui -->
        </select>
        <br>
        <label for="faixaEtaria">Faixa Etária:</label>
        <select id="faixaEtaria" name="faixaEtaria" required>
            <option value="3 a 10 anos">3 a 10 anos</option>
            <option value="11 a 25 anos">11 a 25 anos</option>
            <option value="36 a 55 anos">36 a 55 anos</option>
            <option value="56 a 100 anos">56 a 100 anos</option>
        </select>
        <br>
        <input type="submit" value="Concatenar Dados">
    </form>
</body>
</html>
