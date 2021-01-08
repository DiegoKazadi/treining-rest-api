/**
 * 
 */
package com.treine.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.treine.api.model.Cliente;
/**
 * @author diego
 *
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
