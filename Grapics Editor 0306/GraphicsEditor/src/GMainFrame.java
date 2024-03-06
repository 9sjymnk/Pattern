import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GMainFrame extends Frame {
    public GMainFrame() {
        setLocation(0,0);
    	setSize(400, 600);
        setVisible(true);
    
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); 
            }
        });
    }

    public void paint(Graphics g) {
        g.drawRect(100, 100, 200, 100); // 사각형 그리기 (x, y, w, h) w는 너비 h는 높이
        
        g.drawOval(150, 200, 100, 100); // 타원 그리기 (x, y, w, h) 
        
        int[] xPoints = {0, 100, 100};
        int[] yPoints = {200, 300 ,100};
        int nPoints = 3;
        g.drawPolygon(xPoints, yPoints, nPoints); // 삼각형 그리기
        
        
        // 도형 색칠하기
        g.setColor(Color.BLUE);
        g.fillRect(100, 100, 200, 100);
        
        g.setColor(Color.yellow);
        g.fillOval(150, 200, 100, 100);
        
        g.setColor(Color.RED);
        g.fillPolygon(xPoints, yPoints, nPoints);
        
    }

    public static void main(String[] args) {
        new GMainFrame();
    }
}