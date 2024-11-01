module uni.mosey.jmstore {
    requires javafx.controls;
    requires javafx.fxml;


    opens uni.mosey.jmstore to javafx.fxml;
    exports uni.mosey.jmstore;
}