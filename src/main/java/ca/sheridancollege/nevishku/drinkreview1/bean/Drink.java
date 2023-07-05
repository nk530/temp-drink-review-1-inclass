package ca.sheridancollege.nevishku.drinkreview1.bean;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
//@Getter  @Setter @ToString @EqualsAndHashCode
public class Drink {

    private int id;
    private String name;
    private String main1;
    private double amount1;
    private String main2;
    private double amount2;
    private String directions;


}



