public class Jewels {
        public static void main(String[] args) {
            String jewels = "aB";
            String stones = "aaaaaAbbbBBBBBBBBB";
    
            String result = "";
    
            for (int i = 0; i < jewels.length(); i++) { 
                char c = jewels.charAt(i);
                int count = 0; 
                for (int j = 0; j < stones.length(); j++) { 
                    if (stones.charAt(j) == c) { 
                        count++;
                    }
                }
                if (count > 0) { 
                    result += c + Integer.toString(count);
                }
            }
            System.out.println(result);
        }
    }
