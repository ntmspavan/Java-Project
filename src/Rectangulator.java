public class Reactangulator
	{
	public static void main(String[] args)
		{
		int length=Integer.parseInt(args[0]);
		int width=Integer.parseInt(args[1]);
		Recatangle myRectangle= new Reactangle(length,width);
		String output = String.format("*** Your Reactangle ***\n\n Length: %d\n width: %d\n Area: %d\nPerimeter: %d\n\n",myRectangle.length,myRectangle.width,myRectangle.getArea(),myRectangle.getPerimeter());
System.out.println(output);
}
		}
}
