public class LearnUpes {         
    LearnUpes example() {
            System.out.println(this);
    return this;
    }
public static void main(String []args) {
            LearnUpes obj= new LearnUpes().example();
            System.out.println(obj);
}
}