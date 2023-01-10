import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDetails {


     private CustomerProducts customerProducts;
     private String name;
     private String email;
     private String address;
     private long mobileNumber;


}

