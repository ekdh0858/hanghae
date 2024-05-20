package sparta.hang_hae_market.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sparta.hang_hae_market.dto.ItemListResDto;
import sparta.hang_hae_market.dto.ItemReqDto;
import sparta.hang_hae_market.dto.ItemResDto;
import sparta.hang_hae_market.dto.Message;
import sparta.hang_hae_market.entity.Item;
import sparta.hang_hae_market.respository.ItemRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {
    final private ItemRepository itemRepository;

    public ItemResDto postItem(ItemReqDto req) {
        Item item = new Item(req);
        Item saveItem = itemRepository.save(item);
        return new ItemResDto(saveItem);
    }

    public List<ItemListResDto> getAllItems() {
        return itemRepository.findAll().stream().map(ItemListResDto::new).toList();
    }

    @Transactional
    public ItemResDto updateItem(int id, ItemReqDto req) {
        Item item = findItemById(id);
        item.update(req);
        return new ItemResDto(item);
    }

    public Message deleteItem(int id) {
        Item item = findItemById(id);
        itemRepository.delete(item);
        return new Message("삭제완료");
    }

    private Item findItemById(int id) {
        return itemRepository.findById(id).orElseThrow(()->
                new IllegalArgumentException("판매 게시글이 없습니다.")
        );
    }
}
