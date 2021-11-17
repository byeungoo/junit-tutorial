package junit5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class) // 테스트 클래스가 Mockito 사용할 떄 선언
public class MockingTest {

    @Mock
    private ItemRepository itemRepository;

    private ItemService itemService;

    @BeforeEach
    public void init() {
        itemService = new ItemService(itemRepository);
    }

    @Test
    @DisplayName("단위 테스트 작성법")
    public void unitTest() {

        //given
        Long itemId = 3L;
        given(itemRepository.saveItem())
                .willReturn(itemId);

        //when
        Long resultItemId = itemService.saveItem();

        //then

        Assertions.assertThat(resultItemId).isEqualTo(itemId);
    }

    class ItemRepository {
        public Long saveItem() {
            return 1L;
        }
    }

    class ItemService {

        private ItemRepository itemRepository;

        public ItemService(ItemRepository itemRepository){
            this.itemRepository = itemRepository;
        }

        public Long saveItem() {
            return itemRepository.saveItem();
        }
    }

}
