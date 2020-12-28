package view;

import model.BathroomFloor;
import model.Product;
import model.Sidewalk;
import model.Tile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {
    Product product;

    JTextField weightField;
    JTextField heightField;
    JTextField costField;

    JLabel weightLabel;
    JLabel heightLabel;
    JLabel costLabel;
    JLabel productCostLabel;
    JLabel productCost;
    JLabel bathroomFloorCheck;
    JLabel sidewalkCheck;

    JButton bathroomFloorButton;
    JButton sidewalkButton;
    JButton addTileButton;

    public MyPanel() {


        weightField = new JTextField("          ");
        weightField.requestFocus(true);

        heightField = new JTextField("          ");
        heightField.requestFocus(true);

        costField = new JTextField("          ");
        costField.requestFocus(true);

        weightLabel = new JLabel("weight");
        heightLabel = new JLabel("height");
        costLabel = new JLabel("cost");
        productCostLabel = new JLabel("product cost: ");
        productCost = new JLabel("0");
        bathroomFloorCheck = new JLabel(" ");
        sidewalkCheck = new JLabel(" ");

        addTileButton = new JButton("add section");
        addTileButton.setVisible(false);
        sidewalkButton = new JButton("sidewalk");
        bathroomFloorButton = new JButton("bathroom floor");



        sidewalkButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                addTileButton.setVisible(true);

                product = new Sidewalk();
                productCost.setText("0");
                sidewalkCheck.setText("*");
                bathroomFloorCheck.setText(" ");
            }
        });

        bathroomFloorButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                addTileButton.setVisible(true);
                product = new BathroomFloor();
                productCost.setText("0");
                sidewalkCheck.setText(" ");
                bathroomFloorCheck.setText("*");
            }
        });

        addTileButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int weight = Integer.parseInt(weightField.getText().trim());
                int height = Integer.parseInt(heightField.getText().trim());
                int cost = Integer.parseInt(costField.getText().trim());
                product.addTile(new Tile(weight, height, cost));
                productCost.setText(Integer.toString(product.getCost()));
            }
        });


        JComponent[][] component = new JComponent[3][3];

        component[0][0] = weightLabel;
        component[1][0] = heightLabel;
        component[2][0] = costLabel;
        component[0][1] = weightField;
        component[1][1] = heightField;
        component[2][1] = costField;
        component[0][2] = bathroomFloorButton;
        component[1][2] = sidewalkButton;
        component[2][2] = addTileButton;

        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;


        for (int i = 0; i < 3; i++) {
            constraints.gridy = i;
            for (int j = 0; j < 3; j++) {
                constraints.gridx = j;
                add(component[i][j], constraints);
            }
        }

        constraints.gridx = 0;
        constraints.gridy = 3;
        add(productCostLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 3;
        add(productCost, constraints);

        constraints.gridx = 3;
        constraints.gridy = 0;
        add(bathroomFloorCheck, constraints);

        constraints.gridx = 3;
        constraints.gridy = 1;
        add(sidewalkCheck, constraints);


    }
}
