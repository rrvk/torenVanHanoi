import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Gui {
	 JTextArea textArea = new JTextArea(null, 10 , 10);
     JTextArea textArea2 = new JTextArea(null, 10 , 10);
     JTextArea textArea3 = new JTextArea(null, 10 , 10);
     Controller controller =new Controller(3, 9);
	 public Gui(){
		
		JFrame frame = new JFrame ("Torens van Hanoi"); 
		frame.setPreferredSize( new Dimension(600,250));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		        
        Container contents = frame.getContentPane();

        JButton button1 = new JButton("van 1 naar 2");
        JButton button2 = new JButton("van 1 naar 3");
        JButton button3 = new JButton("van 2 naar 1");
        JButton button4 = new JButton("van 2 naar 3");
        JButton button5 = new JButton("van 3 naar 1");
        JButton button6 = new JButton("van 3 naar 2");
        
        JPanel panelView = new JPanel();

        JPanel buttonView = new JPanel();
        buttonView.setPreferredSize(new Dimension(150,0));
        buttonView.add(button1);
        buttonView.add(button2);
        buttonView.add(button3);
        buttonView.add(button4);
        buttonView.add(button5);
        buttonView.add(button6);
        panelView.add(textArea);
        panelView.add(textArea2);
        panelView.add(textArea3);
        contents.add(buttonView, BorderLayout.WEST);
        contents.add(panelView, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        
        button1.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
            	if (controller.getStokjes().get(0).getLaatsteSchijfOpStokje()!=null){
            		if (controller.getStokjes().get(1).setSchijfOpStokje(controller.getStokjes().get(0).getLaatsteSchijfOpStokje())){
            			controller.getStokjes().get(0).delSchijfje();
            			setTekst();
            		}
            	}                
            }
        });
        
        button2.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
            	if (controller.getStokjes().get(0).getLaatsteSchijfOpStokje()!=null){
            		if (controller.getStokjes().get(2).setSchijfOpStokje(controller.getStokjes().get(0).getLaatsteSchijfOpStokje())){
            			controller.getStokjes().get(0).delSchijfje();
            			setTekst();
            		}
            	}  
            }
        });
        
        button3.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
            	if (controller.getStokjes().get(1).getLaatsteSchijfOpStokje()!=null){
            		if (controller.getStokjes().get(0).setSchijfOpStokje(controller.getStokjes().get(1).getLaatsteSchijfOpStokje())){
            			controller.getStokjes().get(1).delSchijfje();
            			setTekst();
            		}
            	}  
            }
        });
        
        button4.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
            	if (controller.getStokjes().get(1).getLaatsteSchijfOpStokje()!=null){
            		if (controller.getStokjes().get(2).setSchijfOpStokje(controller.getStokjes().get(1).getLaatsteSchijfOpStokje())){
            			controller.getStokjes().get(1).delSchijfje();
            			setTekst();
            		}
            	} 
            }
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
            	if (controller.getStokjes().get(2).getLaatsteSchijfOpStokje()!=null){
            		if (controller.getStokjes().get(0).setSchijfOpStokje(controller.getStokjes().get(2).getLaatsteSchijfOpStokje())){
            			controller.getStokjes().get(2).delSchijfje();
            			setTekst();
            		}
            	} 
            }
        });
        button6.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
            	if (controller.getStokjes().get(2).getLaatsteSchijfOpStokje()!=null){
            		if (controller.getStokjes().get(1).setSchijfOpStokje(controller.getStokjes().get(2).getLaatsteSchijfOpStokje())){
            			controller.getStokjes().get(2).delSchijfje();
            			setTekst();
            		}
            	} 
            }
        });
        setTekst();
	}
	 
	 public void setTekst(){
		 textArea.setText(controller.getStokjes().get(0).toString());
		 textArea2.setText(controller.getStokjes().get(1).toString());
		 textArea3.setText(controller.getStokjes().get(2).toString());
	 }
}
