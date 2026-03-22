package E_Commerce_Platform;

 class Electronics extends Product implements Taxable {
     public Electronics(int id, String name, double price) {
         super(id, name, price);
     }

     @Override
     double calculateDiscount() {
         return getPrice() * 0.10;
     }

     @Override
     public double calculateTax() {
         return getPrice() * 0.18;
     }

     @Override
     public void getTaxDetails() {
         System.out.println("Tax (Electronics 18%): " + calculateTax());
     }

}
