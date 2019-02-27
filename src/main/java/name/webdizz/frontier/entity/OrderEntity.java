package name.webdizz.frontier.entity;

import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

@Data
public class OrderEntity implements Serializable {

    private Long id;
    private String comment;
    private String employee;
    private LocalDate placedAt;

}