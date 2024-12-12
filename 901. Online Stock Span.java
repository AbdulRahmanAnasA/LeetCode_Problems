class StockSpanner {
            Stack<Integer> st;  
          List<Integer> list;
    public StockSpanner() {
          st=new Stack<>();
        list=new ArrayList<>();
    }
    
    public int next(int price) {
      
        list.add(price);
        while(!st.isEmpty() && list.get(st.peek())<= price){
            st.pop();
        }
        int PGI;
        if(st.isEmpty()){
            PGI=-1;
        }
        else{
            PGI=st.peek();
        }
        st.push(list.size()-1);
        return (list.size()-1)-PGI;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
