public class Main {


    public static void main(String[] args) {
        


        ProductType productType1 =new ProductType("M","Black","Male");
        ProductType productType2 =new ProductType("L","Red","Female");
        ProductType [] productType ={productType1,productType2};

       CustomerProducts customerProduct1 =new CustomerProducts("shirt","1000",productType);
       CustomerProducts customerProduct2 = new CustomerProducts("pant","2000",productType);

        CustomerDetails customerDetails1 = new CustomerDetails(customerProduct1,"WW","w@gmail.com",
                "mg road",2763);
        CustomerDetails customerDetails2 =new CustomerDetails(customerProduct2,"Jhon","jhon@gmail.com",
                "KR road",665566);

        customerDetails1.getCustomerProducts().getProductName();




    }
}




