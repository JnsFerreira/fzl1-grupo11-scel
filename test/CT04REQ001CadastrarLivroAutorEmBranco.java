@Test
void ct04_cadastrar_livro_autor_em_branco(){
    Biblioteca biblioteca = new Biblioteca(); 
    Livro umLivro = new Livro("1221", "Learn Python the hard way"); 
    biblioteca.add(umLivro); 
    assertEquals (1, biblioteca.size()); 
}