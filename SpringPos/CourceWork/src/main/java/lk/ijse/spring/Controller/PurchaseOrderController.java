package lk.ijse.spring.Controller;

import lk.ijse.spring.dto.OrderDTO;
import lk.ijse.spring.service.PurchaseOrderService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("Order")
@CrossOrigin
public class PurchaseOrderController {

    @Autowired
    PurchaseOrderService poService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllOrders() {
        return new ResponseUtil(200, "Ok", poService.getAllOrders());
    }

    @ResponseStatus(HttpStatus.CREATED) //201
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil purchaseOrder(@RequestBody OrderDTO ordersDTO) {
        System.out.println(ordersDTO.toString());
        poService.purchaseOrder(ordersDTO);
        return new ResponseUtil(200, "Save", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateOrder(@RequestBody OrderDTO ordersDTO) {
        poService.updateOrder(ordersDTO);
        return new ResponseUtil(200, "Updated", null);
    }

    @DeleteMapping(params = {"oid"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteOrder(@RequestParam String oid) {
        poService.deleteOrder(oid);
        return new ResponseUtil(200, "Deleted", null);
    }

    @GetMapping(path = "/{ocid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchOrderCustomer(@PathVariable String ocid) {
        return new ResponseUtil(200, "Ok", poService.searchOrder(ocid));
    }
}
