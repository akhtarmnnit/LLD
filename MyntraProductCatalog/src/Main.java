import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        CategoryRepository instance = CategoryRepository.getCategoryRepositoryInstance();
        instance.loadCategoriesFromDBConfig();
        System.out.println(instance.topLevelcategoryList());
        while (true)
        {
            int chosenCategory = sc.nextInt();
            Category cat = instance.getcategoryMap().get(chosenCategory);
            System.out.println(cat.getSubCategoryList());

        }
    }
}
