import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter the product price: ");
        double price = scanner.nextDouble();

      
        System.out.print("Enter the student discount percentage: ");
        double studentDiscountPercentage = scanner.nextDouble();

        System.out.print("Enter the normal discount percentage: ");
        double normalDiscountPercentage = scanner.nextDouble();

        System.out.print("Enter any additional coupon discount percentage: ");
        double couponDiscountPercentage = scanner.nextDouble();

        
        double studentDiscountAmount = (studentDiscountPercentage / 100) * price;
        double priceAfterStudentDiscount = price - studentDiscountAmount;

        double normalDiscountAmount = (normalDiscountPercentage / 100) * priceAfterStudentDiscount;
        double priceAfterNormalDiscount = priceAfterStudentDiscount - normalDiscountAmount;

        double couponDiscountAmount = (couponDiscountPercentage / 100) * priceAfterNormalDiscount;
        double finalPrice = priceAfterNormalDiscount - couponDiscountAmount;

        // Print the product details
        
        System.out.println("Product Name: " + productName);
        System.out.println("Original Price: rupees" + price);
        System.out.println("Student Discount: " + studentDiscountPercentage + "%");
        System.out.println("Price After Student Discount: rupees" + priceAfterStudentDiscount);
        System.out.println("Normal Discount: " + normalDiscountPercentage + "%");
        System.out.println("Price After Normal Discount: rupees" + priceAfterNormalDiscount);
        System.out.println("Coupon Discount: " + couponDiscountPercentage + "%");
        System.out.println("Final Price After All Discounts: rupees" + finalPrice);
        
        scanner.close();
    }
}
