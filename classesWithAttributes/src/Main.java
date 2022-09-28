public class Main {
    public static void main(String[] args) {

        Product product = new Product();

        Product product2 = new Product(1,"Laptop","Laptop",3000,2,"Siyah");

        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.setKod("1");
        product.setRenk("Mavi");

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}
