package estudo;

public class listaEncadeada {
		
	private node primeiro;
	private node ultimo;
	private int tamanho;
	
	public listaEncadeada() {
		this.tamanho=0;
	}
	
	public node getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(node primeiro) {
		this.primeiro = primeiro;
	}
	public node getUltimo() {
		return ultimo;
	}
	public void setUltimo(node ultimo) {
		this.ultimo = ultimo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public void adicionar(String novoValor) {
		node novoElemento = new node(novoValor);
		if(this.primeiro == null && this.ultimo == null) {
			this.primeiro = novoElemento;
			this.ultimo = novoElemento;
		}else {
			this.ultimo.setProximo(novoElemento);
			this.ultimo = novoElemento;
		}
		this.tamanho++;
	}
	public void remover(String novoValor) {
		node anterior = null;
		node atual = this.primeiro;
		for(int i=0; i < this.getTamanho(); i++) {
			if(this.tamanho ==1) {
				this.primeiro = null;
				this.ultimo = null;
			}else if(atual == primeiro) {
				this.primeiro = atual.getProximo();
				atual.setProximo(null);
			}else if(atual == ultimo) {
				this.ultimo = anterior;
				anterior.setProximo(null);
			}else {
				anterior.setProximo(atual.getProximo());
				atual = null;
			}
			this.tamanho--;
			break;
		}
	}
	public node get(int posicao) {
		node atual = this.primeiro;
		for(int i=0; i<posicao; i++) {
			if(atual.getProximo() != null) {
				atual = atual.getProximo();
			}
		}
		return atual;
	}
}
