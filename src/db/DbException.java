package db;

public class DbException extends RuntimeException {

	private static final long serialVersionUID = 2935525375641635298L;

	public DbException(String mensagem) {
		super(mensagem);
	}

}
