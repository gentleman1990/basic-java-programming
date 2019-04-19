import construction.enums.JenkinsStatus;
import construction.statics.ExampleClass;
import construction.statics.StaticMethods;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MainPart2_Structure {

    public static void main(String[] args) {
        //ENUM
        //Brzydka część :)
        JenkinsStatus[] jenkinsStatuses = JenkinsStatus.values();

        for (int i = 0; i < jenkinsStatuses.length; i++) {
            System.out.println("Jenkins status: " + jenkinsStatuses[i] + " has been finished: " + jenkinsStatuses[i].hasFinished);
        }

        //Ladna część
        for (JenkinsStatus status : JenkinsStatus.values()) {
            if(status.hasFinished)
                System.out.println("Jenkins status: " + status + " has been finished: " + status.hasFinished);
        }

        //Uber pro stream z filtrowaniem (przykład jak można przesadzić :D)

        Arrays.stream(JenkinsStatus.values()).filter(value -> value.hasFinished).forEach((System.out::println));
        Arrays.stream(JenkinsStatus.values()).filter(value -> value.hasFinished).collect(Collectors.toList());


        //STATIC CLASS
        ExampleClass.NestedStaticClass nestedStaticClass = new ExampleClass.NestedStaticClass();
        nestedStaticClass.printMessage();

        ExampleClass exampleClass = new ExampleClass();
        ExampleClass.InnerClass innerClass = exampleClass.new InnerClass();
        innerClass.display();

        //STATIC METHOD
        StaticMethods.parseEmail("jakub.socha@ericsson.com");
    }
}
