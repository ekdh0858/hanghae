package sparta.hang_hae_market.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class ItemReqDto {
    @JsonProperty(value = "username")
    private String userName;
    private String title;
    private String content;
    private int price;
}
