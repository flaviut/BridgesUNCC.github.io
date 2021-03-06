
import bridges.base.CircSLelement;
import bridges.connect.Bridges;

public class csllist {

  public static void main(String[] args) throws Exception {

      Bridges bridges = new Bridges(6, "YOUR_API_KEY", "YOUR_USER_ID");

      StudentInfo[] students = {
                      new StudentInfo(
                              "00000000000",
                              "Gretel Chaney",
                              "CS",
                              "g.chaney@generated.com",
                              "magenta",
                              "blue",
                              9.0
                      ),
                      new StudentInfo(
                              "00000000001",
                              "Karol Soderman",
                              "SIS",
                              "k.soderman@generated.com",
                              "magenta",
                              "red",
                              11.0
                      ),
                      new StudentInfo(
                              "00000000002",
                              "Lamont Kyler",
                              "BIO",
                              "l.kyler@generated.com",
                              "yellow",
                              "green",
                              12.0
                      ),
                      new StudentInfo(
                              "00000000003",
                              "Gladys Serino",
                              "CS","g.serino@generated.com",
                              "blue",
                              "magenta",
                              9.0
                      ),
                      new StudentInfo("00000000004",
                              "Starr Mcginn",
                              "CS",
                              "s.mcginn@generated.com",
                              "red",
                              "yellow",
                              15.0)
      };

        CircSLelement&lt;StudentInfo&gt; head = new CircSLelement&lt;StudentInfo&gt;("",students[0]);
        CircSLelement&lt;StudentInfo&gt; current = head;

        for(int i = 1; i < students.length; i++){
            current.setNext(new CircSLelement&lt;StudentInfo&gt;("", students[i]));

						//handle the last element
            if(i == students.length-1){
									//getting the last element
                current = current.getNext();

						//	point the last element to the first element, 
						// 	so the list becomes circular.
                current.getNext().setNext(head);
            }

						//set the current element to be the next element
            current = current.getNext();
        }


        current = head;

							// add visual attributes
        do {
            current.setLabel(current.getValue().getStudentLabel());
            current.getVisualizer().setColor(current.getValue().getFavoriteColor());

            current.getLinkVisualizer(current.getNext()).setColor(current.getValue().getDislikeColor());
            current.getLinkVisualizer(current.getNext()).setThickness(current.getValue().getStudentCreditHours()*0.75);

            current = current.getNext();
        }	while(current.getIdentifier() != head.getIdentifier());

        bridges.setDataStructure(head);
        bridges.visualize();
  }
}
