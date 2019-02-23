package MyAlgorithm;

// ��Ŀ��������ʵ��һ����������ƥ�����'.'��'*'��������ʽ��ģʽ�е��ַ�'.'��ʾ����һ���ַ�����'*'��ʾ��ǰ����ַ����Գ�������Σ�����0�Σ��� 
// �ڱ����У�ƥ����ָ�ַ����������ַ�ƥ������ģʽ�����磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣬������"aa.a"��"ab*a"����ƥ��

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
