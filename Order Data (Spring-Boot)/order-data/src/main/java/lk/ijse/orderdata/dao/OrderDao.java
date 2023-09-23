package lk.ijse.orderdata.dao;

import lk.ijse.orderdata.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 9/16/2023
 * Time : 2:23 PM
 */
public interface OrderDao extends CrudRepository<OrderEntity,String> {
}
