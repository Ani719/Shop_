public class Category {
   public String  name;
   public int productCount;

   Category(String name){
       this.name = name;
   }

   Product [] array = new Product[1000];

   public void addProduct(Product product){
      array[productCount] = product;

      productCount++;
       System.out.println(productCount);
   }

}

