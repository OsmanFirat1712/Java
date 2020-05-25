public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


			
			int konfektionsgröße = calculate(0,90,185);
			String umgekehrt = umkehren("Osman");
			
			
			System.out.println(umgekehrt);
			System.out.println(konfektionsgröße);
			
		}
	
		static int calculate(int geschlecht, int brustumfang, int körpergröße) {
			
			int konfektionsgröße;
			if(geschlecht == 0) {
				
				konfektionsgröße = brustumfang / 2;
				
			}
			
			else {
				
				konfektionsgröße = brustumfang / 2;
				
				konfektionsgröße = konfektionsgröße - 6;

			}
			
			return konfektionsgröße;

	
		}
		
		public static String umkehren( String str )
		  {
		    String umgekehrt = new String();

		    for ( int i = str.length()-1; i >= 0; i-- )
		      umgekehrt += str.charAt(i);

		    return umgekehrt;
		  }


		
		}