package example0;

public class Main {

    public static void main(String[] args) {
        Database database = new Database();
        User user = new User(1, "user@gmail.com", "qwerty007");
        User user1 = new User(2, "user1@gmail.com", "qwerty008");
        User user2 = new User(3, "user2@gmail.com", "qwerty009");
        User user3 = new User(4, "user3@gmail.com", "qwerty010");

        Admin admin = new Admin(0, "admin", "asdfx", new String[]{"read", "delete", "update", "create"});
        database.authenticateAdmin(admin);

//        database.addUser(user);
//        database.addUser(user1);
//        database.addUser(user3);
//
//        database.authenticateUser(user);
//        database.authenticateUser(user1);
//        database.authenticateUser(user2);
    }
}
