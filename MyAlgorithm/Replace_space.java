package MyAlgorithm;

// ��Ŀ����
// ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy
public class Replace_space {
	public static void main(String args[]){
		StringBuffer str = new StringBuffer("");
		str.append("We are the world");
		for(int i=0; i<str.length(); i++){ //���ȱ�ʾ��length()
			char c = str.charAt(i); // �ҵ�StringBuffer�ϵ��ַ�
			if(c == ' '){
				str.replace(i, i+1, "%20"); // �滻��ע�⿪ͷ�ͽ�β�ı��
			}
		}
		System.out.println(str.substring(0, str.length())); // ��StringBuffer��ʾΪString����
	}
}
