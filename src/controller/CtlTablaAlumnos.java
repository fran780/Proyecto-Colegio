package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import modelo.Alumno;

import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class CtlTablaAlumnos implements Initializable {

    @FXML private Button btnAgregar;
    @FXML private Button btnEliminar;
    @FXML private TableView tAlumnos;
    @FXML private TableColumn clmnNombre;
    @FXML private TableColumn clmnApellido;
    @FXML private TableColumn clmnGenero;
    @FXML private TableColumn clmnDireccion;
    @FXML private TableColumn clmnTelefono;
    @FXML private ObservableList <Alumno> listaAlumnos= FXCollections.observableArrayList(new ArrayList<Alumno>());

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void onAccionEliminar(ActionEvent actionEvent) {
    }

    public void onAccionAgregar(ActionEvent actionEvent) {
    }
}
