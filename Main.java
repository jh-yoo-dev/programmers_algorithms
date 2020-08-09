import java.util.*;
import java.util.stream.*;

public class Main{
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     int A = scan.nextInt();
    //     int B = scan.nextInt();
    //     if(A>B){
    //         System.out.print(">");
    //     }else if(A<B){
    //         System.out.print("<");
    //     }else {
    //         System.out.print("==");
    //     }
    // }
    
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     int N = scan.nextInt();
    //     int arr[] = new int[N];
    //     for(int i=0; i<N; i++){
    //         arr[i] = Integer.parseInt(scan.next());
    //     }
    //     solution(N, arr);
    // }

    // public static void solution(int N, int[] arr){
    //     int max = arr[0];
    //     int min = arr[0];
    //     for(int i=0; i< arr.length; i++){
    //         int temp = arr[i];
    //         if(max < temp){
    //             max = temp;
    //         }else if(min >temp){
    //             min = temp;
    //         }
    //     }
    //     System.out.print(min+" "+max);
    // }
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     int []arr = new int[9];
    //     for(int i=0; i<9; i++){
    //         arr[i]=Integer.parseInt(scan.next());
    //     }

    //     int max = arr[0];
    //     int index = 1;
    //     for(int i=0; i<9; i++){
    //         if(max < arr[i]){
    //             max = arr[i];
    //             index = i+1;
    //         }
    //     }
    //     System.out.println(max);
    //     System.out.println(index);
    // }

    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     int N = scan.nextInt();
    //     int result = 1;
    //     for(int i=1; i<=N; i++){
    //         result*=i;
    //     }
    //     System.out.println(result);
    // }
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     int N = scan.nextInt();
    //     int arr[] = new int[N];
    //     int temp = 0;
    //     int sum = 0;
    //     for(int i=0; i<N; i++){
    //         arr[i] = Integer.parseInt(scan.next());
    //     }
    //     Arrays.sort(arr);
    //     for(int i=0; i<N; i++){
    //         temp+=arr[i];
    //         sum+=temp;
    //     }
    //     System.out.println(sum);
    // }
    public static void main(final String[] args) {
        // String[] arr1 = {"mislav", "stanko", "mislav", "ana"};
        // String[] arr2 = {"stanko", "ana", "mislav"};
        // Map<String, Integer> map = new HashMap<String, Integer>();
        // for(String str : arr1){
        //     map.put(str, map.getOrDefault(str, 0)+1);
        // }
        // System.out.println(map);
        // int[] answer = {1,2,3,4,5};
        // int[] answer = {1,3,2,4,2};
        // int arr[] = {1, 5, 2, 6, 3, 7, 4};
        // int arr2[][] = 	{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        // solution(arr, arr2);
        // int arr[] = {4,11};
        // System.out.println(solution(11, arr, 1));
        /* int arr[] = {9};
        System.out.println(solution(16, arr, 2)); */
        /* int arr[] = {6,10,2};
        int arr2[] = {3,30,34,5,9};
        System.out.println(solution(arr));
        System.out.println(solution(arr2));
         */
        // System.out.println(solution("try hello world"));
        // System.out.print(" ");
    }
    
    // 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
    /* public static int[] solution(int[] answers) {
        int[] answer = {};
        List<Integer> result = new ArrayList<Integer>();
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};
        int score[] = {0,0,0};
        for(int i=0; i<answers.length; i++){
            if(student1[i%answers.length]== answers[i]) score[0]++;
            if(student2[i%answers.length]== answers[i]) score[1]++;
            if(student3[i%answers.length]== answers[i]) score[2]++;
        }s
        int max = Math.max(Math.max(score[0],score[1]),score[2]);
        for(int i=0; i<score.length; i++){
            if(max == score[i]){
                result.add(i+1);
            }
        }
        answer = new int[result.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = result.get(i);
        }

        return answer;
    } */

/*     public static void solution(int n) {
        if(n>0){
            solution(n-1);
            System.out.println(n);
        }
    } */

