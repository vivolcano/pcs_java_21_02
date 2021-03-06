# Spring & Spring Boot, Hibernate & JPA

* Spring - фреймворк, который предоставляет возможность DI (DependencyInjection, DI-контейнер).
* Spring Boot - надстройка над Spring, которая предоставляет автоконфигурации.

## Элементы Spring

`@Component` - данной аннотацией помечаем классы, на основе которых Spring создаст "бин(компонент)" и поместит его в контейнер.
`@Controller` - помечаем классы-контроллеры, это классы, которые способны обрабатывать `HTTP`-запросы (контроллеры также помещаются в контейнер)
`@Autowired` - можно повесить на конструктор или поле. Находит нужный по типу бин и делает его `inject`
`@Configuration` - помечаем аннотацией класс, который является конфигурационным.
`@Bean` - данной аннотацией помечаем методы, результатом работы которых является бин и его нужно поместить в контейнер.

## Элементы Spring Boot

* `application.properties` - файл настроек, который считывает Spring Boot для вашего приложения.

## MVC - Model, View, Controller

* Паттерн проектирования где выделяются три компонента:
    - View (представление, шаблон) - то, что видит пользователь
    - Model (модель, данные) - то, что мы хотим показать на странице в качестве изменяемых данных. У модели есть атрибуты, их можно выводить на странице
    - Controller (контроллер) - диспетчер, который возвращает нужные представления с нужными данными.

## ORM

* Object Relational Mapping - отображение объектно-ориентированных сущностей в реляционные отношения.
* JPA (Java Persistence API) - набор интерфейсов и аннотаций для реализации ORM в Java.
* Hibernate - это ORM-движок, реализация JPA - генерация SQL-кода и отображение данных в объекты и обратно.
* Spring Data JPA - фреймворк, обертка над JPA + Hibernate от Spring, позволяет создавать репозитории и минимизировать написание шаблонного кода.