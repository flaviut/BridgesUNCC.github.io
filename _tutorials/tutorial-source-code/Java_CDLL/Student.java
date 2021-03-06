package Java_CDLL;

/**
* Created by Lucas Estrella on 1/31/2017.
*/
  public class Student {
      private String studentID,
                     fullName,
                     program,
                     email,
                     dislikeColor,
                     favoriteColor,
                     avatar;

      private boolean visited;

      public boolean isVisited() {
          return visited;
      }

      public void setVisited(boolean visited) {
          this.visited = visited;
      }

      private double studentCreditHours;

      /**
       * @param studentID
       * @param fullName
       * @param program
       * @param email
       */
      public Student(String studentID,
                     String fullName,
                     String program,
                     String email,
                     String dislikeColor,
                     String favoriteColor,
                     double studentCreditHours,
                     String avatar) {
          this.studentID = studentID;
          this.fullName = fullName;
          this.program = program;
          this.email = email;
          this.dislikeColor = dislikeColor;
          this.favoriteColor = favoriteColor;
          this.studentCreditHours = studentCreditHours;
          this.avatar = avatar;
      }

      /**
       * @return studentID
       */
      public String getStudentID() {
          return studentID;
      }

      /**
       * @param studentID
       */
      public void setStudentID(String studentID) {
          this.studentID = studentID;
      }

      /**
       * @return fullName
       */
      public String getFullName() {
          return fullName;
      }

      /**
       * @param fullName
       */
      public void setFullName(String fullName) {
          this.fullName = fullName;
      }

      /**
       * @return program
       */
      public String getProgram() {
          return program;
      }

      /**
       * @param program
       */
      public void setProgram(String program) {
          this.program = program;
      }

      /**
       * @return email
       */
      public String getEmail() {
          return email;
      }

      /**
       * @param email
       */
      public void setEmail(String email) {
          this.email = email;
      }


      /**
       * @return favoriteColor
       */
      public String getFavoriteColor() {
          return favoriteColor;
      }

      /**
       * @param favoriteColor
       */
      public void setFavoriteColor(String favoriteColor) {
          this.favoriteColor = favoriteColor;
      }


      public String getAvatar() {
          return avatar;
      }

      public void setAvatar(String avatar) {
          this.avatar = avatar;
      }

      public String getDislikeColor() {
          return dislikeColor;
      }

      public void setDislikeColor(String dislikeColor) {
          this.dislikeColor = dislikeColor;
      }

      public double getStudentCreditHours() {
          return studentCreditHours;
      }

      public void setStudentCreditHours(double studentCreditHours) {
          this.studentCreditHours = studentCreditHours;
      }

      public String getStudentLabel() {
          String $label =
                                             fullName      +  "\n"   +
                                 "Email: " + email         +  "\n"   +
                               "Program: " + program       +  "\n"   +
                            "Student ID: " + studentID     +  "\n"   +
                        "Favorite Color: " + favoriteColor +  "\n";

          if(avatar != null)
              $label += "&lt;img width='100' src='" + avatar        +  "'/&gt;";


          return $label;
      }
  }
