import java.util.*;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));
            if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
                result -= value;
            } else {
                result += value;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution(); 

        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();
        sc.nextLine(); 
        
        for (int i = 1; i <= t; i++) {
            System.out.print("Enter Roman numeral " + i + ": ");
            String s = sc.nextLine().trim().toUpperCase();
            int result = sol.romanToInt(s); 
            System.out.println("Integer value: " + result);
        }
        
        sc.close();
    }
}
