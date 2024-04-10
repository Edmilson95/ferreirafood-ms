package br.com.ferreirafood.pagamentos.repository;

import br.com.ferreirafood.pagamentos.model.Pagamento;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

}
