<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulário Canadense</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

<div class="title">
    <h1>Formulário Canadense</h1>
    <img src="https://flagcdn.com/w40/ca.png" alt="Canada Flag" style="vertical-align: middle;">
</div>

<form action="processar-formulario" method="post">
    <label for="nome">Nome:</label>
    <input type="text" name="nome" id="nome" required><br>
    <label for="dataNascimento">Data de Nascimento:</label>
    <input type="date" name="dataNascimento" id="dataNascimento" required><br>

    <div class="section-break"></div>
    <label>Idioma Nativo:</label><br>
    <input type="radio" name="idioma" id="ingles" value="ingles" required checked>
    <label for="ingles"><img src="https://flagcdn.com/16x12/us.png" alt="US Flag"> Inglês</label><br>
    <input type="radio" name="idioma" id="espanhol" value="espanhol" required>
    <label for="espanhol"><img src="https://flagcdn.com/16x12/es.png" alt="Spain Flag"> Espanhol</label><br>
    <input type="radio" name="idioma" id="portugues" value="portugues" required>
    <label for="portugues"><img src="https://flagcdn.com/16x12/br.png" alt="Brazil Flag"> Português</label><br>
    <div class="section-break"></div>

    <label>Habilidades Técnicas:</label><br>
    <input type="checkbox" name="habilidades" id="java" value="java" checked>
    <label for="java">Java</label><br>
    <input type="checkbox" name="habilidades" id="javascript" value="javascript">
    <label for="javascript">JavaScript</label><br>
    <input type="checkbox" name="habilidades" id="html" value="html">
    <label for="html">HTML</label><br>
    <input type="checkbox" name="habilidades" id="css" value="css">
    <label for="css">CSS</label><br>
    <br>
    <input type="submit" value="Enviar">
</form>

<footer>
    <p>Elizeu Santos - 2023</p>
</footer>

</body>
</html>