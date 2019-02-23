package MyAlgorithm;

// 题目描述：请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。 
// 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配

public class Regular_expression_matching {
	public static void main(String args[]){
		char[] str = {'a'};
		char[] pattern = {'.'};
		
		System.out.println(match(str, pattern, 0, str.length, 0, pattern.length));
	}
	
	public static boolean match(char[] str, char[] pattern, int i, int sLength, int j, int pLength){
		if(i==sLength && j==pLength){
			return true;
		}
		
		if(i==sLength && j!=pLength){
			while(j != pLength){
				if(pattern[j]!='*' && (j+1>=pLength || pattern[j+1]!='*')){
					return false;
				}
				j++;
			}
			return true;
		}
		
		if(i!=sLength && j==pLength){
			return false;
		}
		
		if(j+1 == pLength){
			if(str[i]==pattern[j] || pattern[j]=='.'){
				return match(str, pattern, i+1, sLength, j+1, pLength);
			}
			else{
				return false;
			}
		}
		
		if((str[i]==pattern[j]||pattern[j]=='.') && pattern[j+1]!='*'){
			return match(str, pattern, i+1, sLength, j+1, pLength);
		}
		
		if((str[i]==pattern[j]||pattern[j]=='.') && pattern[j+1]=='*'){
			return match(str, pattern, i+1, sLength, j, pLength) || match(str, pattern, i, sLength, j+2, pLength);
		}
		
		if(pattern[j+1] == '*'){
			return match(str, pattern, i, sLength, j+2, pLength);
		}
		
		return false;
	}
}
