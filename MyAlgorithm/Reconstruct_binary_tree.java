package MyAlgorithm;

// ��Ŀ����������ĳ��������ǰ���������������Ľ����
// ���ؽ����ö����������������ǰ���������������Ľ���ж������ظ������֡�
// ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�

public class Reconstruct_binary_tree {
	public static void main(String args[]){
		TreeNode tree = new TreeNode(0);
		int pre[] = {1,2,4,7,3,5,6,8};
		int in[] = {4,7,2,1,5,3,8,6};
		tree = test(pre, in, 0, pre.length-1, 0, in.length-1);
	}
	
	// �����������������õݹ�ķ���
	public static TreeNode test(int [] pre, int [] in, int startPre,int endPre, int startIn,int endIn) {
        
        if(startPre>endPre||startIn>endIn)
            return null;
        TreeNode root=new TreeNode(pre[startPre]); // ��һ���ܹؼ������Խ�ʡ�ܶ�ʱ��
          
        for(int i=startIn;i<=endIn;i++)
            if(in[i]==pre[startPre]){
                root.left = test(pre,in,startPre+1,startPre+i-startIn,startIn,i-1);
                root.right = test(pre,in,i-startIn+startPre+1,endPre,i+1,endIn);
                break;
            }
                  
        return root;
    }
}
