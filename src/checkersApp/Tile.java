/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkersApp;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author user
 */
public class Tile extends Rectangle{
    private Piece piece;

    public boolean hasPiece() {
        return piece != null;
    }

    public Piece getPiece() {
        return piece;
    } 
    
    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    
    public Tile(boolean light, int x, int y) {
        setWidth(CheckersApp.TILE_SIZE);
        setHeight(CheckersApp.TILE_SIZE);
        
        relocate(x * CheckersApp.TILE_SIZE, y * CheckersApp.TILE_SIZE);
        
        setFill(light ? Color.valueOf("#000") : Color.valueOf("#fff"));
    }
}
