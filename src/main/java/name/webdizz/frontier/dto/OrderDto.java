package name.webdizz.frontier.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class OrderDto implements OrderCaseA, OrderCaseB {
    private Long id;
    private String comment;
    private LocalDate placedAt;
}