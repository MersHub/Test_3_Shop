import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


/********************************* IPhone ***************************************************/

        List<Phone> IPhonesList = new ArrayList<>();

        IPhonesList.add(new Phone(" IPhone 11 "," USA ",1000));
        IPhonesList.add(new Phone(" IPhone 11 Pro "," USA ",1100));
        IPhonesList.add(new Phone(" IPhone 11 ProMax "," USA ",1200));

        Category IPhones = new Category();

        IPhones.setCategory("IPhone");
        IPhones.setPhones(IPhonesList);

/*********************************** Samsung *****************************************************/

        List<Phone> IPhonesList2 = new ArrayList<>();


        IPhonesList2.add(new Phone(" Samsung galaxy S10 "," Korea ",650));
        IPhonesList2.add(new Phone(" Samsung galaxy S20 "," Korea ",600));
        IPhonesList2.add(new Phone(" Samsung galaxy S21 "," Korea ",950));

        Category Samsung = new Category();

        Samsung.setCategory("Samsung");
        Samsung.setPhones(IPhonesList2);

/***************************************** Xiaomi ************************************************/

        List<Phone> IPhoneList3 = new ArrayList<>();


        IPhoneList3.add(new Phone(" Xiaomi Redmi Note 9T "," China ",300));
        IPhoneList3.add(new Phone(" Xiaomi Poco X3 "," China ",400));
        IPhoneList3.add(new Phone(" Xiaomi Mi 10 "," China ",900));

        Category Xiaomi = new Category();

        Xiaomi.setCategory("Xiaomi");
        Xiaomi.setPhones(IPhoneList3);


        Category [] categories = {IPhones,Samsung,Xiaomi};




/********************************************* NoteBook *********************************************/

        List<NoteBook> NoteBookList = new ArrayList<>();


        NoteBookList.add(new NoteBook(" Asus TUF GAMING "," China ",1000));
        NoteBookList.add(new NoteBook(" Lenovo Legion " , " China ",1000));

        Category NoteBook = new Category();

        NoteBook.setCategory("NoteBook");
        NoteBook.setNoteBooks(NoteBookList);


        System.out.println();

        User user3 = new User(3,"Alex",432);
        user3.getBasketUser().addDevice(NoteBookList.get(1));
        System.out.println(user3.getBasketUser());
        System.out.println();

/**************************************************************************************************/

        User user1 = new User(1,"Egor",111);
        user1.getBasketUser().addDevice( IPhonesList2.get(1));
        System.out.println(user1.getBasketUser());

        System.out.println();

        User user2 = new User(2,"Roma",123);
        user2.getBasketUser().addDevice(IPhonesList.get(1));
        System.out.println(user2.getBasketUser());


    }
}
