import com.vaishnavi.practice.abstraction.service.CircleShapeService;
import com.vaishnavi.practice.abstraction.service.SquareShapeService;
import com.vaishnavi.practice.abstraction.service.TriangleShapeService;

public class ShapeAbstractionExample {
    public static void main(String[] args) {
            CircleShapeService circleShapeService = new CircleShapeService();

            circleShapeService.draw();
            circleShapeService.display();

            SquareShapeService squareShapeService = new SquareShapeService();

            squareShapeService.draw();
            squareShapeService.display();

        TriangleShapeService triangleShapeService = new TriangleShapeService();

        triangleShapeService.draw();
        triangleShapeService.display();
        }
    }