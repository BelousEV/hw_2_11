package sky.pro.hw_2_11.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import sky.pro.hw_2_11.model.Item;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {

    private final List <Item> items = new ArrayList <>();
    public  void add(Item item) {
        items.add(item);
    }

    public List<Item> getItems () {
        return new ArrayList<>(items);
    }
    }









