import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShoppingCart extends JFrame{

	public ShoppingCart(){
		setTitle("Shopping Cart");

		setSize(500, 500);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		String[] data = {"Hello", "there", "world"};
		JList<String> shop = new JList<String>(data);
		JList<String> cart = new JList<String>(data);
		JPanel buttons = new JPanel();
		JButton add = new JButton("Add to cart >");
		JButton remove = new JButton("< Remove from cart");
		buttons.add(add, BorderLayout.NORTH);
		buttons.add(remove, BorderLayout.SOUTH);

		add(shop, BorderLayout.WEST);
		add(buttons, BorderLayout.CENTER);
		add(cart, BorderLayout.EAST);

		setVisible(true);
	}

	public static void main(String [] args){
		new ShoppingCart();
	}


}