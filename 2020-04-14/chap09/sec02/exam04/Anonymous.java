package sec02.exam04;

public class Anonymous {
	private int field = 10;
	
	public int getField() {
		return field;
	}

	public void setField(int field) {
		this.field = field;
	}

	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
			
		//arg1 = 20;
		//arg2 = 10;
		
		//var1 = 22;
		//var2 = 21;
		
		Calculatable calc = new Calculatable() {
			
			@Override
			public int sum() {
				// TODO Auto-generated method stub
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}
