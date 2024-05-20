package sparta.hang_hae_market.dto;

import lombok.Getter;
import sparta.hang_hae_market.entity.Item;

@Getter
public class ItemListResDto {
    private int id;
    private String userName;
    private String title;
    private int price;

    public ItemListResDto(Item item) {
        this.id = item.getId();
        this.userName  = item.getUsername();
        this.title = item.getTitle();
        this.price = item.getPrice();
    }
}
