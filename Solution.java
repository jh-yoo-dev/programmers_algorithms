import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.stream.*;
import java.math.*;

public class Solution {
    public static void main(String[] args){
        /* int [] budgets = {120, 110, 140, 150};
        int M = 485;
        System.out.println(solution(budgets, M)); */
        /* int budgets = 9;
        int d[] = {1,3,2,5,4}; */
        /* int budgets = 10;
        int d[] = {2,2,3,3}; 
        System.out.println(solution(d,budgets));*/
        /* String s = "abcde";
        System.out.println(solution(s)); */
/* 
        String s = "qwer";
        System.out.println(solution(s)); */
   /*      int a = 5;
        int b = 24;
        System.out.println(solution(a,b)); */
        // int [] arr = {1,1,3,0,0,1,1};
        /* int [] arr = {4,4,4,3,3};
        solution(arr); */
        /* String s = "pPoooyY";
        solution(s); */
        /* String s = solution("Zbcdefg");
        System.out.println("s : " +s); */
        /* String strings[] = {"sun", "bed", "car"};
        solution(strings,1); */
        /* int []numbers={1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand="right";
        System.out.println(solution(numbers, hand));

        String [] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(solution(phone_book)); */
        /* int [] arr = {3,30,34,5,9};
        System.out.println(solution(arr)); */
        String clothes [][] = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }

    public static String solution(String s) {
        String answer = "";
        String strarr[] = s.split("");
        Arrays.sort(strarr);
        Collections.reverse(Arrays.asList(strarr));

        for (String str : strarr) {
            answer += str;
        }
        return answer;
    }

    /*
     * public static boolean solution(String s) { boolean answer = true;
     * 
     * int pCount = 0; int yCount = 0;
     * 
     * char[] array = s.toCharArray();
     * 
     * for(char ch : array) { if(ch == 'p' || ch == 'P') pCount++; if(ch == 'y' ||
     * ch == 'Y') yCount++; }
     * 
     * if(pCount != yCount) answer = false;
     * 
     * return answer; }
     */
    /*
     * public static int[] solution(int []arr){ int[] answer = {}; List<Integer>
     * list = new ArrayList<Integer>();
     * 
     * int temp; for(int i: arr){ if(temp!=i){ list.add(i); } temp = i; } answer =
     * new int[list.size()]; int idx = 0; for(int i: list){ answer[idx] = i; idx++;
     * } IntStream.of(answer).forEach(System.out::println); return answer; }
     */
    public static String solution(int a, int b) {
        String answer = "";
        // String [] Yoil = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        String[] Yoil = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        // 1월1일은 FRI +7 하면 FRI
        int count = 0;
        for (int i = 1; i < a; i++) {
            if (i == 2) { // 윤년 -> 2월은 29일까지
                count += 29;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) { // 4,6,9,11 -> 30일까지
                count += 30;
            } else { // 1,3,5,7,8,12 -> 31일까지
                count += 31;
            }
        }
        System.out.println(Yoil[count % 7]);
        count += b;
        System.out.println(Yoil[count % 7]);
        count -= 1; // Yoil 배열이 FRI부터 시작이므로 1을 빼준다
        System.out.println(Yoil[count % 7]);
        answer = Yoil[count % 7];

        return answer;
    }

    /*
     * public static String solution(String s){ String answer = ""; int size =
     * s.length(); char [] arr = s.toCharArray(); // 중간값이 나누어 떨어지는 경우, 안떨어지는 경우
     * if(size%2==0){ answer += String.valueOf(arr[size/2-1]); answer +=
     * String.valueOf(arr[size/2]); }else { answer = String.valueOf(arr[size/2]); }
     * return answer; }
     */
    /*
     * public static int solution(int[] d, int budget) { int answer = 0; // 오름차순 정렬
     * Arrays.sort(d); int sum = 0; for(int i : d){ sum+= i;
     * System.out.println("sum : " +sum); if(sum <= budget){ answer++;
     * System.out.println("count ++ "); } }
     * 
     * return answer; }
     */
    public static int solution(int[] budgets, int M) {
        int answer = 0; // 상한액
        int min = 0;
        int max = 0;
        max = IntStream.of(budgets).max().orElse(0);

        // max 값 구하기
        for (int i : budgets) {
            if (i > max) {
                max = i;
            }
        }
        while (min <= max) {
            int mid = (min + max) / 2; // 중간 값(상한액)
            int sum = 0;
            IntStream.of(budgets).map(i -> Math.min(i, mid)).sum();

            for (int i : budgets) {
                if (i > mid) { // 상한값보다 중간값이 큰경우
                    sum += mid;
                } else {
                    sum += i;
                }
            }

            if (sum <= M) {
                min = mid + 1;
                answer = mid;
            } else {
                max = mid - 1;
            }

        }

        return answer;
    }

