# Todolist

## Descrição

Este é um projeto de lista de tarefas (todolist) que permite aos usuários adicionar, editar e listar tarefas.

## Instalação

Para instalar e configurar o projeto, siga os passos abaixo:

1. Clone o repositório:
   ```bash
   git clone https://github.com/HermannDouglas/todolist.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd todolist
   ```
3. Compile o projeto e instale as dependências:
   ```bash
   mvn clean install
   ```

## Uso

Para iniciar o projeto, execute o comando:

```bash
mvn spring-boot:run
```

Abra o navegador e acesse `http://localhost:8080` para ver a aplicação em execução.

## Funcionalidades

- Cadastrar usuários
- Adicionar tarefas
- Editar tarefas
- Listar tarefas

## Interação com a Aplicação

Esta é uma aplicação backend, sendo necessário usar uma ferramenta como o Postman para interagir com a API. Você pode enviar requisições HTTP para os endpoints da aplicação para realizar operações como cadastrar usuários, adicionar tarefas, editar tarefas e listar tarefas.

## Exemplo de JSON da API

Aqui está um exemplo de como seria a estrutura de um objeto JSON para os seguintes exemplos:

1. Usuario (POST), URL: http://localhost:8080/users/.

```json
{
  "name": "Cris Redfield",
  "username": "redfield",
  "password": "crs@rdfld"
}
```

2. Cadastrar Tarefa (POST), URL: http://localhost:8080/tasks/.

```json
{
  "description": "Primeira aula de Java Spring-Boot",
  "title": "Gravação de Aula",
  "priority": "Alta",
  "startAt": "2025-02-06T13:45:00",
  "endAt": "2025-02-06T15:45:00"
}
```

3. Atualizar Tarefa (PUT), URL: http://localhost:8080/tasks/7880bca0-2673-491e-9c5b-3ce150ea1787 (adicionar o id da tarefa).

```json
{
  "title": "Novo Título"
}
```

3. Listar Tarefas (GET), URL: http://localhost:8080/tasks/ (resposta do servidor).

```json
{
  "title": "Novo Título"
}
```

## Contribuição

Para contribuir com o projeto, siga os passos abaixo:

1. Faça um fork do repositório.
2. Crie uma nova branch:
   ```bash
   git checkout -b minha-nova-funcionalidade
   ```
3. Faça as alterações desejadas e commit:
   ```bash
   git commit -m "Adiciona nova funcionalidade"
   ```
4. Envie para o repositório remoto:
   ```bash
   git push origin minha-nova-funcionalidade
   ```
5. Abra um Pull Request.
