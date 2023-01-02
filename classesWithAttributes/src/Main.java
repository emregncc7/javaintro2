public class Main {
    public static void main(String[] args)
    {
        Product product = new Product();
        product.setName("Laptop");
        product.set_id(1);
        product.setDescription("asus");
        product.setPrice(42221);
        product.setStockAmount(42);

        ProductManager productManager = new ProductManager();
        ProductManager.Add(product);
    }
}