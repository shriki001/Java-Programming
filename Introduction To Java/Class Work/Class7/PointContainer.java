package Class7;

public class PointContainer {
	private Point[] points;
	private int size = 0;

	public PointContainer() {
		points = new Point[1];
	}

	public PointContainer(int a) {
		points = new Point[a];
	}

	public int size() {
		return size;
	}

	public int capacity() {
		return points.length;
	}

	public void add(Point p) {
		resize();
		points[size++] = p;
	}

	private void resize() {
		if (size == points.length) {
			Point[] temp = new Point[2 * size];
			int i = 0;
			while (i < size) {
				temp[i] = points[i];
				++i;
			}
			points = temp;
		}
	}

	public Point pointAt(int i) {
		return points[i];
	}

	public void remove(int i) {
		int j = i;
		while (j < points.length - 1) {
			points[j] = points[j + 1];
			points[points.length - 1] = null;
			++j;
		}
	}

	public void remove(Circle c) {
		int i = 0;
		while (i < points.length - 1) {
			if (c.contains(points[i])) {
				points[i] = points[i + 1];
			}
			remove(i);
			++i;
		}
	}
}
