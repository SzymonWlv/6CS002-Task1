package base;

import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Kevan Buckley, maintained by Szymon Baraniecki student 1913153
 * @version 2.0, 2014
 */
// Class Location - Extends the class SpacePlace - Setting integers 
public class Location extends SpacePlace {
	public int column;
	public int row;
	public DIRECTION d;
	public int tmp;
	// Direction values Vertical and Horizontal
	public enum DIRECTION {
		VERTICAL, HORIZONTAL
	};
	// Location class constructor - Setting parameters of 'row' and 'column'
	public Location(int row, int column) {
		this.row = row;
		this.column = column;
	}
	// 
	public Location(int row, int column, DIRECTION d) {
		this(row, column);
		this.d = d;
	}
	// Loop method to show object as string - Checks for values 'd' and returns different outcomes 
	public String toString() {
		if (d == null) {
			tmp = column + 1;
			return "(" + (tmp) + "," + (row + 1) + ")";
		} else {
			tmp = column + 1;
			return "(" + (tmp) + "," + (row + 1) + "," + d + ")";
		}
	}
	// Loop method used to draw grid lines using graphics object 'g'
	public void drawGridLines(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		for (tmp = 0; tmp <= 7; tmp++) {
			g.drawLine(20, 20 + tmp * 20, 180, 20 + tmp * 20);
		}
		for (int see = 0; see <= 8; see++) {
			g.drawLine(20 + see * 20, 20, 20 + see * 20, 160);
		}
	}
	// Static method used to gather user input
	public static int getInt() {
		BufferedReader row = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				return Integer.parseInt(row.readLine());
			} catch (Exception e) {
			}
		} while (true);
	}
}