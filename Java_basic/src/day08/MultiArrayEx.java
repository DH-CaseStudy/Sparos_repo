package day08;

import java.io.*;
import java.util.StringTokenizer;

public class MultiArrayEx {
    public static void main(String[] args) throws IOException {
        //정수형 2차원 배열 생성
//        int[][] scores = {
//                {80, 90, 96},
//                {76, 88}
//        };
//
//        int sum = 0;
//
//        for(int[] value : scores){
//            for(int score : value){
//                sum += score;
//            }
//            System.out.println();
//        }
//
//        System.out.printf("%.1f",(double) sum/(scores[0].length + scores[1].length));

        //배열의 길이 1차원 배열의 길이(반의 수)
//        System.out.println(scores.length); //
//        System.out.println(scores[0].length);
//        System.out.println(scores[1].length);
//        System.out.println(scores[1][1]);

//        for(int i = 0; i < scores.length; i++){
//            for(int j = 0; j < scores[i].length; j++){
//                System.out.println(scores[i][j]);
//            }
//            System.out.println();
//        }
//        Seven();
//        Eight();
//        Nine();
        Nine();

    }

    static void Seven() {
        int[] array = {1, 5, 3, 8, 2};

        int maxNum = 0;

        for (int i = 0; i < array.length; i++) {
            if (maxNum < array[i]) {
                maxNum = array[i];
            }
        }

        System.out.println(maxNum);
    }

    static void Eight() {
        int[][] array2 = {
                {95, 86},
                {83, 92, 96},
                {76, 83, 93, 87, 88}
        };

        int sum = 0;
        double avg = 0.0;

        for (int[] value : array2) {
            for (int num : value) {
                sum += num;
            }
        }

        avg = (double) sum / (array2[0].length + array2[1].length + array2[2].length);

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + avg);

    }

    public static void Nine() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int student = 0;
        int[] score = null;
        boolean play = true;

        while (play) {
            bw.write("---------------------------------------------\n");
            bw.write("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료\n");
            bw.write("---------------------------------------------\n");
            bw.flush();

            bw.write("선택> ");
            bw.flush();
            String str = br.readLine();

            switch (str) {
                case "1":
                    bw.write("학생수> ");
                    bw.flush();
                    student = Integer.parseInt(br.readLine());
                    score = new int[student];
                    break;
                case "2":
                    if (student <= 0) {
                        //System.out.println("학생 수가 입력되지 않았습니다.");
                        bw.write("학생 수가 입력되지 않았습니다.\n");
                        bw.flush();
                    } else {
                        for (int i = 0; i < score.length; i++) {
                            //System.out.printf("Score[%d]>", i);
                            bw.write("Score[" + i + "]: ");
                            bw.flush();
                            score[i] = Integer.parseInt(br.readLine());
                        }
                    }

                    break;
                case "3":
                    if (score == null) {
                        //System.out.println("점수가 입력되지 않았습니다.");
                        bw.write("점수가 입력되지 않았습니다.\n");
                        bw.flush();
                    } else {
                        for (int i = 0; i < score.length; i++) {
                            //System.out.println("scores" + "[" + i+ "]" + ":" + score[i]);
                            bw.write("Score[" + i + "]: " + ":" + score[i] + "\n");
                            bw.flush();

                        }
                    }

                    break;
                case "4":
                    int sum = 0;
                    int maxNum = 0;
                    double avg = 0.0;
                    if (score == null || student <= 0) {
                        //System.out.println("분석 할 내용이 없습니다");
                        bw.write("분석 할 내용이 없습니다.");
                        bw.flush();
                    } else {
                        for (int i = 0; i < score.length; i++) {
                            sum += score[i];
                            if (maxNum < score[i]) {
                                maxNum = score[i];
                            }
                        }

                        avg = (double) sum / score.length;

                        bw.write("최고 점수: " + maxNum + "\n");
                        bw.write("평균 점수: " + avg + "\n");
                        bw.flush();
                    }
                    break;
                case "5":
                    //System.out.println("프로그램 종료");
                    bw.write("프로그램 종료" + "\n");
                    bw.flush();
                    play = false;
                    break;
                default:
                    bw.write("잘못된 입력입니다." + "\n");
                    bw.flush();
            }
        }
    }
}
