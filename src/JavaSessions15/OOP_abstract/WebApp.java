package JavaSessions15.OOP_abstract;

//An abstract class can have no abstract method
//An abstract class can have all abstract methods
//An abstract class can have a combination of non abstract and abstract methods
//if a class has a single abstract method then it will have to declared an abstract class
//To achieve 0% abstraction, the abstract class should have no abstract methods but only concrete methods
//To achieve 100% abstraction, the abstract class should have all abstract methods and no concrete methods
//To achieve 0-100%  which is partial abstraction, to have abs...+non abs ...methods
//Interface has 100% abstraction as it has only abstract methods(only default methods are there which is not a part of OOP)
//After jdk 1.8 the interface can have default methods thats why its not 100% abstract
//There can be no multiple abstract parents but there can be multiple parent interfaces

public abstract class WebApp {

	public void url() {

	}

	public void title() {

	}

	public abstract void header();

	public abstract void footer();
}