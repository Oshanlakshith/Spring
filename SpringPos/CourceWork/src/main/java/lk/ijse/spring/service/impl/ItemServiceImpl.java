package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.service.ItemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveItem(ItemDTO dto) {
        if (repo.existsById(dto.getIcode())) {
            repo.save(mapper.map(dto, Item.class));
        }else {
            throw new RuntimeException("Item Alredy Exists...!");
        }
    }
    @Override
    public List<CustomerDTO> getAlItems() {
        return mapper.map(repo.findAll(), new TypeToken<List<ItemDTO>>() {
        }.getType());
    }

    @Override
    public void updateItem(ItemDTO dto) {

    }

    @Override
    public void deleteItem(String id) {

    }

    @Override
    public CustomerDTO searchItem(String id) {
        return null;
    }


}
