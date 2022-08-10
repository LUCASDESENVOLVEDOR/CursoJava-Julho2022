package interfaces;

@FunctionalInterface
public interface Operacao04<T,K> {	
	K executar(T item);
}
