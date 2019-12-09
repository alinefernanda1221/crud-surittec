package br.com.clientes.enums;

/**
 * Enum para representar os tipos de permissão que um usuário pode ter no sistema:
 * - Leitura só pode visualizar dados;
 * - Escrita tem acesso total.
 * 
 * @author aline
 */

public enum PermissaoUsuario {

	LEITURA("L"),
	ESCRITA("E");
	
	private String tipoPermissao;
	
	PermissaoUsuario(String tipoPermissao) {
		this.tipoPermissao = tipoPermissao;
	}
}
