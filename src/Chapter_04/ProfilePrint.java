package Chapter_04;

public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;

    public static void main(String[] args) {
        ProfilePrint profile = new ProfilePrint();
        byte age = 31;
        String name = "Ahn";
        boolean isMarried = false;

        profile.setAge(age);
        profile.setName(name);
        profile.setMarried(isMarried);

        System.out.println(profile.getAge());
        System.out.println(profile.getName());
        System.out.println(profile.isMarried());
    }

    public void setAge (byte paramAge) {
        age = paramAge;
    }

    public byte getAge() {
        return age;
    }

    public void setName(String paramName) {
        name = paramName;
    }

    public String getName() {
        return name;
    }

    public void setMarried(boolean paramIsMarried) {
        isMarried = paramIsMarried;
    }

    public boolean isMarried() {
        return isMarried;
    }
}
