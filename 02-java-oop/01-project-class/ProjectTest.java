public class ProjectTest {
    public static void main(String[] args) {
        Project zeroDay = new Project("Zero Day Takeaways", "A Close Up Look At How To Prevent Future Attacks");
        Project workFromHomeSecurity = new Project("Guide to 2021 Work From Home Security");
        Project ethicalHacking = new Project();

        System.out.println(zeroDay);
        System.out.println(workFromHomeSecurity.getName());
        System.out.println(ethicalHacking.getDescription());

        
    


    }
}
