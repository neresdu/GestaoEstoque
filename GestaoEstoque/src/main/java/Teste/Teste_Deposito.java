package Teste;

import java.util.ArrayList;
import java.util.List;

import DAO.DepositoDAO;
import DAO.GenericoDAO;
import DAO.Produto_DepositoDAO;
import Model.Deposito;
import Model.Produto;
import Model.Produto_Deposito;

public class Teste_Deposito {

	public static void main(String[] args) {
		GenericoDAO g = new GenericoDAO();
		
		Produto_DepositoDAO pdepDAO = new Produto_DepositoDAO();
		Deposito dep = new Deposito();	//criando deposito
		dep.setCategoria_Estoque("Categoria teste");
		dep.setNome("Deposito de frutas");
		dep.setCodigo(32112333);
		g.Save(dep);
		
//		Produto p1 = new Produto();	//criando produto que vai no produto_deposito
//		p1.setNome("prod 1");
//		p1.setCodigo(5555);
//		
//		
//		g.Save(p1);
		/*
		 * Produto p2 = new Produto(); p2.setNome("prod 2"); p2.setCodigo(2222);
		 * p2.setCategoria("produto 2");
		 */
//		List<Produto_Deposito> produtos_depositos = new ArrayList<Produto_Deposito>();
//		Produto_Deposito pdep = new Produto_Deposito();	// criando produto_dep, vincular o produto a 1 deposito
//		pdep.setProduto(p1);
//		//pdep.setCodigo(88);
//		pdep.setDeposito(dep);
		
		//pdepDAO.setProduto_Deposito(15 ,10, 1, 100);

		// parametros: produto, deposito, quantidadeADDestoq
		
//		pdepDAO.ProcessarEntrada(p1, dep, 600);		
		//pdepDAO.ProcessarSaida(p1, dep, 4);
		
		System.out.println("end");
	}

}
