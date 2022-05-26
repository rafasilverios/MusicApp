# Clone MusicApp

Clone da tela de um app de Musica, utilizando Android Studios + JAVA.

Esses são os primeiros passos em desenvolvimento em android. Se clicar em Play ao lado da musica Enter Sandman, será direcionado a uma segunda tela. Na segunda tela o botão de pause alterna para play e pause quando clicado (apenas visual), se clicar para passar musica pra frente ou para traz a musica é alterada (visual) e se clicar no botão de voltar, na parte superior da tela, é feito o redirecionamento para a tela inicial.

São apenas implementações visuais para testar o que estou aprendendo em Android/JAVA.
#

### ATUALIZAÇÃO 1 (18/05/2022):
- Implementação de Shared Preference para armazenar alguns dados em cache;
- Foi criada uma tela de cadastro para gravar os dados e uma tela de perfil para apresentar os dados cadastrados (Obs.: A senha não será armazenada, pois este não é um metodo de armazenamento seguro).
##### PASSO A PASSO PARA TESTE: 
- Acesse o App e informe os dados solicitados e pressione o botão "cadastrar";
- Na tela principal, clique no icone de perfil (canto inferior direito);
- Na tela de perfil, ao lado do texto, clique na flecha para baixo;
- Pronto!, os dados informados serão apresentado em tela. 
#

### ATUALIZAÇÃO 2 (25/05/2022):
- Aperfeiçoamento do layout das telas de login e de perfil;
- Na tela de perfil, quando pressionado o botão para mostrar dados do usuário, há alteração do botão, alternando entre flecha para cima e flecha para baixo;
- Na tela de perfil, quando pressionado o botão para mostrar dados do usuário (flecha para baixo), agora é possível ocultar os dados pressionando o botão novamente (flecha para cima).
#

### ATUALIZAÇÃO 3 (26/05/2022):
- Havia uma barra de navegação na parte inferior que era apenas visual e nãoo era funcional. A partir dessa atualização, agora a barra de navegação passa a ser uma BottomNavigation;
- Utilizado BottomNavigationView para navegação entre Activities;
- Foram criadas mais duas telas, de favoritos e de pesquisa, que serão finalizadas em breve.
