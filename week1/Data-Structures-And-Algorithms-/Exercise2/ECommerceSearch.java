import java.util.Arrays;
import java.util.Comparator;

public class ECommerceSearch {

    // Product Class
    static class Product {
        int productId;
        String productName;
        String category;

        Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }

        @Override
        public String toString() {
            return "Product ID: " + productId +
                    ", Product Name: " + productName +
                    ", Category: " + category;
        }
    }

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        // Array for Linear Search
        Product[] products = {
                new Product(104, "Laptop", "Electronics"),
                new Product(101, "Mobile", "Electronics"),
                new Product(106, "Shoes", "Fashion"),
                new Product(103, "Watch", "Accessories"),
                new Product(105, "Headphones", "Electronics"),
                new Product(102, "Book", "Education")
        };

        int searchId = 103;

        System.out.println("===== LINEAR SEARCH =====");
        Product linearResult = linearSearch(products, searchId);

        if (linearResult != null) {
            System.out.println("Product Found:");
            System.out.println(linearResult);
        } else {
            System.out.println("Product Not Found");
        }

        // Create Sorted Array for Binary Search
        Product[] sortedProducts = Arrays.copyOf(products, products.length);

        Arrays.sort(sortedProducts, Comparator.comparingInt(p -> p.productId));

        System.out.println("\n===== SORTED PRODUCTS =====");
        for (Product p : sortedProducts) {
            System.out.println(p);
        }

        System.out.println("\n===== BINARY SEARCH =====");

        Product binaryResult = binarySearch(sortedProducts, searchId);

        if (binaryResult != null) {
            System.out.println("Product Found:");
            System.out.println(binaryResult);
        } else {
            System.out.println("Product Not Found");
        }

        // Time Complexity Analysis
        System.out.println("\n===== TIME COMPLEXITY ANALYSIS =====");
        System.out.println("Linear Search:");
        System.out.println("Best Case    : O(1)");
        System.out.println("Average Case : O(n)");
        System.out.println("Worst Case   : O(n)");

        System.out.println();

        System.out.println("Binary Search:");
        System.out.println("Best Case    : O(1)");
        System.out.println("Average Case : O(log n)");
        System.out.println("Worst Case   : O(log n)");

        System.out.println("\nConclusion:");
        System.out.println("Binary Search is faster for large datasets because it reduces");
        System.out.println("the search space by half in every iteration.");
        System.out.println("However, Binary Search requires the array to be sorted.");
        System.out.println("Linear Search works on unsorted arrays but is slower.");
    }
}