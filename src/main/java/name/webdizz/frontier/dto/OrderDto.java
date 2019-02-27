package name.webdizz.frontier.dto;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class OrderDto {
    @Min(value = 1, groups = { OrderCaseA.class })
    @NotNull(groups = { OrderCaseA.class })
    private Long id;

    @NotNull(groups = { OrderCaseA.class })
    @Size(min = 2, max = 150, groups = { OrderCaseA.class })
    @Size(min = 20, max = 150, groups = { OrderCaseB.class })
    private String comment;

    @NotNull(groups = { OrderCaseB.class })
    private LocalDate placedAt;
}