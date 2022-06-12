package com.Problem2;

public class Main  {

	public static void main(String[] args) {
		
		School sc1 = new Teacher();
		
		System.out.println(sc1.garden);
		
		sc1.games();
		sc1.timing();
		
//		sc1.teach();   //C T Error
//		
//		System.out.println(sc1.salary);  //C T Error
		
		Teacher t1 = (Teacher) sc1;
		
		t1.teach();
		
		System.out.println(t1.salary);
		
		School sc2  = new School();
		
		Teacher t2 = (Teacher) sc2; ////   CLASS CAST EXCEPTION (clearly its not a compilation error)
		
		t2.teach();
      
	}

}
/*

                                <--------------------Downcasting ------------------------------->
                            
                            
           UPCASTING --    Notice that the parent class reference variable can refer to the child class object,
                            known as upcasting.(line -- 7)

           DOWNCASTING -- To a parent class variable we can assign the child class object also,
                          and from that parent class variable if we try to call any overriden method then due to
                          Runtime polymorphism the overriden method will be called. (line 12)
                          
                          
                          
                           but if a parent class  reference points to a child class object, with that parent class refernce
                           we can not call the child class specific methods, which are not available inside the parent class.
                           (line 14 and  16 )
                           as these instance variable and methods are unrechable to the object refered by parent class.
                           
                           
                           to call the child class specific method from the parent class reference variable we need
                           to downcast the parent class variable to the appropriate child class object.
                           line(-- 18 ) and the related method called in  (line20)


                        <------------------------------ClassCastException----------------------------------------------------->
                       
                       We can downcast the parent class variable to the child class object only if
                       the Parent class variable points to the Child class object , otherwise it will throw a
                       runtime exception called ClassCastException.
                       
                       
                       example -- Line - 26;










*/