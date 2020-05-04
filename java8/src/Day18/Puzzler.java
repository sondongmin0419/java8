package Day18;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Locale;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Puzzler extends JPanel{
	JLabel[] lables;
	Point[] points;
	Block[] blocks;
	int x;
		public static void main(String[] args) {
			JFrame f = new JFrame("숫자퍼즐");
			Puzzler p = new Puzzler();
			p.setLayout(null);
			p.makeGame();
			
			f.addKeyListener(p.getKeyListener());
			f.add(p);
			f.setSize(270,400);
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		void makeGame() {
			lables = new JLabel[25];
			points = new Point[25];
			blocks = new Block[25];
			
			for (int i =0;i<blocks.length;i++)
			{
				lables[i] = new JLabel(i+1+"", JLabel.CENTER);
				lables[i].setSize(50,50);
				lables[i].setBorder(BorderFactory.createLineBorder(Color.green));
				points[i] = new Point(i%5*50,i/5*50);
				lables[i].setLocation(points[i]);
				blocks[i] = new Block(lables[i], points[i]);
				this.add(lables[i]);
			}
			this.remove(lables[blocks.length-1]);
			x=blocks.length;
		}
		KeyListener getKeyListener() {
			KeyListener listener = new KeyListener() {
				
				@Override
				public void keyTyped(KeyEvent e) {
					// TODO 자동 생성된 메소드 스텁
					
				}
				
				@Override
				public void keyReleased(KeyEvent e) {
					// TODO 자동 생성된 메소드 스텁
					
				}
				
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_LEFT && x%5!=1) {
						x--;
						moveGame(x,e.getKeyCode());
					}
					else if (e.getKeyCode() == KeyEvent.VK_RIGHT && x%5!=0)
					{
						x++;
						moveGame(x,e.getKeyCode());
					}
					else if (e.getKeyCode() == KeyEvent.VK_UP && x>5)
					{
						x-=5;
						moveGame(x,e.getKeyCode());
					}else if (e.getKeyCode() == KeyEvent.VK_DOWN && x<21)
					{
						x+=5;
						moveGame(x,e.getKeyCode());
					}
					System.out.println(x);
				}
			};
			return listener;
		}
		
		void moveGame(int x, int keyCode) {
			switch(keyCode) {
			case KeyEvent.VK_RIGHT:
				JLabel lable = blocks[x-1].getLable();
				blocks[x=1].setLable(null);
				blocks[x].setLable(lable);
				lable.setLocation(blocks[x].getPoint());
				break;
			case KeyEvent.VK_LEFT:
				lable = blocks[x-1].getLable();
				blocks[x=1].setLable(null);
				blocks[x].setLable(lable);
				lable.setLocation(blocks[x-2].getPoint());
				break;
			case KeyEvent.VK_UP:
	
				break;
			case KeyEvent.VK_DOWN:
	
				break;
				
			}
		}
		
		public Puzzler(JLabel[] lables, Point[] points, Block[] blocks, int x) {
			super();
			this.lables = lables;
			this.points = points;
			this.blocks = blocks;
			this.x = x;
		}

		public Puzzler(JLabel[] lables, Point[] points, Block[] blocks) {
			super();
			this.lables = lables;
			this.points = points;
			this.blocks = blocks;
		}



		public Puzzler() {
			// TODO 자동 생성된 생성자 스텁
		}

		public JLabel[] getLables() {
			return lables;
		}

		public void setLables(JLabel[] lables) {
			this.lables = lables;
		}

		public Point[] getPoints() {
			return points;
		}

		public void setPoints(Point[] points) {
			this.points = points;
		}

		public Block[] getBlocks() {
			return blocks;
		}

		public void setBlocks(Block[] blocks) {
			this.blocks = blocks;
		}
		
		void shuffleGame() {
			for (int i = 0;i<1000;i++)
			{
			}
		}
		
		class Block{
			private JLabel lable;
			private Point point;
			public Block(JLabel lables ,Point point)
			{
				
			}
			public Point getPoint() {
				// TODO 자동 생성된 메소드 스텁
				return null;
			}
			public void setLable(JLabel lable2) {
				// TODO 자동 생성된 메소드 스텁
				
			}
			public JLabel getLable() {
				// TODO 자동 생성된 메소드 스텁
				return null;
			}
		}
	}

