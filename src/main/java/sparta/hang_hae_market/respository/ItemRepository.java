package sparta.hang_hae_market.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sparta.hang_hae_market.dto.ItemListResDto;
import sparta.hang_hae_market.dto.ItemResDto;
import sparta.hang_hae_market.entity.Item;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
}
