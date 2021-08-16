package myGenericListClass;

public class MyList <T> {
		private Object[] arr;
		private int size; //dizide kaç eleman olduðunu gösterir.
		

		public MyList() {
			arr = new Object[10];
			size = 0;
		}

		public MyList(int capacity) {
			arr = new Object[capacity];
			size = 0;
		}
		
		public int size() {
			return this.getSize();
		}
		
		public int getCapacity() {
			return this.getArr().length;
		}
		
		public void add(T data) {
			if(size<this.getArr().length) {
				for (int i=0; i<this.getArr().length; i++) {
					if(this.getArr()[i]==null) {
						this.getArr()[i] = data;
						this.setSize(this.getSize() + 1);
						break;
					}
				}
			}else {
				Object[] temp = this.getArr();
				arr = new Object[this.getCapacity()*2];
				for(int i = 0; i<temp.length; i++) {
					arr[i] = temp[i];
				}
				arr[size] = data;
				size++;
			}
		}
		
		public T get(int index) {
			T value = (T)(this.getArr()[index]);
			return value != null ? value : null;
		}
		
		public void remove(int index){
			if(index>=0 && index<this.getArr().length && this.getArr()[index]!=null) {
				for(int i=index; i<this.getArr().length; i++) {
					if(i+1<this.getArr().length) {
						this.getArr()[i] = this.getArr()[i+1];
						if(this.getArr()[i]==null) {
							break;
						}
					}else {
						this.getArr()[i]=null;
					}
				}
			}
		}
		
		public void set(int index, T data) {
			if(index<this.getArr().length && index>=0) {
				this.getArr()[index] = data;
			}
		}
		
		public String toString() {
			String s = "[";
			for (int i=0; i<this.getArr().length; i++) {
				if(this.getArr()[i] != null) {
					if((i+1<this.getArr().length && this.getArr()[i+1]==null) || (i == this.getArr().length-1)) {
						s += this.getArr()[i].toString();
						break;
					}
					s += this.getArr()[i].toString() + ",";
				}else {
					break;
				}
			}
			s += "]";
			return s;
		}
		
		public int indexOf(T data) {
			int index = -1;
			for(int i=0; i<this.getArr().length; i++) {
				@SuppressWarnings({"unchecked"})
				T value = (T)arr[i];
				if(value == data) {
					index = i;
					break;
				}
			}
			return index;
		}
		
		public int lastIndexOf(T data) {
			int index = -1;
			for(int i=this.getArr().length-1; i>=0; i--) {
				T value = (T)this.getArr()[i];
				if(value == data) {
					index = i;
					break;
				}
			}
			return index;
		}
		
		public boolean isEmpty() {
			if(this.getArr()[0] == null) {
				return true;
			}else {
				return false;
			}
		}
		
		public void clear() {
			for(int i=0; i<this.getArr().length; i++) {
				this.getArr()[i] = null;
			}
		}
		
		
		public MyList<T> subList(int start,int finish){
			MyList<T> subMyList = new MyList<>(finish-start+1);
			
			if(start>=0 && start<this.getArr().length && finish>=0 && finish<this.getArr().length){
				for(int i=0, j=start; j<=finish; i++, j++) {
					subMyList.toArray()[i] = this.getArr()[j];
				}
			}
			return subMyList;
		}
		
		
		public boolean contains(T data){
			boolean isContain = false;
			for(int i=0; i<this.getArr().length; i++) {
				T value = (T)this.getArr()[i];
				if(value == data) {
					isContain = true;
					break;
				}
			}
			return isContain;
		}

		
		public T[] toArray() {
			@SuppressWarnings({"unchecked"})
			T[] values = (T[])arr;
			return values;
		}
		
		public T[] getArr() {
			@SuppressWarnings({"unchecked"})
			T[] values = (T[])arr;
			return values;
		}

		public void setArr(T[] arr) {
			this.arr = arr;
		}

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}
		
}
