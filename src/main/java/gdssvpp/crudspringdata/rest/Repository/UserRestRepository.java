package gdssvpp.crudspringdata.rest.Repository;

import gdssvpp.crudspringdata.rest.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "users", collectionResourceRel = "users")
public interface UserRestRepository extends CrudRepository<User, Integer>,
        PagingAndSortingRepository<User, Integer> {

        List<User> findByName(@Param("name") String name);

        /*@Override
        @RestResource(exported = false)
        void deleteById(Integer integer);*/
}
