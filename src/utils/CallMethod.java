package utils;

import java.lang.reflect.Method;

public class CallMethod {
    public static void runSolution(String sectionName, String[] studyMembers) {

        for (String member: studyMembers) {
            System.out.println("----- " + member + " -----");
            String solutionName = sectionName + "." + member + ".Solution";
            try {
                Class<?> solution = Class.forName(solutionName);
                Method mainMethod = solution.getMethod("main", String[].class);
                mainMethod.invoke(null, (Object) null);

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("------------------");
            System.out.println();
        }
    }
}
