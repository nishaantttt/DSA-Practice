class Solution {
    public void generate(List<String> result,int max , int o , int c, String unp){
        if(unp.length()==2*max){
            result.add(unp);
            return;
        }
        if(o<max){
            generate(result,max,o+1,c,unp+"(");
        }
        if(c<o){
            generate(result,max,o,c+1,unp+")");
        }
        
    }
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<String>();
        generate(result,n,0,0,"");
        return result;
    }
    
}