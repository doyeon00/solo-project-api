package com.codestates.soloproject.api.v1.repository;

import com.codestates.soloproject.api.v1.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
