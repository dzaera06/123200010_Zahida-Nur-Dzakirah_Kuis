package responsi.pbo;

import javax.swing.text.View;

class MVC {
    private Model model;
    private View view;

    public MVC(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    MVC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void run() {
        this.model.load_data();
        this.view.display_data(this.model.get_data());
    }

    void menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
