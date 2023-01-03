// Refactored version by Marco Hutter (javagl)
package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class RefactoredAtomicMassCalculator
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                createAndShowGui();
            }
        });
    }

    private static void createAndShowGui()
    {
        JFrame f = new JFrame("Click on the elements you want to add.");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new RefactoredAtomicMassCalculatorPanel());
        f.setSize(970, 400);
        f.setLocationRelativeTo(f);
        f.setVisible(true);
    }
}

class RefactoredAtomicMassCalculatorPanel extends JPanel
{
    private JTextField textField;
    private final List<Double> addends = new ArrayList<Double>();

    public RefactoredAtomicMassCalculatorPanel()
    {
        super(new BorderLayout());

        JPanel controlPanel = createControlPanel();
        add(controlPanel, BorderLayout.NORTH);

        JPanel buttonsPanel = createButtonsPanel();
        add(buttonsPanel, BorderLayout.CENTER);
    }

    private JPanel createControlPanel()
    {
        JPanel controlPanel = new JPanel(new BorderLayout());
        JButton clearButton = createClearButton();
        controlPanel.add(clearButton, BorderLayout.WEST);
        textField = new JTextField(50);
        controlPanel.add(textField, BorderLayout.CENTER);
        return controlPanel;
    }

    private JButton createClearButton()
    {
        JButton button = new JButton("CE");
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                addends.clear();
                updateText();
            }
        });
        return button;
    }

    private JPanel createButtonsPanel()
    {
        JPanel buttonsPanel = new JPanel(new GridLayout(9, 18));
        double[] masses =
        { 1.01, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4.00, 6.94,
            9.01, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10.81, 12.01, 14.01, 16.00,
            19.00, 20.18, 22.99, 24.31, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 26.98,
            28.09, 30.97, 32.07, 35.45, 39.95, 39.10, 40.08, 44.96, 47.88,
            50.94, 52.00, 54.94, 55.85, 58.93, 58.69, 63.55, 65.39, 69.72,
            72.59, 74.92, 78.96, 79.90, 83.80, 85.47, 87.62, 88.91, 91.22,
            92.91, 95.94, 98.00, 101.07, 102.91, 106.42, 107.87, 112.41, 114.82,
            118.71, 121.75, 127.60, 126.91, 131.29, 132.91, 137.33, 0, 178.49,
            180.95, 183.85, 186.21, 190.23, 192.22, 195.08, 196.97, 200.59,
            204.38, 207.20, 208.98, 209.00, 210.00, 222.00, 223.00, 226.00, 0,
            267.00, 268.00, 271.00, 272.00, 277.00, 276.00, 281.00, 280.00,
            277.00, 284.00, 289.00, 288.00, 293.00, 294.00, 294.00, 0, 0,
            138.91, 140.12, 140.91, 144.24, 145.00, 150.36, 151.96, 157.25,
            158.93, 162.50, 164.93, 167.26, 168.93, 173.04, 174.97, 0, 0, 0,
            227.00, 232.04, 231.04, 238.03, 237.00, 244.00, 243.00, 247.00,
            247.00, 251.00, 252.00, 257.00, 258.00, 259.00, 262, 0 };
        String names[] =
        { "H", null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, "He", "Li", "Be", null, null, null,
            null, null, null, null, null, null, null, "B", "C", "N", "O", "F",
            "Ne", "Na", "Mg", null, null, null, null, null, null, null, null,
            null, null, "Al", "Si", "P", "S", "Cl", "Ar", "K", "Ca", "Sc", "Ti",
            "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As",
            "Se", "Br", "Kr", "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru",
            "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs",
            "Ba", null, "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg",
            "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", null, "Rf", "Db",
            "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Nh", "Fl", "Mc", "Lv",
            "Ts", "Og", null, null, "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu",
            "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", null, null, null,
            "Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es",
            "Fm", "Md", "No", "Lr", null };
        for (int i = 0; i < masses.length; i++)
        {
            if (names[i] != null)
            {
                String name = names[i];
                double mass = masses[i];
                JButton button = createButton(name, mass);
                buttonsPanel.add(button);
            }
            else
            {
                JLabel label = new JLabel();
                label.setOpaque(true);
                label.setBackground(Color.BLACK);
                buttonsPanel.add(label);
            }
        }
        return buttonsPanel;
    }

    private JButton createButton(String name, double mass)
    {
        JButton button = new JButton(name);
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                addends.add(mass);
                updateText();
            }
        });
        return button;
    }

    private void updateText()
    {
        if (addends.isEmpty())
        {
            textField.setText("");
            return;
        }
        String text = "";
        double sum = 0;
        for (int i = 0; i < addends.size(); i++)
        {
            if (i > 0)
            {
                text += " + ";
            }
            double addend = addends.get(i);
            text += addend;
            sum += addend;
        }
        text += " = " + String.format(Locale.ENGLISH, "%.3f", sum);
        textField.setText(text);
    }

}