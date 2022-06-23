package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Override
    public void saveCustomer(CustomerDTO dto) {

    }

    @Override
    public void updateCustomer(CustomerDTO dto) {

    }

    @Override
    public void deleteCustomer(String id) {

    }

    @Override
    public CustomerDTO searchCustomer(String id) {
        return null;
    }

    @Override
    public List<CustomerDTO> getAllCustomer() {
        return null;
    }
}
