import java.util.*;

public class CategoryRepository {
    private static CategoryRepository instance=new CategoryRepository();
    public static CategoryRepository getCategoryRepositoryInstance()
    {
        return instance;
    }

    public Map<Integer,Category> getcategoryMap() {
        return categoryMap;
    }

    public void setcategoryMap(Map<Integer,Category> categoryMap) {
        this.categoryMap = categoryMap;
    }

    public static List<Category> topLevelcategoryList() {
        return topLevelcategoryList;
    }

    public void setTopLevelcategoryMap(List<Category> topLevelcategoryList) {
        this.topLevelcategoryList = topLevelcategoryList;
    }

    static Map<Integer,Category> categoryMap;
    static List<Category> topLevelcategoryList;
    int id;
    private CategoryRepository()
    {
        categoryMap = new HashMap<Integer,Category>();
        topLevelcategoryList = new ArrayList<>();
        id=1000001;
    }
    void loadCategoriesFromDBConfig()
    {
        //In real scneario we would use the DB to load this.
        //At DB level, we have category table with category name and description and we also have category parent and category child



        categoryMap.put(id,new Category(id,"MEN"));topLevelcategoryList.add(categoryMap.get(id));id++;
        categoryMap.put(id,new Category(id,"WOMEN"));topLevelcategoryList.add(categoryMap.get(id));id++;
        categoryMap.put(id,new Category(id,"KIDS"));topLevelcategoryList.add(categoryMap.get(id));id++;
        categoryMap.put(id,new Category(id,"HOME&LIVING"));topLevelcategoryList.add(categoryMap.get(id));id++;
        categoryMap.put(id,new Category(id,"DISCOVER"));topLevelcategoryList.add(categoryMap.get(id));id++;

        categoryMap.put(id,new Category(id,"TOPWEAR"));id++;
        categoryMap.put(id,new Category(id,"BOTTOMWEAR"));id++;
        categoryMap.put(id,new Category(id,"FOOTWEAR"));id++;
        categoryMap.put(id,new Category(id,"GADGETS"));id++;

        //Top wear Category
        categoryMap.put(id,new Category(id,"T-SHIRT"));id++;
        categoryMap.put(id,new Category(id,"CASUAL SHIRT"));id++;
        categoryMap.put(id,new Category(id,"FORMAL SHIRTS"));id++;
        categoryMap.put(id,new Category(id,"SWEATERS"));id++;
        categoryMap.put(id,new Category(id,"JACKETS"));id++;

        //Bottom wear Category
        categoryMap.put(id,new Category(id,"CASUAL SHOES"));id++;
        categoryMap.put(id,new Category(id,"SPORTS SHOES"));id++;
        categoryMap.put(id,new Category(id,"FORMAL SHOES"));id++;
        categoryMap.put(id,new Category(id,"SNEAKERS"));id++;
        categoryMap.put(id,new Category(id,"SANDALS AND FLOATERS"));id++;
        



    }


}
