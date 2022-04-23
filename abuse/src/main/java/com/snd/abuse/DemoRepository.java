package com.snd.abuse;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DemoRepository extends JpaRepository <demoEntity, Long> {
}