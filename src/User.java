public class User {

    private int id ;
    private  String username ;
    private int password ;

    public User (int id ,String username, int password) {

        this.id = id;
        this.username = username;
        this.password = password;

    }
    /************ объект класса Корзина *********************/
    Basket basketUser = new Basket();

    public void setBasketUser(Basket basketUser) {

        this.basketUser = basketUser;
    }

    public Basket getBasketUser() {

        return basketUser;
    }
    /*********************************************************/

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPassword() {
        return password;
    }
}
