//Fasil Ayenew
//TCSS445 Final Project
//Database for the inventory of an apparel store
import java.awt.EventQueue;
import java.sql.*;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Apparel_db {

	private JFrame frame;
	private JTable table;

	private JTextField sizeText;
	private JTextField colorText;
	private JTextField quantityText;
	private JTextField brandText;
	private JTextField priceText;
	public String name;
	public boolean check = false;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apparel_db window = new Apparel_db();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Apparel_db() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame("Apparel Inventory");
		frame.setBounds(100, 100, 550, 542);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//buttons for each item in inventory
		JButton Shortsbtn = new JButton("Shorts");
		Shortsbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Shortsbtn.setBounds(10, 395, 89, 23);
		frame.getContentPane().add(Shortsbtn);
		
		JButton Shoesbtn = new JButton("Shoes");
		Shoesbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Shoesbtn.setBounds(109, 395, 89, 23);
		frame.getContentPane().add(Shoesbtn);
		
		JButton Tankbtn = new JButton("Tank-tops");
		Tankbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Tankbtn.setBounds(215, 395, 89, 23);
		frame.getContentPane().add(Tankbtn);
		
		JButton Hatsbtn = new JButton("Hats");
		Hatsbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Hatsbtn.setBounds(314, 395, 89, 23);
		frame.getContentPane().add(Hatsbtn);
		
		JButton Jewelbtn = new JButton("Jewelry");
		Jewelbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Jewelbtn.setBounds(420, 395, 89, 23);
		frame.getContentPane().add(Jewelbtn);
		
		JButton Underbtn = new JButton("Underwear");
		Underbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Underbtn.setBounds(10, 429, 89, 23);
		frame.getContentPane().add(Underbtn);
		
		JButton Backpackbtn = new JButton("Backpack");
		Backpackbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Backpackbtn.setBounds(109, 429, 89, 23);
		frame.getContentPane().add(Backpackbtn);
		
		JButton Pursebtn = new JButton("Purses");
		Pursebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Pursebtn.setBounds(215, 429, 89, 23);
		frame.getContentPane().add(Pursebtn);
		
		JButton Suitbtn = new JButton("Suits");
		Suitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Suitbtn.setBounds(314, 429, 89, 23);
		frame.getContentPane().add(Suitbtn);
		
		JButton Sportbtn = new JButton("Sportwear");
		Sportbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Sportbtn.setBounds(420, 429, 89, 23);
		frame.getContentPane().add(Sportbtn);
		
		JButton Swimbtn = new JButton("Swimwear");
		Swimbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Swimbtn.setBounds(10, 463, 89, 23);
		frame.getContentPane().add(Swimbtn);
		
		JButton Sleepbtn = new JButton("Sleepwear");
		Sleepbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Sleepbtn.setBounds(109, 463, 89, 23);
		frame.getContentPane().add(Sleepbtn);
		
		JButton Sweaterbtn = new JButton("Sweaters");
		Sweaterbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Sweaterbtn.setBounds(215, 463, 89, 23);
		frame.getContentPane().add(Sweaterbtn);
		
		JButton Headgearbtn = new JButton("Headgear");
		Headgearbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Headgearbtn.setBounds(314, 463, 89, 23);
		frame.getContentPane().add(Headgearbtn);
		
		JButton Dressbtn = new JButton("Dress");
		Dressbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Dressbtn.setBounds(420, 463, 89, 23);
		frame.getContentPane().add(Dressbtn);
		
		JButton Glovesbtn = new JButton("Gloves");
		Glovesbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Glovesbtn.setBounds(10, 361, 89, 23);
		frame.getContentPane().add(Glovesbtn);
		
		JButton Shirtsbtn = new JButton("Shirts");
		Shirtsbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Shirtsbtn.setBounds(109, 361, 89, 23);
		frame.getContentPane().add(Shirtsbtn);
		
		JButton Pantsbtn = new JButton("Pants");
		Pantsbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Pantsbtn.setBounds(215, 361, 89, 23);
		frame.getContentPane().add(Pantsbtn);
		
		JButton Socksbtn = new JButton("Socks");
		Socksbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Socksbtn.setBounds(314, 361, 89, 23);
		frame.getContentPane().add(Socksbtn);
		
		JButton Jacketsbtn = new JButton("Jackets");
		Jacketsbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Jacketsbtn.setBounds(420, 361, 89, 23);
		frame.getContentPane().add(Jacketsbtn);
		
		//user input for attributes if  items are being added
		sizeText = new JTextField();
		sizeText.setBounds(74, 330, 56, 20);
		frame.getContentPane().add(sizeText);
		sizeText.setColumns(10);
		
		JLabel lblAdd = new JLabel("Stock Item");
		lblAdd.setBounds(10, 333, 66, 14);
		frame.getContentPane().add(lblAdd);
		
		JLabel lblNewLabel = new JLabel("size");
		lblNewLabel.setBounds(74, 317, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		colorText = new JTextField();
		colorText.setBounds(135, 330, 56, 20);
		frame.getContentPane().add(colorText);
		colorText.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("color");
		lblNewLabel_1.setBounds(140, 317, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		quantityText = new JTextField();
		quantityText.setBounds(196, 330, 56, 20);
		frame.getContentPane().add(quantityText);
		quantityText.setColumns(10);
		
		JLabel lblQuantity = new JLabel("quantity");
		lblQuantity.setBounds(201, 317, 46, 14);
		frame.getContentPane().add(lblQuantity);
		
		brandText = new JTextField();
		brandText.setBounds(261, 330, 56, 20);
		frame.getContentPane().add(brandText);
		brandText.setColumns(10);
		
		JLabel lblBrandName = new JLabel("brand name");
		lblBrandName.setBounds(262, 317, 66, 14);
		frame.getContentPane().add(lblBrandName);
		
		priceText = new JTextField();
		priceText.setBounds(329, 330, 56, 20);
		frame.getContentPane().add(priceText);
		priceText.setColumns(10);
		
		JLabel lblPrice = new JLabel("price");
		lblPrice.setBounds(339, 317, 46, 14);
		frame.getContentPane().add(lblPrice);
		
		JButton Addbtn = new JButton("Add");
		Addbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Addbtn.setBounds(391, 329, 56, 21);
		frame.getContentPane().add(Addbtn);
		
		
		/*table_3 = new JTable();
		table_3.setBounds(392, 222, -247, -176);
		frame.getContentPane().add(table_3);
		*/
		
	    //connects to database
		try {
			
			//connection
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Ayenew_Fasil_db");
			
			//Statement
			Statement myStmt = myConn.createStatement();
			
			
			//query, displays information based on what user pressed
			if (Shoesbtn.isSelected()) {
				ResultSet myRs = myStmt.executeQuery("SELECT * FROM SHOES");
				
				//sends query statement to JTable method for viewing
				JTable table = new JTable(buildTableModel(myRs));
				//marks to determine user choices
				check = true;
				name = "SHOES";
			}
			if (Shirtsbtn.isSelected()) {
				ResultSet myRs = myStmt.executeQuery("SELECT * FROM SHIRTS");
				JTable table = new JTable(buildTableModel(myRs));
				check = true;
				name = "SHIRTS";
			}
			if (Pantsbtn.isSelected()) {
				ResultSet myRs = myStmt.executeQuery("SELECT * FROM PANTS");
				JTable table = new JTable(buildTableModel(myRs));
				check = true;
				name = "PANTS";
			}
			if (Socksbtn.isSelected()) {
				ResultSet myRs = myStmt.executeQuery("SELECT * FROM SOCKS");
				JTable table = new JTable(buildTableModel(myRs));
				check = true;
				name = "SOCKS";
			}
			if (Jacketsbtn.isSelected()) {
				ResultSet myRs = myStmt.executeQuery("SELECT * FROM JACKETS");
				JTable table = new JTable(buildTableModel(myRs));
				check = true;
				name = "JACKETS";
			}
			
			if (Shortsbtn.isSelected()) {
				ResultSet myRs = myStmt.executeQuery("SELECT * FROM SHORTS");
				JTable table = new JTable(buildTableModel(myRs));
				check = true;
				name = "SHORTS";
			}
			if (Tankbtn.isSelected()) {
				ResultSet myRs = myStmt.executeQuery("SELECT * FROM TANK_TOPS");
				JTable table = new JTable(buildTableModel(myRs));
				check = true;
				name = "TANK_TOPS";
			}
			if (Hatsbtn.isSelected()) {
				ResultSet myRs = myStmt.executeQuery("SELECT * FROM HATS");
				JTable table = new JTable(buildTableModel(myRs));
				check = true;
				name = "HATS";
			}
			if (Jewelbtn.isSelected()) {
				ResultSet myRs = myStmt.executeQuery("SELECT * FROM JEWELRY");
				JTable table = new JTable(buildTableModel(myRs));
				check = true;
				name = "JEWELRY";
			}
			if (Underbtn.isSelected()) {
				ResultSet myRs = myStmt.executeQuery("SELECT * FROM UNDERWEAR");
				JTable table = new JTable(buildTableModel(myRs));
				check = true;
				name = "UNDERWEAR";
			}
			if (Backpackbtn.isSelected()) {
				ResultSet myRs = myStmt.executeQuery("SELECT * FROM BACKPACKS");
				JTable table = new JTable(buildTableModel(myRs));
				check = true;
				name = "BACKPACKS";
			}
			if (Pursebtn.isSelected()) {
				ResultSet myRs = myStmt.executeQuery("SELECT * FROM PURSES");
				JTable table = new JTable(buildTableModel(myRs));
				check = true;
				name = "PURSES";
			}
			if (Suitbtn.isSelected()) {
				ResultSet myRs = myStmt.executeQuery("SELECT * FROM SUITS");
				JTable table = new JTable(buildTableModel(myRs));
				check = true;
				name = "SUITS";
			}
			if (Sportbtn.isSelected()) {
				ResultSet myRs = myStmt.executeQuery("SELECT * FROM SPORTWEAR");
				JTable table = new JTable(buildTableModel(myRs));
				check = true;
				name = "SPORTWEAR";
			}
			if (Swimbtn.isSelected()) {
				ResultSet myRs = myStmt.executeQuery("SELECT * FROM SWIMWEAR");
				JTable table = new JTable(buildTableModel(myRs));
				check = true;
				name = "SWIMWEAR";
			}
			if (Sleepbtn.isSelected()) {
				ResultSet myRs = myStmt.executeQuery("SELECT * FROM SLEEPWEAR");
				JTable table = new JTable(buildTableModel(myRs));
				check = true;
				name = "SLEEPWEAR";
			}
			if (Sweaterbtn.isSelected()) {
				ResultSet myRs = myStmt.executeQuery("SELECT * FROM SWEATERS");
				JTable table = new JTable(buildTableModel(myRs));
				check = true;
				name = "SWEATERS";
			}
			if (Headgearbtn.isSelected()) {
				ResultSet myRs = myStmt.executeQuery("SELECT * FROM HEADGEAR");
				JTable table = new JTable(buildTableModel(myRs));
				check = true;
				name = "HEADGEAR";
			}
			if (Dressbtn.isSelected()) {
				ResultSet myRs = myStmt.executeQuery("SELECT * FROM DRESS");
				JTable table = new JTable(buildTableModel(myRs));
				check = true;
				name = "DRESS";
			}
			if (Glovesbtn.isSelected()) {
				ResultSet myRs = myStmt.executeQuery("SELECT * FROM GLOVES");
				JTable table = new JTable(buildTableModel(myRs));
				check = true;
				name = "GLOVES";
			}
			
			if (check && (!(sizeText.getText().isEmpty())) && (!(colorText.getText().isEmpty())) &&
					(!(quantityText.getText().isEmpty())) && (!(brandText.getText().isEmpty())) && 
					(!(priceText.getText().isEmpty())) &&
					Addbtn.isSelected()) {
				
				//inserts items to database based on what use chooses/types
				String sql = "INSERT INTO " + name + " VALUES (" + sizeText + colorText +
						quantityText + brandText + '0' + priceText + ")";
				myStmt.executeUpdate(sql);
			}
			
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		   
  
	}
	//Table results
	public static DefaultTableModel buildTableModel(ResultSet rs)
	        throws SQLException {

	    ResultSetMetaData metaData = rs.getMetaData();

	    //column names
	    Vector<String> columnNames = new Vector<String>();
	    int columnCount = metaData.getColumnCount();
	    for (int column = 1; column <= columnCount; column++) {
	        columnNames.add(metaData.getColumnName(column));
	    }

	    //table data
	    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
	    while (rs.next()) {
	        Vector<Object> vector = new Vector<Object>();
	        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
	            vector.add(rs.getObject(columnIndex));
	        }
	        data.add(vector);
	    }

	    return new DefaultTableModel(data, columnNames);

	}
}
