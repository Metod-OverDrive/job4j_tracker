package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenRight() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"4"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(4);
    }

    @Test
    public void whenRight2Times() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"4", "5"}
        );
        int[] excepted = {4, 5};
        ValidateInput input = new ValidateInput(out, in);
        int[] selected = new int[2];
        selected[0] = input.askInt("Enter menu:");
        selected[1] = input.askInt("Enter menu:");
        assertThat(selected).containsExactly(excepted);
    }

    @Test
    public void whenNegativeNumber() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);
    }
}