package com.example.demo.repositories;

import com.example.demo.domains.TacosOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface OrderRepository extends CrudRepository<TacosOrder, String> {
    List<TacosOrder> findByDeliveryZip(String c);
    List<TacosOrder> readOrdersByDeliveryZipAndPlacedAtBetween(
            String deliveryZip, Date startDate, Date endDate);
}
