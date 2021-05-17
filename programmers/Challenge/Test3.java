/*
 * Programmers SummerCoding Challenge Test3 (15/100)
 */
package Challenge;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        Test3 test3 = new Test3();
        for(int i : test3.solution(new int[]{0,1,3,0}, new int[]{0,1,2,3})){
            System.out.println(i);
        }
    }
    public int[] solution(int[] t, int[] r) {
        List<List<Customer>> lift = new ArrayList<>(t.length);
        for(int i=0;i<lift.size();i++){
            List<Customer> customers = new LinkedList<>();
            customers.add(new Customer(i, t[i], r[i]));
            lift.add(t[i], customers);
        }

        int[] result = new int[lift.size()];
        for(int i=0;i<lift.size();i++){
            if(lift.get(i).size() > 1){
                lift.get(i).sort(new Comparator<Customer>() {
                    @Override
                    public int compare(Customer o1, Customer o2) {
                        if(o1.priority == o2.priority){
                            return o1.id - o2.id;
                        }else{
                            return o1.priority - o2.priority;
                        }
                    }
                });

                if(i+1 < lift.size()){
                    result[i] = lift.get(i).get(0).id;
                    System.out.println(result[i]);
                    for(Customer customer : lift.get(i).subList(1,lift.get(i).size())){
                        lift.get(i+1).add(customer);
                    }
                    lift.get(i).subList(1,lift.get(i).size()).clear();
                }else{
                    result[i] = lift.get(i).get(0).id;
                }
            }else{
                result[i] = lift.get(i).get(0).id;
            }
        }

        return result;
    }

    public class Customer{
        private int id;
        private int liftNo;
        private int priority;

        public Customer(int id,int liftNo, int priority){
            this.id = id;
            this.liftNo = liftNo;
            this.priority = priority;
        }
    }
}
