package sparta.hang_hae_market.dto;

import lombok.Getter;
import sparta.hang_hae_market.entity.Item;

@Getter
public class ItemResDto {
    private int id;
    private String userName;
    private String title;
    private String content;
    private int price;

    public ItemResDto(Item saveItem) {
        this.id = saveItem.getId();
        this.userName = saveItem.getUsername();
        this.title = saveItem.getTitle();
        this.content = saveItem.getContent();
        this.price = saveItem.getPrice();
    }
}
