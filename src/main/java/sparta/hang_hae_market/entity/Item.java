package sparta.hang_hae_market.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sparta.hang_hae_market.dto.ItemReqDto;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String content;
    private int price;
    private String username;


    public Item(ItemReqDto req) {
        this.title = req.getTitle();
        this.content = req.getContent();
        this.price = req.getPrice();
        this.username = req.getUserName();
    }

    public void update(ItemReqDto req) {
        this.title = req.getTitle();
        this.content = req.getContent();
        this.price = req.getPrice();
        this.username = req.getUserName();
    }
}
