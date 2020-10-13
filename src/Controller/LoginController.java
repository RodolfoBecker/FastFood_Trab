package Controller;

import FastFood.Index;
import Infra.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Eduardo
 */
public class LoginController extends Application  {

    @FXML
    private TextField campoUsuario;

    @FXML
    private PasswordField campoSenha;

    @FXML
    private Label mensagem;

    private Connection con;

    public void botaoEntrarOnAction() throws Exception {
        String usuario = campoUsuario.getText();
        int senha = Integer.parseInt(campoSenha.getText());

        boolean valido = validaLogin(usuario, senha);

        if (valido) {
            Index.irParaHome();
        }

        mensagem.setVisible(!valido);
    }

    @Override
    public void start(Stage palco) throws Exception { 
        StackPane raiz = new StackPane();

        Scene cena = new Scene(raiz, 250, 100);
        palco.setTitle("Aprendendo JavaFX");
        palco.setScene(cena);
        palco.show();

    }

    public boolean validaLogin(String usuario, int senha) throws Exception {
        try {
            String sql = "SELECT COUNT(cod_colaborador) "
                    + "FROM Colaboradores "
                    + "WHERE Usuario = ? "
                    + "AND Senha = ?";

            con = ConnectionFactory.conectaBanco();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, usuario.toUpperCase());
            ps.setInt(2, senha);

            return ps.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
