package name.webdizz.frontier.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;

public interface OrderCaseA {

    @Min(1)
    @NotNull
    Long getId();

    void setId(Long identity);

    @NotNull
    @Size(min = 2, max = 150)
    String getComment();

    void setComment(String comment);

}