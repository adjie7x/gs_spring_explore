package utility.java8.lambda;

import utility.java8.interfaces.functional_interface.ToDo;

public class UseTodo {
	
	public String add(String str, ToDo toDo){
		return toDo.method(str);
	}
	
	public static void main(String[] args) {
		ToDo toDo = param -> param + " from lambda";
		
		UseTodo useTodo = new UseTodo();
		String result = useTodo.add("message", toDo);
		System.out.println(result);
	}

}
