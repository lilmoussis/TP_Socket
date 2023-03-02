module com.moussa.tp_socket {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.moussa.tp_socket to javafx.fxml;
    exports com.moussa.tp_socket;
}