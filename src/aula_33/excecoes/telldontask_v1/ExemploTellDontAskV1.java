package aula_33.excecoes.telldontask_v1;

class PostJaPublicadoException extends RuntimeException {

	private static final long serialVersionUID = 139319620378766703L;

	public PostJaPublicadoException(String mensagem) {
		super(mensagem);
	}
}

enum PostStatus {
	RASCUNHO, PUBLICADO
}

class Post {
	public PostStatus status = PostStatus.RASCUNHO;
}

public class ExemploTellDontAskV1 {

	public static void main(String[] args) {
		Post postagem = new Post();

		if (postagem.status == PostStatus.RASCUNHO) {
			postagem.status = PostStatus.PUBLICADO;
		} else {
			throw new PostJaPublicadoException("Post já publicado!");
		}
	}

}
