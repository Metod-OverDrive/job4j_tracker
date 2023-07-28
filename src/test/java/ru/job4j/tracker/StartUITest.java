package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.action.*;

import static org.assertj.core.api.Assertions.assertThat;

public class StartUITest {
    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ExitAction()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName()).isEqualTo("Item name");
    }

    @Test
    public void whenEditItem() {
        Input in = new StubInput(new String[] {"0", "Test", "1", "1", "Edit test", "2"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
          new CreateAction(),
          new EditAction(),
          new ExitAction()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(1).getName()).isEqualTo("Edit test");
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[] {"0", "1", "1"}
        );
        UserAction[] actions = {
                new DeleteAction(),
                new ExitAction()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId())).isNull();
    }
}