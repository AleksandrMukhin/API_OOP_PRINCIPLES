public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Александр";
        post.passport = "3405 № 998543";
        post.patronymic = "Александрович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Петров";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
    }
}
