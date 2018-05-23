/* an orange with blue text: "Idea 1"
a pink with black text: "Awesome"
a yellow with green text: "Superb!"
*/

public class PostIt_main {

  public static void main(String[] args) {

    PostIt postIt0 = new PostIt("orange","Idea 1", "blue");
    PostIt postIt1 = new PostIt("pink","Awesome", "black");
    PostIt postIt2 = new PostIt("yellow","Superb!", "yellow");

    System.out.println(postIt0);
    System.out.println(postIt1);
    System.out.println(postIt2);
  }
}
