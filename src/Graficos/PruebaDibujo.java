package Graficos;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		MarcoConDibujos mimarco=new MarcoConDibujos();		
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
//CREACION DE LA VENTANA O FRAME

class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos() {
		
		setTitle("Gráficas 2D");
		setSize(380,300);
		setResizable (false);
		
		Graficos dibujos=new Graficos();
		add(dibujos);	
	}
}

//CREACION DEL PANEL O LAMINA

class Graficos extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g; //CONVIERTE EL OBJETO DE TIPO GRAPHICS A GRAPHICS 2D
			
		String dato = JOptionPane.showInputDialog("Digite el número correspondiente a la opción de gráficos que desee:\n"
				+ "1. Lineas \n"
				+ "2. Circulos \n"
				+ "3. Polígonos \n"
				+ "4. Imágenes acopladas");
		int opcion = Integer.parseInt(dato);
		
		if (opcion == 1){
			
			g2.drawString("Líneas", 20, 20);
			g2.draw(new Line2D.Double(100, 100, 100, 200));
			g2.draw(new Line2D.Double(200, 100, 200, 200));
			g2.draw(new Line2D.Double(100, 100, 200, 100));
			g2.draw(new Line2D.Double(100, 200, 200, 200));
			
			g2.draw(new Line2D.Double(150, 50, 150, 150));
			g2.draw(new Line2D.Double(250, 50, 250, 150));
			g2.draw(new Line2D.Double(150, 50, 250, 50));
			g2.draw(new Line2D.Double(150, 150, 250, 150));
			
			g2.draw(new Line2D.Double(100, 100, 150, 50));
			g2.draw(new Line2D.Double(200, 100, 250, 50));
			g2.draw(new Line2D.Double(100, 200, 150, 150));
			g2.draw(new Line2D.Double(200, 200, 250, 150));
		}
		
		if (opcion == 2) {
			g2.drawString("Círculos", 20, 20);
			//CIRCULO DEL CUERPO
			Stroke punta = new BasicStroke (2.0f);
			g2.setStroke(punta);
			g2.setColor(Color.red);
			g2.fill(new Ellipse2D.Double(100, 60, 180, 180));
			g2.setColor(Color.black);
			g2.draw(new Ellipse2D.Double(100, 60, 180, 180));
			g2.fill(new Ellipse2D.Double(160, 120, 60, 60));
			g2.draw(new Line2D.Double(190, 240, 190, 100));
			
			//CIRCULO DE LOS OJOS
			g2.setColor(Color.BLACK);
			g2.fill(new Ellipse2D.Double(165, 37, 25, 25));
			g2.fill(new Ellipse2D.Double(190, 37, 25, 25));			
					
			g2.setColor(Color.WHITE);
			g2.fill(new Ellipse2D.Double(177, 40, 8, 8));
			g2.fill(new Ellipse2D.Double(195, 40, 8, 8));
			//g2.draw(new Rectangle2D.Double(0, 0, 100, 60));
			//g2.draw(new Rectangle2D.Double(280, 0, 100, 60));	
			
			//PATAS
			g2.setColor(Color.BLACK);
			g2.draw(new Line2D.Double(115, 100, 80, 70));
			g2.draw(new Line2D.Double(80, 70, 50, 80));
			
			g2.draw(new Line2D.Double(102, 130, 60, 115));
			g2.draw(new Line2D.Double(60, 115, 35, 135));
			
			g2.draw(new Line2D.Double(105, 185, 80, 205));
			g2.draw(new Line2D.Double(80, 205, 80, 250));
			
			g2.draw(new Line2D.Double(265, 100, 300, 70));
			g2.draw(new Line2D.Double(300, 70, 295,35));
			
			g2.draw(new Line2D.Double(278, 130, 320, 125));
			g2.draw(new Line2D.Double(320, 125, 340, 150));
			
			g2.draw(new Line2D.Double(275, 185, 300, 195));
			g2.draw(new Line2D.Double(300, 195, 320, 220));
			
			//CIRCULOS DE LAS PATAS
			g2.setColor(Color.orange);
			g2.fill(new Ellipse2D.Double(310, 210, 18, 18));
			g2.fill(new Ellipse2D.Double(70, 240, 18, 18));
			g2.setColor(Color.green);
			g2.fill(new Ellipse2D.Double(330, 140, 18, 18));
			g2.fill(new Ellipse2D.Double(25, 125, 18, 18));
			g2.setColor(Color.blue);
			g2.fill(new Ellipse2D.Double(285, 25, 18, 18));
			g2.fill(new Ellipse2D.Double(40, 70, 18, 18));
			g2.setColor(Color.BLACK);
			g2.draw(new Ellipse2D.Double(310, 210, 18, 18));
			g2.draw(new Ellipse2D.Double(70, 240, 18, 18));
			g2.draw(new Ellipse2D.Double(330, 140, 18, 18));
			g2.draw(new Ellipse2D.Double(25, 125, 18, 18));
			g2.draw(new Ellipse2D.Double(285, 25, 18, 18));
			g2.draw(new Ellipse2D.Double(40, 70, 18, 18));
			
			//CIRCULOS AMARILLOS DENTRO DEL CUERPO
			g2.setColor(Color.yellow);
			g2.fill(new Ellipse2D.Double(135, 95, 20, 20));
			g2.fill(new Ellipse2D.Double(115, 140, 20, 20));
			g2.fill(new Ellipse2D.Double(135, 185, 20, 20));			
			g2.fill(new Ellipse2D.Double(225, 95, 20, 20));
			g2.fill(new Ellipse2D.Double(245, 140, 20, 20));
			g2.fill(new Ellipse2D.Double(225, 185, 20, 20));
			
			g2.setColor(Color.black);
			g2.draw(new Ellipse2D.Double(135, 95, 20, 20));
			g2.draw(new Ellipse2D.Double(115, 140, 20, 20));
			g2.draw(new Ellipse2D.Double(135, 185, 20, 20));			
			g2.draw(new Ellipse2D.Double(225, 95, 20, 20));
			g2.draw(new Ellipse2D.Double(245, 140, 20, 20));
			g2.draw(new Ellipse2D.Double(225, 185, 20, 20));
			//CURVAS DE LA SONRISA
			g2.setColor(Color.black);
			QuadCurve2D q = new QuadCurve2D.Float ();
			q.setCurve (170, 78, 190, 110, 210, 78);
			g2.draw (q);
			q.setCurve (165, 75, 190, 95, 215, 75);
			g2.draw (q);
			g2.draw(new Line2D.Double(168, 72, 162, 78));
			g2.draw(new Line2D.Double(213, 72, 218, 80));
			//ANTENAS
			q.setCurve (177, 37, 180, 13, 157, 17);
			g2.draw (q);
			q.setCurve (202, 37, 199, 13, 222, 17);
			g2.draw (q);
			g2.fill(new Ellipse2D.Double(147, 12, 10, 10));
			g2.fill(new Ellipse2D.Double(222, 12, 10, 10));
		}
		
		if (opcion == 3) {
			
			g2.drawString("Polígonos", 20, 20);
			//CREACION DE COLORES
			Color morado=new Color(150, 110, 215);
			Color azul=new Color(0, 200, 255);
			Color rojo=new Color(225, 50, 100);
			Color naranja=new Color(240, 150, 60);
			Color verde=new Color(140, 240, 90);
			//CUERPO
			g2.setColor(verde);
			int [] x= {170, 210, 225, 190, 155};
			int [] y= {133, 133, 170, 200, 170};
			g.fillPolygon(x, y, x.length);
			//CUELLO
			g2.setColor(morado);
			int [] x1= {170, 210, 210};
			int [] y1= {130, 60, 130};
			g2.fillPolygon(x1, y1, x1.length);
			//CABEZA Y PATAS
			g2.setColor(azul);
			g2.fill(new Rectangle2D.Double(212, 60, 25, 25));
			g2.setColor(naranja);
			g2.fill(new Rectangle2D.Double(186, 203, 8, 39));
			g2.setColor(rojo);
			g2.fill(new Ellipse2D.Double(160, 244, 60, 12));
			//PICO
			g2.setColor(naranja);
			int [] x1p= {239, 255, 239};
			int [] y1p= {65, 85, 85};
			g2.fillPolygon(x1p, y1p, x1p.length);
			//CRESTA 200,30, 212 y 58, 192 y 58
			g2.setColor(rojo);
			int [] x1cc= {205, 237, 192};
			int [] y1cc= {25, 58, 58};
			g2.fillPolygon(x1cc, y1cc, x1cc.length);
			int [] x1c= {225, 237, 212};
			int [] y1c= {85, 112, 112};
			g2.fillPolygon(x1c, y1c, x1c.length);
			//COLA
			g2.setColor(naranja);
			int [] xc1= {115, 167, 152};
			int [] yc1= {133, 133, 168};
			g2.fillPolygon(xc1, yc1, xc1.length);
			g2.setColor(azul);
			int [] xc2= {80, 132, 165, 113};
			int [] yc2= {90, 90, 130, 130};
			g2.fillPolygon(xc2, yc2, xc2.length);
			g2.setColor(verde);
			int [] xc3= {78, 111, 70};
			int [] yc3= {91, 130, 200};
			g2.fillPolygon(xc3, yc3, xc3.length);
		
		}
		
		if (opcion == 4) {
			g2.drawString("Imágenes acopladas", 20, 20);			
			//RUEDAS
			g2.draw(new Ellipse2D.Double(120, 180, 50, 50));
			g2.draw(new Ellipse2D.Double(205, 180, 50, 50));
			g2.draw(new Ellipse2D.Double(140, 200, 10, 10));
			g2.draw(new Ellipse2D.Double(225, 200, 10, 10));
			
			//FRENTE
			int [] x2= {255, 270, 290, 255};
			int [] y2= {185, 185, 220, 220};
			g2.drawPolygon(x2, y2, x2.length);
			
			//BASE Y POSTERIOR
			g.drawRect(105, 80, 55, 20);
			g.drawRect(115, 150, 45, 20);
			g.drawRect(100, 195, 155, 20);
			g.drawRect(105, 148, 7, 25);
			g.drawRect(262, 145, 7, 20);
			int [] x2a= {115, 160, 160, 125};
			int [] y2a= {170, 170, 190, 190};
			g2.drawPolygon(x2a, y2a, x2a.length);
			int [] x2b= {110, 157, 157, 130};
			int [] y2b= {100, 100, 150, 150};
			
			//HEXAGONO
			g2.drawPolygon(x2b, y2b, x2b.length);
			int [] x2h= {240, 260, 270, 260, 240, 230};
			int [] y2h= {70, 70, 85, 100, 100, 85};
			g2.drawPolygon(x2h, y2h, x2h.length);
			g.drawRect(243, 100, 14, 30);
			
			//PARTE CENTRAL
			g2.draw(new RoundRectangle2D.Double(160, 125, 20, 65, 20, 20));
			g2.draw(new RoundRectangle2D.Double(180, 125, 20, 65, 20, 20));
			g2.draw(new RoundRectangle2D.Double(200, 125, 20, 65, 20, 20));
			g2.draw(new RoundRectangle2D.Double(220, 125, 20, 65, 20, 20));
			g2.draw(new RoundRectangle2D.Double(240, 125, 20, 65, 20, 20));
		}		
	}
}
