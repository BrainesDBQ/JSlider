import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameMAIN extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldH;
	private JTextField textFieldV;
	private JSlider sliderH;

	// JFrame using sliders
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameMAIN frame = new JFrameMAIN();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameMAIN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSlider sliderH = new JSlider();
		sliderH.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				//update Textfield
				JSlider me = (JSlider)e.getSource();
				
				//now update the text field
				textFieldH.setText("" + me.getValue());
				
			}
		});
		sliderH.setPaintTicks(true);
		sliderH.setMajorTickSpacing(10);
		sliderH.setMinorTickSpacing(5);
		sliderH.setBounds(32, 22, 368, 26);
		contentPane.add(sliderH);
		
		JSlider sliderV = new JSlider();
		sliderV.setMinorTickSpacing(5);
		sliderV.setMajorTickSpacing(20);
		sliderV.setPaintTicks(true);
		sliderV.setOrientation(SwingConstants.VERTICAL);
		sliderV.setBounds(10, 69, 78, 181);
		contentPane.add(sliderV);
		
		textFieldH = new JTextField();
		textFieldH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Updates Slider to match
				
				JTextField me = (JTextField)e.getSource();
				
				//update slider to match value 
				sliderH.setValue(Integer.parseInt());
				
			}
		});
		textFieldH.setText("50");
		textFieldH.setBounds(362, 55, 38, 20);
		contentPane.add(textFieldH);
		textFieldH.setColumns(10);
		
		textFieldV = new JTextField();
		textFieldV.setText("50");
		textFieldV.setBounds(98, 230, 62, 20);
		contentPane.add(textFieldV);
		textFieldV.setColumns(10);
	}
}
