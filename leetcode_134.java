public class leetcode_134 {
    public static void main(String[] args) {
        int [] gas = {5,1,2,3,4}, cost = {4,4,1,5,1};
        System.out.println(gas_Station(gas,cost));
    }

    public static int gas_Station(int [] gas, int [] cost){

        int totalGas = 0;
        int totalCost =0;
        for(int i=0; i<gas.length; i++){
            totalGas += gas[i];  
            totalCost += cost[i];
        }

        if(totalGas < totalCost ) return -1;
        int currentGas =0, startIndex =0;
        for(int i=0; i<gas.length; i++){
            currentGas += gas[i] - cost[i];
            if(currentGas < 0){
                startIndex = i+1;
                currentGas =0;
            }
        }
        return startIndex;
    }
    
}
