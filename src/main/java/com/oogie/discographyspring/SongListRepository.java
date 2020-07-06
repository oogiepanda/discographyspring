package com.oogie.discographyspring;

import com.oogie.discographyspring.model.SongListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongListRepository extends JpaRepository<SongListEntity, Integer> {
}
