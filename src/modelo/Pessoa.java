package modelo;

public class Pessoa {

	private int idPessoa;
	private String nome;
	private String sobrenome;
	private String cpf;
	private String registrosec;
	private String email;
	private String dataNascimento;
	private String genero;
	private String telResidencial;
	private String telSecundario;
	private String codAzure;
	private String foto;
	private Endereco endereco;

	// Construtores
	public Pessoa() {
	}

	
	public Pessoa(String codAzure, int idPessoa, String nome, String sobrenome, String cpf, String registrosec, String email,
			String dataNascimento, String genero, String telResidencial, String telSecundario, Endereco endereco, String foto) {
		//super(codAzure);
		this.codAzure = codAzure;
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.registrosec = registrosec;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.telResidencial = telResidencial;
		this.telSecundario = telSecundario;
		this.endereco = endereco;
		this.foto = foto;
	}

	// M�todos Getters e Setters
	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRegistrosec() {
		return registrosec;
	}

	public void setRegistrosec(String registrosec) {
		this.registrosec = registrosec;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTelResidencial() {
		return telResidencial;
	}

	public void setTelResidencial(String telResidencial) {
		this.telResidencial = telResidencial;
	}

	public String getTelSecundario() {
		return telSecundario;
	}

	public void setTelSecundario(String telSecundario) {
		this.telSecundario = telSecundario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	

	public String getCodAzure() {
		return codAzure;
	}


	public void setCodAzure(String codAzure) {
		this.codAzure = codAzure;
	}
	
	public String getFoto()
	{
		return foto;
	}


	public void setFoto(String foto)
	{
		this.foto = foto;
	}
	


	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf
				+ ", registrosec=" + registrosec + ", email=" + email + ", dataNascimento=" + dataNascimento
				+ ", genero=" + genero + ", telResidencial=" + telResidencial + ", telSecundario=" + telSecundario
				+ ", codAzure=" + codAzure + ", foto=" + foto + ", endereco=" + endereco + "]";
	}

}
