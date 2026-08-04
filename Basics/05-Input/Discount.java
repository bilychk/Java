class Discount
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter price of one item: ");
        double price = scanner.nextDouble();  // Price can contain decimal values, so double is used

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter discount percentage: ");
        double percent = scanner.nextDouble();

        double totalPrice = price * quantity;
        double discount = totalPrice * percent / 100;
        double finalPrice = totalPrice - discount;

        System.out.println("Total price before discount: " + totalPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Final price: " + finalPrice);

        scanner.close();
    }
}
