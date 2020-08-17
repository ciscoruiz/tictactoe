package usantatecla.tictactoe.views;

import usantatecla.tictactoe.models.Coordinate;
import usantatecla.utils.WithConsoleView;
import usantatecla.tictactoe.models.Error;

class CoordinateView extends WithConsoleView {

    Coordinate read(String title) {
        Coordinate coordinate;
        do {
			this.console.writeln(title);
            int row = this.console.readInt("Row: ") - 1;
            int column = this.console.readInt("Column: ") - 1;
            coordinate = new Coordinate(row, column);
            assert coordinate.isValid();
            if (!coordinate.isValid()) {
				new ErrorView(Error.WRONG_COORDINATES).writeln();
			}
        } while (!coordinate.isValid());
        return coordinate;
    }
}