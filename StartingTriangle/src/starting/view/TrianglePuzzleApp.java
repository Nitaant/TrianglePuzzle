package starting.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import starting.controller.MouseHandler;
import starting.controller.ResetController;
import starting.model.Model;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
 
import starting.controller.*;
public class TrianglePuzzleApp extends JFrame {

	
	private JPanel contentPane;
	Model model;
	TrianglePuzzleDrawer panel;
	public JLabel WinLbl,playerMovesLabel,playerScoreLabel;
	int moves=0;

	
	public TrianglePuzzleDrawer getPanel() { return panel; }
	

	/**
	 * Create the frame.
	 */
	public TrianglePuzzleApp(Model model) {
		this.model = model;
		setTitle("Triangle Puzzle Application -- CS509");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		panel = new TrianglePuzzleDrawer(model, this);
		panel.addMouseListener(new MouseAdapter() { 
			@Override
			public void mousePressed(MouseEvent me) {
				new SelectNodeController(model, TrianglePuzzleApp.this).process(me.getPoint());
			}
		});
		
		
		
		
		// connects mouse events...
		panel.addMouseListener(new MouseHandler(model, this));
		
		JButton btnSwap = new JButton("Swap Edges");
		btnSwap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SwapEdgesController(model, TrianglePuzzleApp.this).process();
				
				
				
			
				
			}
		});
	
		
		JButton btnUnselectAll = new JButton("Unselect All");
		btnUnselectAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new UnselectAllController(model, TrianglePuzzleApp.this).process();
			}
		});
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ResetController(model, TrianglePuzzleApp.this).process();
			}
		});
		
		JLabel lblMoves = new JLabel("Moves:");
		
		JLabel lblScore = new JLabel("Score:");
		
		playerMovesLabel = new JLabel("0");
//		playerMovesLabel.setText(" "+String.valueOf(model.getNumMoves()));
		
		
		
		playerScoreLabel = new JLabel("0");
		
		
		JLabel WinLbl = new JLabel("");
			
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(btnUnselectAll, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnSwap, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnReset, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblMoves)
									.addGap(18)
									.addComponent(playerMovesLabel))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblScore)
									.addGap(18)
									.addComponent(playerScoreLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(39)
							.addComponent(WinLbl, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(22)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMoves)
								.addComponent(playerMovesLabel))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblScore)
								.addComponent(playerScoreLabel))
							.addGap(113)
							.addComponent(WinLbl)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnUnselectAll)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnSwap)
								.addComponent(btnReset))))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}


	public JLabel getWinLbl() {
		return WinLbl;
	}


	public void setWinLbl(JLabel winLbl) {
		WinLbl = winLbl;
	}


	public JLabel getPlayerMovesLabel() {
		return playerMovesLabel;
	}


	public void setPlayerMovesLabel(JLabel playerMovesLabel) {
		this.playerMovesLabel = playerMovesLabel;
	}


	public JLabel getPlayerScoreLabel() {
		return playerScoreLabel;
	}


	public void setPlayerScoreLabel(JLabel playerScoreLabel) {
		this.playerScoreLabel = playerScoreLabel;
	}
}
