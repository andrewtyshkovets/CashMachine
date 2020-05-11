package com.machine.DAO;

import com.machine.DAO.AbstractDAO;

import java.sql.Connection;
import java.util.List;

public interface BillDAO<E> extends AbstractDAO<E> {
    boolean addProductToBill(Long BillId, Long productId,double quantity,double measure,double price);
    boolean ifCancelled(Long key);

    Long create(Connection connection, E entity);
}
