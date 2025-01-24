module com.example.messenger {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.messenger to javafx.fxml;
    exports com.example.messenger;
}