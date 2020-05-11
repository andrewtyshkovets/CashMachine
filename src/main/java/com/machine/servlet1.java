package com.machine;

import com.machine.DAO.*;
import com.machine.DAOImplementation.*;
import com.machine.models.bill.Bill;
import com.machine.models.cashbox.CashBox;
import com.machine.models.product.Product;
import com.machine.models.report.Report;
import com.machine.models.user.User;
import com.machine.service.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@WebServlet("/addProduct")
public class servlet1 extends HttpServlet {

    @Override
    public void init() throws ServletException {
/*
        UserDAO<User> userDAOImplementation = UserDAOImplementation.getInstance();
        System.out.println(userDAOImplementation.getAll());
*/
        //BillDAO<Bill> billBillDAO = BillDAOImplementation.getInstance();
        //System.out.println(billBillDAO.getById(7L));
        //System.out.println(CashBoxService.openCashBoxSession(1,1L,2500.0));
        //BillService.cancelBill(7L);
        //CashBoxService.closeCashBoxSession(8L);
        //ProductServise.addProductToWarehouse(1234,"cola",5.0,null,15.0);
        //ProductServise.addProductToWarehouse(2222,"sugar",null,100.00,34.0);
        /*
        long session = CashBoxService.openCashBoxSession(2,4L,3000.0);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long bill = BillService.openBill(4L,(int)session);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BillService.addProductToBillByCode(bill,1234,3.0);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BillService.addProductToBillByName(bill,"sugar",30.0);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BillService.closeBill(bill);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ReportService.makeXReport(session);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        CashBoxService.closeCashBoxSession(session);

         */
       // BillService.cancelBill(11L);
        //ProductServise.setProductAmountOnWarehouseByCode(1234,10.0);
        //ProductServise.setProductAmountOnWarehouseByName("sugar",50.0);
        User user = UserService.findUser("andrew","password");
        System.out.println(user.getRole());
    }
}