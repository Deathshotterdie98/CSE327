package DxBall;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		 JFrame obj= new JFrame();
		  Gameplay GamePlay= new Gameplay ();
	      obj.setBounds(10,10,700,600);
	      obj.setTitle(" Dx Ball Game ");
	      obj.setResizable( false );
	      obj.setVisible ( true );
	      obj.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
	      obj.add(GamePlay);

	}

}
