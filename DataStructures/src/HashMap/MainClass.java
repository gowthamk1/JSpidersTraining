package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MainClass {
//	public static void main(String[] args) {
//		String str="programming language";
//		Map<Character,Integer> map=new HashMap<Character,Integer>();
//		for(char ch: str.toCharArray()) {
//			map.put(ch,map.getOrDefault(ch, 0)+1);
//		}
//		for (Map.Entry<Character,Integer>m:map.entrySet()) {
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
//		map.forEach((key,value)->{
//			System.out.println(key+" "+value);
//		});
//		for(char ch:map.keySet()) {
//			System.out.println(ch);
//		}
//		for(int n:map.values()) {
//			System.out.println(n);
//		}
//	}
	
	public static void main(String[] args) {
		String str="([]{){}[]";
		System.out.println(isValid(str));
	}
	static boolean isValid(String str) {	
		Stack<Character> stack=new Stack<Character>();
		for (char ch:str.toCharArray()) {
			if(ch=='(' || ch=='{' || ch=='['){
				stack.push(ch);
			}else if(ch==')'&&(!stack.isEmpty()||stack.peek()!='(')) {
				stack.pop();
			}else if(ch==']'&&(!stack.isEmpty()||stack.peek()!='[')) {
				stack.pop();
			}else if(ch=='}'&&(!stack.isEmpty()||stack.peek()!='{')) {
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}
