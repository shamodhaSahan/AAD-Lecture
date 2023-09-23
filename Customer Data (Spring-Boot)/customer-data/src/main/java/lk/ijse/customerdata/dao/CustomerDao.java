package lk.ijse.customerdata.dao;

import lk.ijse.customerdata.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 9/16/2023
 * Time : 2:23 PM
 */
public interface CustomerDao extends JpaRepository<CustomerEntity,String> {
}
