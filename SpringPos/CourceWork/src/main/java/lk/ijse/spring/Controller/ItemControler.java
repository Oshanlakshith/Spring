package lk.ijse.spring.Controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.service.ItemService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("item")
@CrossOrigin
public class ItemControler {

    @Autowired
    ItemService itemService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllItem() {
        return new ResponseUtil(200, "OK", itemService.getAllItems());
    }

    @ResponseStatus(HttpStatus.CREATED) //201
    @PostMapping
    public ResponseUtil saveItem(@ModelAttribute ItemDTO item) {
        itemService.saveItem(item);
        return new ResponseUtil(200, "Save", null);
    }


    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateItem(@RequestBody ItemDTO item) {
        itemService.updateItem(item);
        return new ResponseUtil(200, "UPDATE", null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteCustomer(@RequestParam String id) {
        itemService.deleteItem(id);
        return new ResponseUtil(200, "DELETE", null);
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchItem(@PathVariable String id) {
        return new ResponseUtil(200, "SEARCH", itemService.searchItem(id));
    }
}
