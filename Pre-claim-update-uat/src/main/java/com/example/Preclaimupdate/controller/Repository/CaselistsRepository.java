package com.example.Preclaimupdate.controller.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Preclaimupdate.entity.Case_lists;

@Repository
public interface CaselistsRepository extends JpaRepository<Case_lists, Long>{
	
	Case_lists findByCaseId(long caseId);
	
	@Query(value = "SELECT D.* FROM case_lists D WHERE D.caseId IN (SELECT B.caseId FROM "
			+ "(SELECT ROW_NUMBER() OVER(ORDER BY A.caseId) AS RRN , A.caseId from case_lists A "
			+ "WHERE A.caseId in (SELECT caseId from case_movement where toId = :username)) B "
			+ "WHERE B.RRN BETWEEN :min AND :max) ", nativeQuery = true)
	List<Case_lists> getCaselists(@Param("username")String username, 
			@Param("min")int min, @Param("max")int max);
	
	Case_lists save(Case_lists Case_lists);
	
	@Query(value="select count(*) from case_lists where intimationType <> 'CDP' and caseId in "
			+ "(SELECT caseId from case_movement where toId = :username)"
			, nativeQuery = true)		
	int getCaseIntimationCount(@Param("username") String username);
	
	
	@Query(value="select count(*) from case_lists where intimationType = 'CDP' and caseId in "
			+ "(SELECT caseId from case_movement where toId = :username)"
			, nativeQuery = true)
	int getCDPCaseCount(@Param("username") String username);
	
	@Query(value="select * from case_lists where intimationType <> 'CDP' and caseId in "
			+ "(SELECT caseId from case_movement where toId = :username)"
			, nativeQuery = true)		
	List<Case_lists> getCaseIntimationList(@Param("username") String username);
	
	@Query(value="select * from case_lists where intimationType = 'CDP' and caseId in "
			+ "(SELECT caseId from case_movement where toId = :username)"
			, nativeQuery = true)
	List<Case_lists> getCDPCaseList(@Param("username") String username);
	
	
	@Query(value="select a.* from case_lists a, case_movement b where a.caseId = b.caseId and "
			+ "b.toId = :username", nativeQuery = true)
	List<Case_lists> getNewCaseList(@Param("username")String username);

	
	@Query(value="select a.* from case_lists a, ("
			+ "select a.* from audit_case_movement a, ("
			+ "select caseId, max(updatedDate) as updatedDate from audit_case_movement "
			+ "where user_role = 'INV' group by caseId) b "
			+ "where a.caseId = b.caseId and a.updatedDate = b.updatedDate and a.user_role = 'INV') b "
			+ "where a.caseId = b.caseId and b.toId = :username", nativeQuery = true)
	List<Case_lists> getCaseSubmittedList(@Param("username")String username);
	
	@Query(value="select a.* from case_lists a, ("
			+ "select a.* from audit_case_movement a, ("
			+ "select caseId, max(updatedDate) as updatedDate from audit_case_movement where user_role = 'INV' group by caseId) b "
			+ "where a.caseId = b.caseId and a.updatedDate = b.updatedDate and a.user_role = 'INV') b "
			+ "where a.caseId = b.caseId and a.caseStatus = 'Closed' and b.toId = :username", 
			nativeQuery = true)
	List<Case_lists> getCaseClosedList(@Param("username")String username);
	
}
