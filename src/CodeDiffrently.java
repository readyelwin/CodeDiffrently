



public class DogWalkerTesting {

	public static void main(String[] args) {
		@Test
		public void firstTest() {
			 DogWalker dw = new DogWalker();
		        int[] dogs = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
		        int expected = dw.numberOfWalksCalculator(dogs);
		        int actual = 6;
		        Assert.assertEquals(expected, actual);
		    }
		    @Test
		    public void secondTest(){
		        DogWalker dw = new DogWalker();
		        int[] dogs = {10, 20, 10, 10, 30, 50, 10, 20, 30};
		        int expected = dw.numberOfWalksCalculator(dogs);
		        int actual = 6;
		        int actual = 5;
		        Assert.assertEquals(expected, actual);
		    }
		}
		
		
	
	}


