package app;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class AtomicMassCalculator extends JFrame implements ActionListener {

    static JButton H = new JButton("H");
    static JButton He = new JButton("He");
    static JButton Li = new JButton("Li");
    static JButton Be = new JButton("Be");
    static JButton B = new JButton("B");
    static JButton C = new JButton("C");
    static JButton N = new JButton("N");
    static JButton O = new JButton("O");
    static JButton F = new JButton("F");
    static JButton Ne = new JButton("Ne");
    static JButton Na = new JButton("Na");
    static JButton Mg = new JButton("Mg");
    static JButton Al = new JButton("Al");
    static JButton Si = new JButton("Si");
    static JButton P = new JButton("P");
    static JButton S = new JButton("S");
    static JButton Cl = new JButton("Cl");
    static JButton Ar = new JButton("Ar");
    static JButton K = new JButton("K");
    static JButton Ca = new JButton("Ca");
    static JButton Sc = new JButton("Sc");
    static JButton Ti = new JButton("Ti");
    static JButton V = new JButton("V");
    static JButton Cr = new JButton("Cr");
    static JButton Mn = new JButton("Mn");
    static JButton Fe = new JButton("Fe");
    static JButton Co = new JButton("Co");
    static JButton Ni = new JButton("Ni");
    static JButton Cu = new JButton("Cu");
    static JButton Zn = new JButton("Zn");
    static JButton Ga = new JButton("Ga");
    static JButton Ge = new JButton("Ge");
    static JButton As = new JButton("As");
    static JButton Se = new JButton("Se");
    static JButton Br = new JButton("Br");
    static JButton Kr = new JButton("Kr");
    static JButton Rb = new JButton("Rb");
    static JButton Sr = new JButton("Sr");
    static JButton Y = new JButton("Y");
    static JButton Zr = new JButton("Zr");
    static JButton Nb = new JButton("Nb");
    static JButton Mo = new JButton("Mo");
    static JButton Tc = new JButton("Tc");
    static JButton Ru = new JButton("Ru");
    static JButton Rh = new JButton("Rh");
    static JButton Pd = new JButton("Pd");
    static JButton Ag = new JButton("Ag");
    static JButton Cd = new JButton("Cd");
    static JButton In = new JButton("In");
    static JButton Sn = new JButton("Sn");
    static JButton Sb = new JButton("Sb");
    static JButton Te = new JButton("Te");
    static JButton I = new JButton("I");
    static JButton Xe = new JButton("Xe");
    static JButton Cs = new JButton("Cs");
    static JButton Ba = new JButton("Ba");
    static JButton La = new JButton("La");
    static JButton Ce = new JButton("Ce");
    static JButton Pr = new JButton("Pr");
    static JButton Nd = new JButton("Nd");
    static JButton Pm = new JButton("Pm");
    static JButton Sm = new JButton("Sm");
    static JButton Eu = new JButton("Eu");
    static JButton Gd = new JButton("Gd");
    static JButton Tb = new JButton("Tb");
    static JButton Dy = new JButton("Dy");
    static JButton Ho = new JButton("Ho");
    static JButton Er = new JButton("Er");
    static JButton Tm = new JButton("Tm");
    static JButton Yb = new JButton("Yb");
    static JButton Lu = new JButton("Lu");
    static JButton Hf = new JButton("Hf");
    static JButton Ta = new JButton("Ta");
    static JButton W = new JButton("W");
    static JButton Re = new JButton("Re");
    static JButton Os = new JButton("Os");
    static JButton Ir = new JButton("Ir");
    static JButton Pt = new JButton("Pt");
    static JButton Au = new JButton("Au");
    static JButton Hg = new JButton("Hg");
    static JButton Tl = new JButton("Tl");
    static JButton Pb = new JButton("Pb");
    static JButton Bi = new JButton("Bi");
    static JButton Po = new JButton("Po");
    static JButton At = new JButton("At");
    static JButton Rn = new JButton("Rn");
    static JButton Fr = new JButton("Fr");
    static JButton Ra = new JButton("Ra");
    static JButton Ac = new JButton("Ac");
    static JButton Th = new JButton("Th");
    static JButton Pa = new JButton("Pa");
    static JButton U = new JButton("U");
    static JButton Np = new JButton("Np");
    static JButton Pu = new JButton("Pu");
    static JButton Am = new JButton("Am");
    static JButton Cm = new JButton("Cm");
    static JButton Bk = new JButton("Bk");
    static JButton Cf = new JButton("Cf");
    static JButton Es = new JButton("Es");
    static JButton Fm = new JButton("Fm");
    static JButton Md = new JButton("Md");
    static JButton No = new JButton("No");
    static JButton Lr = new JButton("Lr");
    static JButton Rf = new JButton("Rf");
    static JButton Db = new JButton("Db");
    static JButton Sg = new JButton("Sg");
    static JButton Bh = new JButton("Bh");
    static JButton Hs = new JButton("Hs");
    static JButton Mt = new JButton("Mt");
    static JButton Ds = new JButton("Ds");
    static JButton Rg = new JButton("Rg");
    static JButton Cn = new JButton("Cn");
    static JButton Nh = new JButton("Nh");
    static JButton Fl = new JButton("Fl");
    static JButton Mc = new JButton("Mc");
    static JButton Lv = new JButton("Lv");
    static JButton Ts = new JButton("Ts");
    static JButton Og = new JButton("Og");

    static JButton abdf = new JButton();
    static JButton dsf = new JButton();
    static JButton hfdabdf = new JButton();
    static JButton asf = new JButton();
    static JButton dfh = new JButton();
    static JButton asdgf = new JButton();
    static JButton egds = new JButton();
    static JButton clear = new JButton("CE");
    static JButton aDXzbdf = new JButton();
    static JButton SDF = new JButton();
    static JButton adfbbdf = new JButton();
    static JButton absdfdf = new JButton();
    static JButton asfdabdf = new JButton();
    static JButton absdfddf = new JButton();
    static JButton abcvxcvdf = new JButton();
    static JButton abadfsdf = new JButton();

    static JButton abgbcvdf = new JButton();
    static JButton asfsdbdf = new JButton();
    static JButton abgbgdf = new JButton();
    static JButton absfsddf = new JButton();
    static JButton abfgbfdf = new JButton();
    static JButton abesdseddf = new JButton();
    static JButton aefsbdf = new JButton();
    static JButton abgfbgfdf = new JButton();
    static JButton abefsedf = new JButton();
    static JButton abgdfdf = new JButton();

    static JButton abdsfsddf = new JButton();
    static JButton abcvxvdf = new JButton();
    static JButton abergvdf = new JButton();
    static JButton abwesddf = new JButton();
    static JButton abewdfvdf = new JButton();
    static JButton abhdsgdf = new JButton();
    static JButton abhvcgdf = new JButton();
    static JButton abhasgdf = new JButton();
    static JButton abcsahgdf = new JButton();
    static JButton abhsdgdf = new JButton();

    static JButton abesrgvdf = new JButton();
    static JButton abwessddf = new JButton();
    static JButton abaewdfvdf = new JButton();
    static JButton abhdsgadf = new JButton();
    static JButton abhvacgdf = new JButton();
    static JButton abshasgdf = new JButton();
    static JButton abscsahgdf = new JButton();
    static JButton abhsdfgdf = new JButton();
    String text;
    JTextField displayText;
    static ArrayList<JButton> elements = new ArrayList<JButton>();
    static ArrayList<Double> addends = new ArrayList<Double>();
    static double[] mass = { 1.01, 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4.00,
        6.94, 9.01,0,0,0,0,0,0,0,0,0,0, 10.81, 12.01, 14.01, 16.00, 19.00, 20.18,
        22.99,24.31,0,0,0,0,0,0,0,0,0,0,26.98, 28.09 ,30.97, 32.07 ,35.45 ,39.95,
        39.10,40.08, 44.96, 47.88, 50.94, 52.00, 54.94, 55.85, 58.93, 58.69, 63.55, 65.39, 69.72, 72.59, 74.92, 78.96, 79.90, 83.80,
        85.47, 87.62, 88.91, 91.22, 92.91, 95.94, 98.00, 101.07, 102.91, 106.42, 107.87, 112.41, 114.82, 118.71, 121.75, 127.60, 126.91, 131.29,
        132.91, 137.33,0, 178.49, 180.95, 183.85, 186.21, 190.23, 192.22, 195.08, 196.97, 200.59, 204.38, 207.20, 208.98, 209.00, 210.00, 222.00,
        223.00, 226.00,0, 267.00, 268.00, 271.00, 272.00, 277.00, 276.00, 281.00, 280.00, 277.00, 284.00, 289.00, 288.00, 293.00, 294.00, 294.00,
        0,0, 138.91, 140.12, 140.91, 144.24, 145.00, 150.36, 151.96, 157.25, 158.93, 162.50, 164.93, 167.26, 168.93, 173.04, 174.97, 0,
        0,0, 227.00, 232.04, 231.04, 238.03, 237.00, 244.00, 243.00, 247.00, 247.00, 251.00, 252.00, 257.00, 258.00, 259.00, 262, 0
    };


    public AtomicMassCalculator() {
        super("Click on the elements you want to add.");
        setSize(970, 400);
        addElements();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel buttons = new JPanel();
        JPanel textBox = new JPanel();
        displayText = new JTextField(50);
        textBox.add(displayText);
        GridLayout grid = new GridLayout(9, 18);
        buttons.setLayout(grid);
        text = "";
        for (JButton b: elements) {
            buttons.add(b);
            b.addActionListener(this);
        }
        for (int i = 0; i < mass.length; i++)
            if (mass[i] == 0) 
                if (elements.get(i) != clear)
                    elements.get(i).setBackground(Color.black);
            
        
        add("North", textBox);
        add(buttons);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent evt) {
        text = "";
        Object source = evt.getSource();
        for (JButton b: elements) {
            if(b.equals(source) ) {
                double aMass = mass[elements.indexOf(b)];
                if (aMass > 0)
                    addends.add(aMass);
                
            }
        }
        if (clear.equals(source)) {
            addends.clear();
            text = "";
        }

        double sum = 0;
        if (addends.size() > 0) {
        for (int i = 0; i < addends.size() -1; i++ ) {
            text += addends.get(i)+ " + ";
            sum += addends.get(i);
        }
        sum += addends.get(addends.size()-1);
        text += addends.get(addends.size()-1) + " = " + String.format("%.3f", sum);
        }

        displayText.setText(text);
    }

    public static void main(String[] args) throws Exception {
        AtomicMassCalculator calc = new AtomicMassCalculator();
    }

    public static void addElements() {
        elements.add(H);
        elements.add(abdf);
        elements.add(hfdabdf);
        elements.add(asf);
        elements.add(dfh);
        elements.add(asdgf);
        elements.add(egds);
        elements.add(clear);
        elements.add(aDXzbdf);
        elements.add(SDF);
        elements.add(adfbbdf);
        elements.add(absdfdf);
        elements.add(asfdabdf);
        elements.add(absdfddf);
        elements.add(abcvxcvdf);
        elements.add(abadfsdf);
        elements.add(dsf);
        elements.add(He);
        elements.add(Li);
        elements.add(Be);
        elements.add(abgbcvdf);
        elements.add(asfsdbdf);
        elements.add(abgbgdf);
        elements.add(absfsddf);
        elements.add(abfgbfdf);
        elements.add(abesdseddf);
        elements.add(aefsbdf);
        elements.add(abgfbgfdf);
        elements.add(abefsedf);
        elements.add(abgdfdf);
        elements.add(B);
        elements.add(C);
        elements.add(N);
        elements.add(O);
        elements.add(F);
        elements.add(Ne);
        elements.add(Na);
        elements.add(Mg);
        elements.add(abdsfsddf);
        elements.add(abcvxvdf);
        elements.add(abergvdf);
        elements.add(abwesddf);
        elements.add(abewdfvdf);
        elements.add(abhvcgdf);
        elements.add(abhasgdf);
        elements.add(abcsahgdf);
        elements.add(abhsdgdf);
        elements.add(abhdsgdf);
        elements.add(Al);
        elements.add(Si);
        elements.add(P);
        elements.add(S);
        elements.add(Cl);
        elements.add(Ar);
        elements.add(K);
        elements.add(Ca);
        elements.add(Sc);
        elements.add(Ti);
        elements.add(V);
        elements.add(Cr);
        elements.add(Mn);
        elements.add(Fe);
        elements.add(Co);
        elements.add(Ni);
        elements.add(Cu);
        elements.add(Zn);
        elements.add(Ga);
        elements.add(Ge);
        elements.add(As);
        elements.add(Se);
        elements.add(Br);
        elements.add(Kr);
        elements.add(Rb);
        elements.add(Sr);
        elements.add(Y);
        elements.add(Zr);
        elements.add(Nb);
        elements.add(Mo);
        elements.add(Tc);
        elements.add(Ru);
        elements.add(Rh);
        elements.add(Pd);
        elements.add(Ag);
        elements.add(Cd);
        elements.add(In);
        elements.add(Sn);
        elements.add(Sb);
        elements.add(Te);
        elements.add(I);
        elements.add(Xe);
        elements.add(Cs);
        elements.add(Ba);
        elements.add(abhsdfgdf);

        elements.add(Hf);
        elements.add(Ta);
        elements.add(W);
        elements.add(Re);
        elements.add(Os);
        elements.add(Ir);
        elements.add(Pt);
        elements.add(Au);
        elements.add(Hg);
        elements.add(Tl);
        elements.add(Pb);
        elements.add(Bi);
        elements.add(Po);
        elements.add(At);
        elements.add(Rn);
        elements.add(Fr);
        elements.add(Ra);
        elements.add(abscsahgdf);

        elements.add(Rf);
        elements.add(Db);
        elements.add(Sg);
        elements.add(Bh);
        elements.add(Hs);
        elements.add(Mt);
        elements.add(Ds);
        elements.add(Rg);
        elements.add(Cn);
        elements.add(Nh);
        elements.add(Fl);
        elements.add(Mc);
        elements.add(Lv);
        elements.add(Ts);
        elements.add(Og);

        elements.add(abesrgvdf);
        elements.add(abwessddf);

        elements.add(La);
        elements.add(Ce);
        elements.add(Pr);
        elements.add(Nd);
        elements.add(Pm);
        elements.add(Sm);
        elements.add(Eu);
        elements.add(Gd);
        elements.add(Tb);
        elements.add(Dy);
        elements.add(Ho);
        elements.add(Er);
        elements.add(Tm);
        elements.add(Yb);
        elements.add(Lu);

        elements.add(abhvacgdf);
        elements.add(abshasgdf);
        elements.add(abhdsgadf);

        elements.add(Ac);
        elements.add(Th);
        elements.add(Pa);
        elements.add(U);
        elements.add(Np);
        elements.add(Pu);
        elements.add(Am);
        elements.add(Cm);
        elements.add(Bk);
        elements.add(Cf);
        elements.add(Es);
        elements.add(Fm);
        elements.add(Md);
        elements.add(No);
        elements.add(Lr);
        
        elements.add(abaewdfvdf);


        
        

    }

}