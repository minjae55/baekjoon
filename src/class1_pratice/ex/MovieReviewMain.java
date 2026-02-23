package class1_pratice.ex;

public class MovieReviewMain {

    public static void main(String[] args) {

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "아 재밌다";
        System.out.println("영화 제목 : " + inception.title + " 영화 리뷰 : " + inception.review);
    }
}
