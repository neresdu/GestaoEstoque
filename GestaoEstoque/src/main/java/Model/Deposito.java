package Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Depositos")
public class Deposito {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Codigo")
	private int Codigo;
	
	@Column(name = "Categoria_Estoque")
	private String Categoria_Estoque;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Produto_Deposito> Produtos;
	
	
	public Deposito() {
		
	}

	public Deposito(String categoria_Estoque, int codigo, List<Produto_Deposito> produtos) {
		super();
		Categoria_Estoque = categoria_Estoque;
		Codigo = codigo;
		Produtos = produtos;
	}

	public String getCategoria_Estoque() {
		return Categoria_Estoque;
	}

	public void setCategoria_Estoque(String categoria_Estoque) {
		Categoria_Estoque = categoria_Estoque;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public List<Produto_Deposito> getProdutos() {
		return Produtos;
	}

	public void setProdutos(List<Produto_Deposito> produtos) {
		Produtos = produtos;
	}
	
	
	

}
