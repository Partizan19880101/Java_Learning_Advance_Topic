package javaAdvance.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class Teachers {
    String name;
    char sex;
    int course;
    int age;
    double averageGrade;
}
