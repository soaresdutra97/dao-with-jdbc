package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import db.DB;
import db.DbIntegrityException;
import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDAO;

public class Program {

	public static void main(String[] args) {


		SellerDAO sellerDAO = DaoFactory.createSellerDao();

		Seller seller = sellerDAO.findById(3);

		System.out.println(seller);

	}
}
