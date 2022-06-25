package lk.ijse.spring.service;

import lk.ijse.spring.dto.ItemDTO;

import java.util.List;

public interface ItemService {
    public void saveItem(ItemDTO dto);

    public void updateItem(ItemDTO dto);

    public void deleteItem(String id);

    ItemDTO searchItem(String id);

    List<ItemDTO> getAllItems();
}
