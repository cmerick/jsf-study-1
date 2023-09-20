package br.com.lpm.livraria.bean;


import javax.faces.bean.ManagedBean;

@ManagedBean
public class LivroBean {
	
	
	private Livro livro = new Livro();
	
	public Livro getLivro() {
		return livro;
	}
	
	public void gravar() {
		double value = this.livro.getPreco();
		
		String result = String.format("%.2f", value);
		
		System.out.println("Gravando Livro\nTitulo: " + this.livro.getTitulo() + "\nISBN: " + this.livro.getIsbn() + "\nPreço: R$" + result + "\nData de Lançamento: " +this.livro.getDataLancamento());
	}

}
