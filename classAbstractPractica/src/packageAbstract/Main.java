package packageAbstract;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo circle1 = new Circulo();
		
		circle1.setRadioCirculo(10);
		float area = circle1.area();
		JOptionPane.showMessageDialog(null,"Area del Circulo es: "+ area);
	}

}
