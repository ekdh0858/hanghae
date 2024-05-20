package sparta.hang_hae_market.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sparta.hang_hae_market.dto.ItemListResDto;
import sparta.hang_hae_market.dto.ItemReqDto;
import sparta.hang_hae_market.dto.ItemResDto;
import sparta.hang_hae_market.dto.Message;
import sparta.hang_hae_market.service.ItemService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/post")
public class ItemController {

    final private ItemService itemService;

    @PostMapping
    public ItemResDto post(@RequestBody ItemReqDto item) {
        return itemService.postItem(item);
    }

    @GetMapping
    public List<ItemListResDto> getAll() {
        return itemService.getAllItems();
    }

    @PutMapping(value = "/{id}")
    public ItemResDto update(@PathVariable int id, @RequestBody ItemReqDto req) {
        return itemService.updateItem(id,req);
    }

    @DeleteMapping(value="/{id}")
    public Message delete(@PathVariable int id) {
        return itemService.deleteItem(id);
    }
}
