# СУБД, SQL, JDBC

* [SQL EX](https://www.sql-ex.ru/?Lang=0)
* [JOINS](https://habr.com/ru/post/278087/)
* [Установка Postgres](https://winitpro.ru/index.php/2019/10/25/ustanovka-nastrojka-postgresql-v-windows/)

## CУБД

* Хранилище + Спец. ПО, которое позволяет эффективно хранить данные, фильтровать их и получать различную статистику.
* Выделяют SQL (реляционные) базы данных, которые хранят информацию в виде таблиц.
* Каждая таблица имеет набор столбцов (название, тип) и строк. Каждая строка - единица информация.

## SQL

* Структурированный язык запросов - позволяет манипулировать базами данных.

## JDBC

* JavaDataBaseConnectivity - подразумевает драйвера для каждой СУБД, которая будет работать с Java.

* `DataSource` - интерфейс, который описывает поведение объекта, предоставляющего подключение к базе данных.
## Spring JDBC

* `DriverManagerDataSource` - простая реализация механизма для подключения к БД.
* `JdbcTemplate` - позволяет удобно отправлять запросы в базу данных.