package org.example.ch05;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatCode;

/**
 * 음식점에서 음식 주문하는 과정 구현
 * 1. 도메인 구성
 * ㄴ 손님, 메뉴판, 돈까스/냉면/만두/요리사/요리
 * 2. 객체들 간의 관계 고민
 * ㄴ 손님 -- 메뉴판
 * ㄴ 손님 -- 요리사
 * ㄴ 요리사 -- 요리
 * 3. 동적인 객체를 정적인 타입으로 추상화해서 도메인 모델링 하기
 * ㄴ 손님 -- 손님 타입
 * ㄴ 돈까스/냉면/만두 -- 요리 타입
 * ㄴ 메뉴판 - 메뉴판 타입
 * ㄴ 메뉴 -- 메뉴 타입
 */
public class CustomerTest {

    @DisplayName("메뉴이름에 해당하는 요리를 주문한다.")
    @Test
    void name() {
        Customer customer = new Customer();
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 5000), new MenuItem("냉면", 7000)));
        Cooking cooking = new Cooking();
        
        assertThatCode(() -> customer.order("만두", menu, cooking))
                .doesNotThrowAnyException();
    }
}
