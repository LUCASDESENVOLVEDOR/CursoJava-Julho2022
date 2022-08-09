package interfaces;

@FunctionalInterface
public interface Operacao03<T> {
	
	//T representa algum objeto.
	//pode ser qq letra. T = type.
	int executar(T item);
}
