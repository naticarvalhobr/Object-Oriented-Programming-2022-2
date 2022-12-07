package view;

import controller.UsuarioController;

public class FormUsuario {
	public String id;
	public String nome;
	public String cpf;
        public String rg;
	public String sexo;
	public String logradouro;
	public String cep;
	public String bairro;
	public String uf;
	public String pais;

	public boolean btnSalvar() throws ClassNotFoundException {
            UsuarioController userctrl  = new UsuarioController();               

            return userctrl.cadastrar(this);
            
	}

}
