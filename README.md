# Livraria Virtual (API)
### Exercício Aula 02

O seu objetivo é implementar uma API para a gestão de uma livraria virtual. Uma livraria
virtual deve ter pelo menos funcionalidades para:
* Postar comentários para livros. (resenhadas)
* Pesquisa de livros por critérios diversos.
* Manipular um carrinho de compras
* Realizar pedidos
* Acompanhamento o status das entregas realizadas.
* Cadastrar livros

#### URI's
| Metodo | URI | Descrição
|------|-------|------|
**GET** | `host/v1/books/` | _Retorna uma coleção de Livros_
**GET** |`host/v1/books/{bookId}` | _Retorna o Livro do **id** informado_
**POST** |`host/v1/books/` | _Realiza o Cadastro de Um Livro_
**GET** |`host/v1/books/{bookId}/comments` | _Retorna uma relação de comentários para o livro do **id** informado_
**POST** |`host/v1/books/{bookId}/comments` | _Realiza o cadastro de um comentário para o livro do **id** informado_

Rodando a Aplicação localmente, a primeira requisição ficaria da seguinte forma.
```sh
http://127.0.0.1:8080/v1/books/
```

> Este é o estágio inicial da aplicação, ainda não funcional.

##### A Ser Feito:

- [x] Retornar todos os livros
- [x] Inclusão de Documentação (Swagger)
- [x] Retornar os Comentários de um livro
- [x] Postar comentários para livros. (resenhadas)
- [ ] Pesquisa de livros por critérios diversos.
- [x] Manipular um carrinho de compras
- [x] Realizar pedidos
- [x] Acompanhamento o status das entregas realizadas.
- [x] Cadastrar livros