package example0;

/**
 * 16.11.2021
 * 16. Inheritance and Polymorphism
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Database {
    private User[] users;
    private int count;

    public Database() {
        this.users = new User[10];
    }

    public void addUser(User user) {
        this.users[count] = user;
        this.count++;
    }

    public void authenticateUser(User user) {
        // получаем данные для входа пользователя (email и пароль)
        String[] credentials = user.authenticate();
        for (int i = 0; i < count; i++) {
            // далее, проверяем, есть ли совпадение среди добавленных пользователей)
            if (credentials[0].equals(users[i].getEmail())
                    && credentials[1].equals(users[i].getPassword())) {
                System.out.println("Аутентификация пройдена - " + user.getEmail());
                return;
            }
        }
        System.err.println("Пользователь не обнаружен - " + user.getEmail());
    }

    public void authenticateAdmin(Admin admin) {
        if (admin.getEmail().equals("admin") && admin.getPassword().equals("asdfx")) {
            System.out.println("Аутентификация пройдена - admin");
        } else {
            System.err.println("Аутентификация не пройдена - admin");
        }
    }
}
