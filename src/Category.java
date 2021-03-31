import java.util.List;

public class Category   {

    private String category ;
    /***************** массив телефоны **********************/
    private List<Phone> phones;

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Phone> getPhones() {
        return phones;
    }
    /***********************************************/

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
    /*************************************************/

    private List<NoteBook> noteBooks;

    public void setNoteBooks(List<NoteBook> noteBooks) {
        this.noteBooks = noteBooks;
    }

    public List<NoteBook> getNoteBooks() {
        return noteBooks;
    }


}
