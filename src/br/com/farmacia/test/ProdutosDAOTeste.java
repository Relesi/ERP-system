package br.com.farmacia.test;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import br.com.farmacia.DAO.ProdutoDAO;
import br.com.farmacia.domain.Fornecedores;
import br.com.farmacia.domain.Produtos;

public class ProdutosDAOTeste {

	@Test
	@Ignore
	public void salvar() throws SQLException {

		Produtos p1 = new Produtos();
		p1.setDescricao("Tandrilax");
		p1.setPreco(3.0);
		p1.setQuantidade(10L);

		Fornecedores f = new Fornecedores();
		f.setCodigo(12L);
		p1.setFornecedores(f);

		ProdutoDAO fdao = new ProdutoDAO();
		fdao.salvar(p1);

	}


	@Test
	@Ignore
	public void listar() throws SQLException {

		
		ProdutoDAO fdao = new ProdutoDAO();
		ArrayList<Produtos> lista = fdao.listar();
		
		for (Produtos p : lista) {
			System.out.println("Código do produto: " + p.getCodigo());
			System.out.println("Descrição do produto: " + p.getDescricao());
			System.out.println("Valor do produto: " + p.getPreco());
			System.out.println("Qauntidade do produto: " + p.getQuantidade());
			System.out.println("Código fornecedor: " + p.getFornecedores().getCodigo());
			System.out.println("Valor do produto: " + p.getFornecedores().getDescricao());

			System.out.println("");

			
		}
		
		
	}
	@Test
	@Ignore
	public void excluir() throws SQLException {
		
		Produtos p = new Produtos();
		p.setCodigo(3L);
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.excluir(p);
	}
	
	@Test	
	public void editar()throws SQLException {
		Produtos p = new Produtos();
		p.setCodigo(5L);
		p.setDescricao("Lisadores_rls");
		p.setPreco(16.75);
		p.setQuantidade(20L);
		
		Fornecedores f = new Fornecedores();
		f.setCodigo(10L);
		p.setFornecedores(f);
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.editar(p);
		
		
		
	}



}
