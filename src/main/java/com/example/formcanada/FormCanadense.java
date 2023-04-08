package com.example.formcanada;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/processar-formulario")
public class FormCanadense extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String dataNascimentoStr = request.getParameter("dataNascimento");
        String idioma = request.getParameter("idioma");
        String[] habilidades = request.getParameterValues("habilidades");

        // Validação dos campos OBRIGATÓRIO
        if (nome == null || nome.isEmpty() || dataNascimentoStr == null || dataNascimentoStr.isEmpty()
                || idioma == null || idioma.isEmpty() || habilidades == null || habilidades.length == 0) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Todos os campos são obrigatórios.");
            return;
        }

        // Conversão FormatDate
        Date dataNascimento = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            dataNascimento = sdf.parse(dataNascimentoStr);
        } catch (Exception e) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Data de nascimento inválida.");
            return;
        }

        // Formatando as informações para o usuário
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Data de nascimento: ").append(new SimpleDateFormat("dd/MM/yyyy").format(dataNascimento)).append("\n");
        sb.append("Idioma nativo: ").append(idioma).append("\n");
        sb.append("Habilidades técnicas: ");
        for (int i = 0; i < habilidades.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(habilidades[i]);
        }
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.println(sb.toString());
    }
}