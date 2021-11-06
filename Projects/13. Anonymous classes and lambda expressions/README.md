# Анонимные классы

* Вы можете сделать потомка какого-либо абстрактного класса(или интерфейса) прям внутри метода. Тогда вы создаете
анонимный класс. Для такого класса можно указать реализацию его абстрактных методов, добавить поля и т.д.
* При этом, экземпляр будет создан только один.
* Функциональный интерфейс - интерфейс, в котором есть только один метод.

## Лямбда выражения

Пусть есть функциональный интерфейс вида:

```
interface I {
    int f(int x, int y);
}
```

Тогда лямбда-выражением можно описать реализацию метода f в анонимном виде:

```
I i = (x, y) -> x + y;

Это равносильно записи:

I i = new I {
    public int f(int x, int y) {
        return x + y;
    }
}
```