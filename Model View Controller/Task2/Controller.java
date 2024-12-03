package Task2;

class Controller {
    private Student model;
    private View view;

    public Controller(Student model, View view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void setStudentCourse(String course) {
        model.setCourse(course);
    }

    public String getStudentCourse() {
        return model.getCourse();
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo(), model.getCourse());
    }
}

