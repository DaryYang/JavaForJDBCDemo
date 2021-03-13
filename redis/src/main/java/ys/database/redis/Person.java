package ys.database.redis;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
    private String name;
    private String sex;
    private int age;
    private String identityNumber;
}
