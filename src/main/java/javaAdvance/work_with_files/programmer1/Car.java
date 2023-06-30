package javaAdvance.work_with_files.programmer1;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Car implements Serializable {
    String model;
    String colour;
}
