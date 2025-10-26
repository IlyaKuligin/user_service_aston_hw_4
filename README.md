Aston. Java интенсив. Домашнее задание №4.
Проект содержит решение домашнего задания №4 В этом проекте реализовано Spring приложение user-service использующее PostgreSQL в качестве БД.

Основные особенности:

реализованы базовые операции CRUD (Create, Read, Update, Delete) над сущностью User
база данных — PostgreSQL
используется API для взаимодействия с приложением. Основные методы:

Добавить юзера POST http://localhost:8080/api/users

Тело запроса:
{
    "name": "Анна Иванова",
    "email": "anna.ivanova@example.com",
    "age": 28
}

Получение всех пользователей: GET http://localhost:8080/api/users

Получение пользователя по id: GET http://localhost:8080/api/users/{id}

Обновление пользователя по id: PUT http://localhost:8080/api/users/{id}

Удаление пользователя по id: DELETE http://localhost:8080/api/users/{id}




