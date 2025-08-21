java lang
class Exception3{
	Exception3(String a){
	a = "ankit bhatt";
	System.out.println(a);
	}
	public static void main(String[]args)
	throws Exception{
		try{
			throw new Exception ("object of class could not be created");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally{
			System.out.println("end of code");
		}
	}
}