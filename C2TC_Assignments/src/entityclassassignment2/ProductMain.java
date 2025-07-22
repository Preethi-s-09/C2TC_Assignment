package entityclassassignment2;

public class ProductMain {
    public static void main(String[] args) {
        // Create 4 product objects
        Product p1 = new Product();
        p1.setProductName("Laptop");
        p1.setProductId(201);
        p1.setPrice(45000.00);

        Product p2 = new Product();
        p2.setProductName("Mouse");
        p2.setProductId(202);
        p2.setPrice(500.00);

        Product p3 = new Product();
        p3.setProductName("Keyboard");
        p3.setProductId(203);
        p3.setPrice(1000.00);

        Product p4 = new Product();
        p4.setProductName("Monitor");
        p4.setProductId(204);
        p4.setPrice(8500.00);

        // Output in single-line per product
        System.out.println(p1.getProductName() + " " + p1.getProductId() + " " + p1.getPrice());
        System.out.println(p2.getProductName() + " " + p2.getProductId() + " " + p2.getPrice());
        System.out.println(p3.getProductName() + " " + p3.getProductId() + " " + p3.getPrice());
        System.out.println(p4.getProductName() + " " + p4.getProductId() + " " + p4.getPrice());
    }
}
