package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
  public void saveCustomer(CustomerDTO dto);
  public  void updateCustomer(CustomerDTO dto);
  public void deleteCustomer(String id);
  CustomerDTO searchCustomer(String id);
  List<CustomerDTO>getAllCustomer();
}
