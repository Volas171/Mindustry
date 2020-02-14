package mindustry.entities.def;

import arc.math.geom.*;
import arc.math.geom.QuadTree.*;
import mindustry.annotations.Annotations.*;
import mindustry.gen.*;

@Component
abstract class HitboxComp implements Posc, QuadTreeObject{
    @Import float x, y;

    transient float lastX, lastY, hitSize;

    @Override
    public void update(){

    }

    @Override
    public void add(){
        lastX = x;
        lastY = y;
    }

    void updateLastPosition(){
        lastX = x;
        lastY = y;
    }

    void collision(Hitboxc other, float x, float y){

    }

    float deltaX(){
        return x - lastX;
    }

    float deltaY(){
        return y - lastY;
    }

    boolean collides(Hitboxc other){
        return true;
    }

    @Override
    public void hitbox(Rect rect){
        rect.setCentered(x, y, hitSize, hitSize);
    }

    public void hitboxTile(Rect rect){
        float scale = 0.66f;
        rect.setCentered(x, y, hitSize * scale, hitSize * scale);
    }
}
