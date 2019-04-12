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
**GET** | `host/v1/books/` | _Retorna uma coleção de Livros, podendo incluir uma query para pesquisa_
**POST** |`host/v1/books/` | _Realiza o Cadastro de Um Livro_
**GET** |`host/v1/books/{bookId}/comments` | _Retorna uma relação de comentários para o livro do **id** informado_
**POST** |`host/v1/comments` | _Realiza o cadastro de um comentário para o livro_
**GET** | `host/v1/carts/` | _Retorta os livros adicionados ao carrinho de compras_
**POST** | `host/v1/carts/` | _Adiciona um livro ao carrinho de compras_
**DELETE** | `host/v1/carts/{bookId}` | _Remove do carrinho de compras, o livro do **id** informado_
**GET** | `host/v1/orders/` | _Retorna todos os pedidos cadastrados_
**GET** | `host/v1/orders/{orderId}` | _Retorna o status e demais dados do pedido do **id** informado_
**POST** | `host/v1/orders/` | _Registra um pedido_
**PUT** | `host/v1/orders/` | _Atualiza o status e demais dados de um pedido de acordo com o **id**_
**DELETE** | `host/v1/orders/{orderId}` | _Remove o pedido do **id** informado_

Rodando a Aplicação localmente, a primeira requisição ficaria da seguinte forma.
```
http://127.0.0.1:8080/v1/books/
```
A rodar a aplicação, a documentação estará disponível através do link {host}/swagger-ui.html

Novamente, rodando localmente, fica da seguinte forma.
```
http://127.0.0.1:8080/swagger-ui.html
```

> Todas as funções básicas foram implementadas.

##### A Ser Feito:

- [x] Retornar todos os livros
- [x] Inclusão de Documentação (Swagger)
- [x] Retornar os Comentários de um livro
- [x] Postar comentários para livros. (resenhadas)
- [x] Pesquisa de livros por critérios diversos.
- [x] Manipular um carrinho de compras
- [x] Realizar pedidos
- [x] Acompanhamento o status das entregas realizadas.
- [x] Cadastrar livros