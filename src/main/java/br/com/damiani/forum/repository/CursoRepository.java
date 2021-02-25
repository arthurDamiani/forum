package br.com.damiani.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.damiani.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
