package kr.or.kx4.project1.web.repository;

import kr.or.kx4.project1.web.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}
