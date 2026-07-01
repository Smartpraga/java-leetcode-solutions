class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        int n=arr.length;
        ArrayList<Integer> al=new ArrayList<>();
        int leader=arr[n-1];
        al.add(leader);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=leader){
            leader=arr[i];
            al.add(0,leader);
            }
        }
        return al;
    }
}
