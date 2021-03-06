package name.webdizz.frontier.validator;

import static org.junit.Assert.assertThat;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import static org.hamcrest.core.Is.is;
import org.junit.BeforeClass;
import org.junit.Test;

import name.webdizz.frontier.dto.OrderDto;
import name.webdizz.frontier.dto.OrderCaseA;
import name.webdizz.frontier.dto.OrderCaseB;

public class FrontierValidatorTest {

    private static Validator validator;

    @BeforeClass
    public static void setUpValidator() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void shouldValidateOrderCaseA() {
        OrderDto order = new OrderDto();
        order.setComment("S");
        Set<ConstraintViolation<OrderDto>> constraintViolations = validator.validate(order, OrderCaseA.class);
        assertThat("Order is not valid", constraintViolations.isEmpty(), is(false));
        System.out.println(constraintViolations);
    }

    @Test
    public void shouldValidateOrderCaseB() {
        OrderDto order = new OrderDto();
        order.setComment("Sdfjdhfjdj");
        Set<ConstraintViolation<OrderDto>> constraintViolations = validator.validate(order, OrderCaseB.class);
        assertThat("Order is not valid", constraintViolations.isEmpty(), is(false));
        System.out.println(constraintViolations);
    }
}