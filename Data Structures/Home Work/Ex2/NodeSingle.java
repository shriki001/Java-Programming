package Ex2;

	public class NodeSingle<T> {
		T data;
		NodeSingle<T> next;

		public NodeSingle(T data, NodeSingle<T> next) {
			this.data = data;
			this.next = next;
		}

		public String toString() {
			return "" + this.data;
		}
	}

