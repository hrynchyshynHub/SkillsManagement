package ua.com.skills.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.skills.entity.Skills;

/**
 * Created by ваня on 03.01.2017.
 */
public interface SkillsDao extends JpaRepository<Skills,Integer>{
}
