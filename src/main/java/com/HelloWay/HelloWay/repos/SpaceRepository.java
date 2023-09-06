package com.HelloWay.HelloWay.repos;

import com.HelloWay.HelloWay.entities.Space;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceRepository extends JpaRepository<Space, Long> {

    Boolean existsByTitleSpace(String titleSpace);
}
