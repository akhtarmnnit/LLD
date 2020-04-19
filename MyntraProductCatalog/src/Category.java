import java.util.*;
public class Category {
    private int Id;
    private String name;

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public List<Category> getSubCategoryList() {
        return subCategoryList;
    }

    List<Category> subCategoryList;//For terminal categories this could be empty list
    Category(int Id, String name)
    {
        this.Id=Id;
        this.name=name;
    }
    void expand()//Any action on category like hover, click etc would lead to this
    {
        for (Category category:subCategoryList)
        {
            System.out.println(category.getName());
        }
    }
    @Override
    public String toString()
    {

        return "["+Id+","+name+"]";
    }

}
