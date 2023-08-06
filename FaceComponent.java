import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class FaceComponent extends JComponent {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        int radius = Math.min(width, height) / 4;
        int centerX = width / 2;
        int centerY = height / 2;

        g.setColor(Color.YELLOW);
        g.fillOval(centerX - radius, centerY - radius, radius * 2, radius * 2);

        int eyeRadius = radius / 8;
        int eyeOffsetX = radius / 3;
        int eyeOffsetY = radius / 3;

        g.setColor(Color.BLACK);
        g.fillOval(centerX - eyeOffsetX - eyeRadius, centerY - eyeOffsetY - eyeRadius, eyeRadius * 2, eyeRadius * 2);
        g.fillOval(centerX + eyeOffsetX - eyeRadius, centerY - eyeOffsetY - eyeRadius, eyeRadius * 2, eyeRadius * 2);

        int noseWidth = radius / 5;
        int noseHeight = radius / 5;

        g.setColor(Color.BLACK);
        g.fillRect(centerX - noseWidth / 2, centerY - noseHeight / 2, noseWidth, noseHeight);
    }
}
