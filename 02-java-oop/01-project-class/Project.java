public class Project {
    //attributes
    private String name;
    private String description;

    //constructor method
    public void elevatorPitch(String name, String description) {
        this.name = name;
        this.description = description;
        
    }

    //overloaded methods
    public Project() {
        this.name = "Cybersecurity Demo";
        this.description = "Find out how we can make WFH more secure with our DaaS";
    }

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //method to return name & description
    public void elevatorPitch(Project target, String description) {
        this.name = "30 Seconds to Greatness";
        this.description = "Give it all you've got!";
        System.out.println("%s; %s");
    }

    public void ethicalHacking(Project target, String name, String description) {
        this.name = "Ethical Hacking";
        this.description = "Description: Learn to Help Your Company Avoid Ransomeware";
    }

    //getters & setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
