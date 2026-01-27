import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class InventoryManagementSystem extends JFrame {

    ArrayList<String> inventory = new ArrayList<>();
    DefaultListModel<String> listModel = new DefaultListModel<>();
    JList<String> itemList = new JList<>(listModel);

    JTextField itemField = new JTextField(15);

    public InventoryManagementSystem() {
        setTitle("Inventory Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton addButton = new JButton("Add");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");

        add(new JLabel("Item Name:"));
        add(itemField);
        add(addButton);
        add(updateButton);
        add(deleteButton);

        add(new JScrollPane(itemList));

        // Add item
        addButton.addActionListener(e -> {
            String item = itemField.getText();
            if (!item.isEmpty()) {
                inventory.add(item);
                listModel.addElement(item);
                itemField.setText("");
            }
        });

        // Update item
        updateButton.addActionListener(e -> {
            int index = itemList.getSelectedIndex();
            if (index != -1) {
                String newItem = itemField.getText();
                inventory.set(index, newItem);
                listModel.set(index, newItem);
                itemField.setText("");
            }
        });

        // Delete item
        deleteButton.addActionListener(e -> {
            int index = itemList.getSelectedIndex();
            if (index != -1) {
                inventory.remove(index);
                listModel.remove(index);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new InventoryManagementSystem();
    }
}
