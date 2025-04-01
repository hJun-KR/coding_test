class Solution {
    public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answerArr = new int[privacies.length]; // 유효기간이 지난 개인정보 수집 일자
        int count = 0; // 유효기간이 지난 개인정보 수집 일자 개수

        // today관련 변수 초기화
        int todayYear = Integer.parseInt(today.substring(0, 4));
        int toayMonth = Integer.parseInt(today.substring(5, 7));
        int todayDay =  Integer.parseInt(today.substring(8, 10));;

        // term관련 변수 초기화
        int termLength = terms.length; // term의 길이
        String[] termContract = new String[termLength]; // 계약조건
        int[] termMonth = new int[termLength];


        // privacies관련 변수 초기화
        int privaciesLength = privacies.length; // privacies의 길이
        int[] privaciesYear = new int[privaciesLength];
        int[] privaciesMonth = new int[privaciesLength];
        int[] privaciesDay = new int[privaciesLength];
        String[] privaciesTerm = new String[privaciesLength];

        // 계약조건 저장
        for (int i = 0; i < termLength; i++) {
            termContract[i] = terms[i].substring(0, 1);
            termMonth[i] = Integer.parseInt(terms[i].substring(2)); // 기간
        }

        // 개인정보 수집 일자 저장
        for (int i = 0; i < privaciesLength; i++) {
            privaciesYear[i] = Integer.parseInt(privacies[i].substring(0, 4));
            privaciesMonth[i] = Integer.parseInt(privacies[i].substring(5, 7));
            privaciesDay[i] = Integer.parseInt(privacies[i].substring(8, 10));
            privaciesTerm[i] = privacies[i].substring(11, 12);
        }

        // 개인정보 수집 일자 유효기간 더해서 구하기
        for (int i = 0; i < privaciesLength; i++) {
            for (int j = 0; j < termLength; j++) {
                if (privaciesTerm[i].equals(termContract[j])) {
                    System.out.println("privaciesTerm[i] : " + privaciesTerm[i]);
                    privaciesMonth[i] += termMonth[j]; // 유효기간 더하기
                    System.out.println("privaciesMonth[i] : " + privaciesMonth[i]);
                }
            }
        }

        // 만약 월이 12를 넘으면 년도 증가
        for (int i = 0; i < privaciesLength; i++) {
            if (privaciesMonth[i] > 12) {
                privaciesYear[i] += privaciesMonth[i] / 12; // 년도 증가
                privaciesMonth[i] = privaciesMonth[i] % 12; // 월은 12로 나눈 나머지
            }
            if (privaciesMonth[i] == 0) {
                privaciesMonth[i] = 12;
                privaciesYear[i] -= 1;
            }
        }

        // 유효기간이 지난 개인정보 수집 일자 구하기
        for (int i = 0; i < privaciesLength; i++) {
            if (privaciesYear[i] < todayYear) { // 년도가 다르면
                answerArr[i] = i + 1; // 유효기간이 지난 개인정보 수집 일자
                count++;
                continue;
            } else if (privaciesYear[i] == todayYear) { // 년도가 같으면
                if (privaciesMonth[i] < toayMonth) { // 월이 다르면
                    answerArr[i] = i + 1; // 유효기간이 지난 개인정보 수집 일자
                    count++;
                    continue;
                } else if (privaciesMonth[i] == toayMonth) { // 월이 같으면
                    if (privaciesDay[i] <= todayDay) { // 일이 다르면
                        answerArr[i] = i + 1; // 유효기간이 지난 개인정보 수집 일자
                        count++;
                        continue;
                    }
                }
            }
        }

        // 유효기간이 지난 개인정보 수집 일자 중에서 0이 아닌 것만 answer에 저장
        int[] answer = new int[count];
        int index = 0;
        for (int i = 0; i < privaciesLength; i++) {
            if (answerArr[i] != 0) { // 유효기간이 지난 개인정보 수집 일자
                answer[index] = answerArr[i]; // answer에 저장
                index++;
            }
        }

        return answer;
    }
}