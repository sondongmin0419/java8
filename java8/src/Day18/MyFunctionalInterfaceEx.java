package Day18;

public class MyFunctionalInterfaceEx {
		public int outterField = 10;
		
		class Inner{
			int InnerField = 20;
			void method() {
				MyFunctionalInterface fi = ()->{
					System.out.println("outterField: "+outterField);
					System.out.println("outterField: "+MyFunctionalInterfaceEx.this.outterField+"\n");
					System.out.println("innerField: "+InnerField);
					System.out.println("innerFueld: "+MyFunctionalInterfaceEx.this.inne);
				};
			}
			
		}

}
