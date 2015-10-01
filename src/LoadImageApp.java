import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import java.util.Random;


import javax.imageio.*;
import javax.swing.*;
 
/**
 * This class demonstrates how to load an Image from an external file
 */

public class LoadImageApp extends Component {
	
    BufferedImage img1;
    BufferedImage img2;
    BufferedImage img3;
    static int[] n = new int[]{0,0,0,1,1,7};
	static int[] m = new int[]{0,0,0,1,1,7};
	static int[] k = new int[]{0,0,0,1,1,7};
	 
 
    public void paint(Graphics g) {
    	
    
		
    	
		       
		 
			Random n1 = new Random(); 
			Random m1 = new Random();
			Random k1 = new Random();
			int a = n[n1.nextInt(6)];
			int b = m[m1.nextInt(6)];
			int c = k[k1.nextInt(6)];
			
		System.out.println(a+" "+b+" "+c);
    	if(a == 0){
        g.drawImage(img1,0,0, null);}
    	
    	else if(a == 1){
        g.drawImage(img2,0,0, null);
        }
        else if(a == 7){
        g.drawImage(img3,0,0, null);
        }
    	if(b == 0){
            g.drawImage(img1,300,0, null);}
        	
        	else if(b == 1){
            g.drawImage(img2,300,0, null);
            }
            else if(b == 7){
            g.drawImage(img3,300,0, null);
            }
    	if(c == 0){
            g.drawImage(img1,600,0, null);}
        	
        	else if(c == 1){
            g.drawImage(img2,600,0, null);
            }
            else if(c == 7){
            g.drawImage(img3,600,0, null);
            }
        
      
    }
    
 
    public LoadImageApp() {
       try {
    	   img1 = ImageIO.read(new File("Star1.jpg"));
    	   img2 = ImageIO.read(new File("Heart1.jpg"));
    	   img3 = ImageIO.read(new File("Seven1.jpg"));
    	   
           
       } catch (IOException e) {
       }
 
    }
 
    public Dimension getPreferredSize() {
        if (img1 == null||img2 == null||img3 == null ) {
             return new Dimension(300,300);
        } else {
 
           return new Dimension(900,500);
       }
    }
 
    public static void main(String[] args) {
    	
    	JFrame f = new JFrame("Casino");
    	 f.addWindowListener(new WindowAdapter(){
	            public void windowClosing(WindowEvent e) {
	                System.exit(0);
	            }
	        });
        f.add(new LoadImageApp());
        f.pack();
        f.setVisible(true);
    }
}