<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Idade Atual</title>
</head>
<body>
    <h1>Calculadora de Idade</h1>
    <form action="CalculadoraIdadeServlet" method="get">
        <label for="anoNascimento">Ano de Nascimento:</label>
        <input type="number" id="anoNascimento" name="anoNascimento" required>
        <br>
        <label for="fezAniversario">Já fez aniversário este ano?</label>
        <input type="radio" id="sim" name="fezAniversario" value="sim" required>
        <label for="sim">Sim</label>
        <input type="radio" id="nao" name="fezAniversario" value="nao">
        <label for="nao">Não</label>
        <br>
        <input type="submit" value="Calcular Idade">
    </form>
</body>
</html>
