//metodo facil
public static boolean findElement(int[][] arr, int x) {
	int row = 0;
	int column = arr[0].length-1;

	while(row < arr.length && column >= 0) {
		if(arr[row][column] == x) return true;
		if(arr[row][column] > x) {
			column--;
		} else if(arr[row][column] < x) {
			row++;
		}
	}
	return false;
}

//metodo dificil
public static Coordinate findElement(int[][] arr, Coordinate origin, Coordinate dest, int x) {
	if(!origin.inbounds(arr) || !dest.inbounds(arr)) return null;

	if(arr[origin.row][origin.column] == x) return origin;
	else if(!origin.isBefore(dest)) return null;

	Coordinate start = (Coordinate) origin.clone();
	int diagDist = Math.min(dest.row - origin.row, dest.column - origin.column);
	Coordinate end = new Coordinate(start.row + diagDist, start.column + diagDist);
	Coordinate p = new Coordinate(0, 0);

	while(start.isBefore(end)) {
		p.setToAverage(start, end);
		if(x < arr[p.row][p.column]) {
			start.row = p.row + 1;
			start.column = p.column + 1;
		} else {
			end.row = p.row - 1;
			end.column = p.column - 1;
		}
	}
	return partitionAndSearch(arr, origin, dest, start, x);
}

public static Coordinate partitionAndSearch(int[][] arr, Coordinate origin, Coordinate dest, Coordinate pivot, int elem) {
	Coordinate lowerLeftOrigin = new Coordinate(pivot.row, origin.column);
	Coordinate lowerLeftDest = new Coordinate(des.row, pivot.column - 1);
	Coordinate upperRightOrigin = new Coordinate(origin.row, pivot.column);
	Coordinate upperRightDest = new Coordinate(pivot.row - 1, dest.column);

	Coordinate lowerLeft = findElement(arr, lowerLeftOrigin, lowerLeftDest, elem);
	if(lowerLeft == null) return findElement(arr, upperRightOrigin, upperRightDest, elem);

	return lowerLeft;
}

public static Coordinate findElement(int[][] arr, int elem) {
	Coordinate origin = new Coordinate(0, 0);
	Coordinate dest = new Coordinate(arr.length - 1, arr[0].length - 1);

	return findElement(arr, origin, dest, elem);
}

public class Coordinate implements Cloneable{
	public int row;
	public int column;

	public Coordinate(int r, int c) {
		this.row = r;
		this.column = c;
	}

	public boolean inbounds(int[][] arr) {
		return row >= 0 && column >= 0 && row < arr.length && column < arr[0].length;
	}

	public boolean isBefore(Coordinate p) {
		return row <= p.row && column <= p.column;
	}

	public Object clone() {
		return new Coordinate(row, column);
	}

	public void setToAverage(Coordinate min, Coordinate max) {
		row = (min.row + max.row) / 2;
		column = (min.column + max.column) / 2;
	}
}