    /**
     * 키패드 누르기 가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을
     * 사용합니다. 4-1. 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용합니다.
     * 
     * @param numbers
     * @param hand
     * @return
     */
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        /**
         * 1,2,3,4,5,6,7,8,9,*,0,# => 1,2,3,4,5,6,7,8,9,10,11,12 로 위치 값 할당
         */
        int left = 10; // *(왼손)의 처음 위치
        int right = 12; // #(오른손)의 처음 위치

        // 2,5,8,0 의 위치가 가장 중요
        for(int i: numbers){
            if(i==1 || i==4 || i==7){
                answer+="L";
                left = i;
            }else if(i==3 || i==6 || i==9){
                answer+="R";
                right = i;
            }else {
                int leftDistance = distance(i, left);
                int rightDistance = distance(i, right);
                // 두손가락의 거리가 다를 경우
                if(leftDistance>rightDistance){
                    answer+="R";
                    right = i;
                }else if(leftDistance<rightDistance){
                    answer+="L";
                    left = i;
                }else{  // 두손가락의 거리가 같을 경우
                    if(hand.equals("left")){
                        answer+="L";
                        left=i;
                    }else{
                        answer+="R";
                        right=i;
                    }
                }
            }

        }

        return answer;
    }
    
    /**
     * x,y 좌표 두 점 간의 거리 값 구하기
     * @param i
     * @param location
     * @return
     */
    public static int distance(int i, int location){
        int result = 0;
        if(i==0){
            i=11;
        }
        if(location==0){
            location=11;
        }
        int locationX=(location-1)/3;
        int locationY=(location-1)%3;
        int ix=(i-1)/3;
        int iy=(i-1)%3;
        
        result = Math.abs(locationX-ix)+Math.abs(locationY-iy);
        return result;
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        for(int i=0; i<phone_book.length; i++){
            for(int j=0; j<phone_book.length; j++){
                if(i!=j && phone_book[i].startsWith(phone_book[j])){
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }

    public static String solution(int[] numbers) {
        String answer="";
        List<String> list = new ArrayList<>();
        for(int i : numbers){
            list.add(String.valueOf(i));
        }
        
        // (s2+s1) 9+3=>93 > (s1+s2) 3+9=>39
        Comparator<String> comparator = (s1, s2) -> (s2+s1).compareTo(s1+s2);
        list = list.stream().sorted(comparator).collect(Collectors.toList());
        if(list.get(0).equals("0")){
            answer+="0";
        }else{
            for(String i : list){
                answer+=i;
            }
        }
       
        return answer;
    }

    public static int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> countMap = new HashMap<>();

        for(String[] str : clothes){
            countMap.put(str[1], countMap.getOrDefault(str[1],0)+1);
        }
        answer = 1;
        for(Integer i : countMap.values()){
            answer *= i + 1; // (의상종류1 + 안입는경우 1) * (의상종류2 + 안입는경우 1)
        }
        answer -= 1;    // 모두 안입는 경우 -1
        return answer;
    }

    /**
     * 게임 맵 최단거리 
     * BFS(넓이우선탐색) Queue사용
     * ㄲㅓ져
     */
    /* class Position {
        int x, y; 
		public Position(int x, int y){
            this.x = x;
            this.y = y;
        }

    }
    
    public int solution(int [][] maps) {
        int answer = 0;
        Queue<Position> queue = new LinkedList<>();
        Position p = new Position(0,0);
        // queue.offer(new Position(0,0));
        queue.offer(p);
        while(!queue.isEmpty()){
            Position temp = queue.poll();
        }
        return answer;
    } */

    /**
     * 올바른 괄호의 개수?
     * DFS(깊이우선탐색) STACK사용
     * @param n
     * @return
     */
    static class P{
        int open, close;
        P(int open, int close){
            open = this.open;
            close = this.close;
        }
    }
    public static int solution(int n){
        int answer = 0;
        Queue<P> stack = new LinkedList();
        // 시작값은 0으로 구성
        stack.offer(new P(0,0));
        while(!stack.isEmpty()){
            P p =stack.poll();
            // 닫힌괄호개수가 열린괄호개수보다 많을수 없다
            if(p.open < p.close)
                continue;
            // 열린괄호개수가 n보다 클수 없다.
            if(p.open > n)
                continue;
            // 열린괄호와 닫힌괄호 개수가 n의 2배일때는 정상처리 및 카운팅
            if(p.open+p.close == 2*n){
                answer++;
                continue;
            }
           
            // 다음 케이스 스택에 입력
            stack.offer(new P(p.open+1, p.close)); // 열리는 케이스 추가
            stack.offer(new P(p.open, p.close+1)); // 닫히는 케이스 추가

        }
        return answer;
    }
}