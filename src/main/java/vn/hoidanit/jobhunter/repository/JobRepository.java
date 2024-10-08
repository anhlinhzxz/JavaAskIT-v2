package vn.hoidanit.jobhunter.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import vn.hoidanit.jobhunter.domain.Job;

public interface JobRepository extends JpaRepository<Job, Long> {

     Job findByName(String name);

     Page<Job> findAll(Specification<Job> spec, Pageable pageable);
     
}
