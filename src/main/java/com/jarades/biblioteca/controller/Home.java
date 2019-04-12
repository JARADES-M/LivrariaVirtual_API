package com.jarades.biblioteca.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class Home {

    final String indexHtml = "<h1>Use a sua Ferramenta de escolha para operação desta API</h1>" +
            "<h3> As Operações Permitidas são: </h3>" +
            "<ul> <li> Postar comentários para livros (resenhadas)</li>" +
            "<li>Pesquisa de livros por critérios diversos</li>" +
            "<li>Manipular um carrinho de compras</li>" +
            "<li>Realizar pedidos</li>" +
            "<li>Acompanhamento o status das entregas realizadas</li>" +
            "<li>Cadastrar livros</li> </ul>" +
            "<p>Veja mais detalhes no <a target='_blank' href='https://github.com/JARADES-M/LivrariaVirtual_API'>GitHub</a>.</p>";

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        return this.indexHtml;
    }
}