    // public static int[] solution(int[] array, int[][] commands) {
    //     int[] answer = new int[commands.length];
        
    //     for(int i=0; i<commands.length; i++){
    //         int [] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
    //         Arrays.sort(arr);
    //         int k = commands[i][2]-1;
    //         answer[i] = arr[k];
    //     }
    //     return answer;
    // }
        /* public static int solution(int n, int[] stations, int w) {
            int answer = 0;
            int idx = 0;
            // Queue<Integer> queue = new LinkedList<>();
            // for(int i: stations){
            //     queue.add(i);
            // }
            int station = 1;
            while(station <= n){
                if(idx < stations.length && stations[idx] - w <= station){
                    station = stations[idx] + w +  1;
                    idx++;
                }else {
                    answer+=1;
                    station += w+1+w;
                }
                
            }

            return answer;
        } */
        /* public static String solution(int [] numbers){
            String answer="";
            // 숫자 -> 문자 -> 내림차순정렬 -> 조합
            String [] arr = new String[numbers.length];
            for(int i=0 ; i<numbers.length; i++){
                arr[i] = String.valueOf(numbers[i]);
            }*/
            
            // lamdba jdk8
            /* Arrays.sort(arr, (s1,s2) -> 
                (s2+s1).compareTo(s1+s2)); */
            // Arrays.sort(arr,Comparator.reverseOrder());
            /* Arrays.sort(arr, new Comparator<String>(){
                public int compare(String s1, String s2){
                    return (s2+s1).compareTo(s1+s2);
                }
            }); */
         /*    // 버블정렬 (내림차순)
            for(int i=0; i<arr.length-1; i++){
                for(int j=i+1; j<arr.length; j++){
                    String s1 = arr[i];
                    String s2 = arr[j];
                    if((s1+s2).compareTo(s2+s1) < 0){
                        arr[i] = arr[j];
                        arr[j] = s1;
                    }
                }
            } */

            // 조합 ㅅㅂ
           /*  for(String str : arr){
                answer += str;
            }
            if(answer.startsWith("0")) return "0";
            return answer;
        } */

/* 
        public int solution(int[] budgets, int M) {
            int answer = 0;
            int left = 0;
            int right = 0;
            right = IntStream.of(budgets).max().orElse(0);
            for(int i: budgets){
                if(i > right)
                    right = i;
            }
            while(right >= left){
                int mid = (right+left)/2;
                int sum = 0;
                for(int i : budgets){
                    if(i > budgets[mid]){
                        sum+=budgets[mid];
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }   
            }
            
            return answer;
        } */

        /* public static String solution(String s){
            String answer = "";
            String [] arr = s.split("");
            int count = 0;
            for(String str : arr){
                if(str.contains(" ")){
                    count = 0;
                }else if(count%2==0){
                    answer += str.toUpperCase();
                    count++;
                }else if(count%2!=0){
                    answer += str.toLowerCase();
                    count++;
                }

                if(count==0)
                    answer+= " ";
            }
            return answer;
        } */

  /*   public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(i%divisor==0){
                list.add(i);
            }
        }
        list.sort(Comparator.naturalOrder());
        answer = new int[list.size()];
        if(list.isEmpty()){
            answer[0]=-1;
            return answer;
        }

        for(int i=0 ; i <list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    } */

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        // 전체학생수 n, 체육복도난당한학생번호 lost, 여벌체육복가져온학생번호 reserver        
        answer = n;
        int lost_size = lost.length;
        int reserve_size = reserve.length;
        List list = Arrays.asList(reserve);
        
        for(int i: lost){
            
        }
        if(reserve_size - lost_size<0){
            int m = (lost_size - reserve_size);            
            answer -= m;                      
        }else if(reserve_size - lost_size == 0){
            return n;
        }
        return answer;
    }
}

