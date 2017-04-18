import java.util.List;

public class Controle {
    private List <Produto>produtos;
    private String statusAtivo;
    private List<Usuario> usuarios;
    private List<Fornecedor> fornecedor;
    private List<Solicitacao> solicitacao;
    private List<Departamento> departamentos;
    private List<NotaFiscal>notas;

    
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public String getStatusAtivo() {
		return statusAtivo;
	}
	public List<Departamento> getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}
	public List<NotaFiscal> getNotas() {
		return notas;
	}
	public void setNotas(List<NotaFiscal> notas) {
		this.notas = notas;
	}
	public void setStatusAtivo(String statusAtivo) {
		this.statusAtivo = statusAtivo;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public List<Fornecedor> getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(List<Fornecedor> fornecedor) {
		this.fornecedor = fornecedor;
	}
	public List<Solicitacao> getSolicitacao() {
		return solicitacao;
	}
	public void setSolicitacao(List<Solicitacao> solicitacao) {
		this.solicitacao = solicitacao;
	}
	
	//Produto
	public void addProduto(Produto prod){
		produtos.add(prod);
	}
	
	public Produto searchProd(String ativoProd){
		for(Produto produto:produtos){
			if(produto.getAtivoProd().equals(ativoProd)) return produto;
		}
		
		return null;
	}
	
	//Usuario
	public void addUsuario(Usuario user){
		usuarios.add(user);
	}	
	
	public Usuario searchUser(String cpf){
		for(Usuario usuario:usuarios){
			if(usuario.getCpf().equals(cpf)) return usuario;
		}
		
		return null;
	}	

	//Fornecedor
	public void addFornecedor(Fornecedor forn){
		fornecedor.add(forn);
	}	
	
	public Fornecedor searchFornecedor(String cnpj){
		for(Fornecedor fornecedor:fornecedor){
			if(fornecedor.getCnpj().equals(cnpj)) return fornecedor;
		}
		
		return null;
	}
	
	//Departamento
	public void addDepartamento(Departamento dept){
		departamentos.add(dept);
	}
	
	public Departamento searchDepartamento(String nomeDept){
		for(Departamento departamento:departamentos){
			if(departamento.getNome().equals(nomeDept)) return departamento;
		}
		
		return null;
	}
	
	//NotaFiscal
	public void addNotaFiscal(NotaFiscal notafiscal){
		notas.add(notafiscal);
	}
	
	public NotaFiscal searchNotaFiscal(String numNota){
		for(NotaFiscal notafiscal:notas){
			if(notafiscal.getNumNota().equals(numNota)) return notafiscal;
		}
		
		return null;
	}
	
	
}	
