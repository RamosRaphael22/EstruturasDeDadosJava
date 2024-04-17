package estudo;

public class node {
		
		private String valor;
		private node proximo;
		
		public node(String novoValor) {
			this.valor = novoValor;
		}
		
		public String getValor() {
			return valor;
		}
		public void setValor(String valor) {
			this.valor = valor;
		}
		public node getProximo() {
			return proximo;
		}
		public void setProximo(node proximo) {
			this.proximo = proximo;
		}

}
