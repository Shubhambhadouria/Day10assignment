//  Explain abstract class and interface with an example.
//
//  Answer.
//
// 	Abstract class:
//  Abstract class doesn't support multiple inheritance and can have final
//	non-final, static and non-static variables. It can provide implementation
// 	of interface. An abstract class can extend another java class and implement
//	multiple java interfaces.
//
//	E.g. public abstract class Bike{
//		
//			public abstract void Engine();
//
//		 }	
//	
//	Interface:
//	Interface can have only abstract methods. Since Java 8, it can have
//	default and static methods also. It has has only static and final 
//	variables. It can't provide the implementation of abstract class.
//	It can extend another Java interface only. It can be implemented 
//	using keyword "implements".
//
//	E.g. public interface Car{
//			void Engine();
//		 }