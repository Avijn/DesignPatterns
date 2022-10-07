import javax.swing.*;
public class HelloWorld2 extends JFrame {//inheriting JFrame
    JFrame f;

    HelloWorld2() {
        JButton b = new JButton("Test");//create button
        b.setBounds(130, 100, 100, 40);

        add(b);//adding button on frame
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
    }
}