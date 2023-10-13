import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
       Class<?> cl =Class.forName("Company");
        Method[] m=cl.getDeclaredMethods();
        for (Method method: m) {
            System.out.println(method);
        }
        Field[] fields = cl.getDeclaredFields();
        for (Field field:fields) {
            System.out.println(field);
        }
        Method mmm=cl.getMethod("display");
        mmm.invoke(null);
    }
}
