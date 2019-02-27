package name.webdizz.frontier.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.time.LocalDate;

public interface OrderCaseB {

    @NotNull
    LocalDate getPlacedAt();

    void setPlacedAt(LocalDate placedAt);

    @NotNull
    @Size(min = 20, max = 250)
    String getComment();

    void setComment(String comment);

}