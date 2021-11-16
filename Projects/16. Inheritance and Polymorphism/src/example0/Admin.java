package example0;

/**
 * 16.11.2021
 * 16. Inheritance and Polymorphism
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Admin extends User {
    private String[] authorities;

    public Admin(int id, String email, String password, String[] authorities) {
        super(id, email, password); //вызов конструктора класса предка, потому что для этих полей уже есть конструктор у предка
        this.authorities = authorities; // для этого нету, инициализируем самостоятельно
    }

    // этот метод убирать нельзя, потому что логика работы у него своя
    // этот метод переопределенный
    public String[] authenticate() {
        // admin, asdfx, read, delete, update, create
        String result[] = new String[2 + authorities.length];
        // email = admin
        // password = asdfx
        // authorities[] = {read, delete, update, create}
        // нужно получить массив result[] = {admin ,asdfx, read, delete, update, create}

        result[0] = this.email;
        result[1] = this.password;
        // начиная со второй позиции result копировать туда данные с 0-й позиции authorities
        for (int i = 2; i < result.length; i++) {
            result[i] = this.authorities[i - 2];
        }

        return result;
    }

}
