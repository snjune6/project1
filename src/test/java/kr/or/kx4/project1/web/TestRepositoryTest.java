package kr.or.kx4.project1.web;

import kr.or.kx4.project1.web.repository.TestRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestRepositoryTest {

    @Autowired
    TestRepository testRepository;

    @Test
    public void testRepTest() {
        kr.or.kx4.project1.web.entity.Test test = kr.or.kx4.project1.web.entity.Test.builder()
                .test1("테스트란 단어가 예약어였네")
                .test2("이런...!")
                .build();

        testRepository.save(test);
    }

}
