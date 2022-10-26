package EC2.SandraCarpio.Idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC2.SandraCarpio.Idat.model.Producto;


@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
