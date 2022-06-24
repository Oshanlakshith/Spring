package lk.ijse.spring.Controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.service.ItemService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("item")
@CrossOrigin
public class ItemControler {

    @Autowired
    ItemService itemService;

    @PostMapping
    public ResponseUtil saveItem(ItemDTO item) {
        itemService.saveItem(item);
        return new ResponseUtil(200, "Save", null);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllItem(ItemDTO item){
        return new ResponseUtil(200,"OK",itemService.getAlItems());
    }
}
