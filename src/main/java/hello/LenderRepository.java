package hello;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "lenders", path = "searchLender")
public interface LenderRepository extends PagingAndSortingRepository<LenderData, Long> {

	List<LenderData> findByLenderId(@Param("id") Long lenderId);
}