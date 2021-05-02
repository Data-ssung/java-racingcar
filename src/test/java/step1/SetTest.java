package step1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void SetUP() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // Test Case 구현
    // 요구사항1
    @Test
    void sizeTest() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    // 요구사항2
    // True 값만 테스트 가능
    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void containTest(int inputValue) {
        assertThat(numbers).contains(inputValue);
    }

    // 요구사항3
    // False 값도 테스트 가능
    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:true", "5:false"}, delimiter = ':')
    void containsTest2(int inputValue, boolean expected) {
        assertThat(numbers.contains(inputValue)).isEqualTo(expected);
    }
}
