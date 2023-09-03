package lk.ijse.springjpa.repo;


import lk.ijse.springjpa.entity.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 8/3/2023
 * Time : 11:38 PM
 */

public interface CustomerRepo extends CrudRepository<Customer, String> {
}
