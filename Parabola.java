
public class Parabola{
    //1. Altura maxima
    public static double alturaMaxima(double v0,double angulo){
        double seno=Math.sin(Math.toRadians(angulo));
        final double g=9.81;
        return (v0*v0*seno*seno)/(2*g);
    }
    //2. El alcance
    public static double alcance(double v0,double angulo){
        angulo=angulo*2;
        double seno=Math.sin(Math.toRadians(angulo));
        final double g=9.81;
        return (v0*v0*seno)/g;
    }
    //3. El tiempo total
    public static double tiempoTotal(double v0,double angulo){
        double seno=Math.sin(Math.toRadians(angulo));
        final double g=9.81;
        return(2*v0*seno)/g;
    }
    //4. La posición de un proyectil en un determinado tiempo
    public static String posicion(double v0,double angulo,double tiempo){
        double seno=Math.sin(Math.toRadians(angulo));
        final double g=9.81;
        double coseno=Math.cos(Math.toRadians(angulo));
        double v0x=v0*coseno;
        double v0y=v0*seno;
        double posx=v0x*tiempo;
        double posy=(v0y*tiempo)-(g*tiempo*tiempo/2);
        return posx+", "+posy;
    }
    //5. El tiempo en la altura máxima
    public static double tiempoAlturaMax(double v0,double angulo){
        double seno=Math.sin(Math.toRadians(angulo));
        final double g=9.81;
        double v0y=v0*seno;
        return v0y/g;
    }
    //6. La forma rectangular del vector velocidad
    public static String formaRectangular(double v0,double angulo){
        double seno=Math.sin(Math.toRadians(angulo));
        final double g=9.81;
        double coseno=Math.cos(Math.toRadians(angulo));
        double v0x=v0*coseno;
        double v0y=v0*seno;
        return "Velocidad x:"+v0x+", Velocidad y:"+v0y;
    }
    //7. La magnitud de la velocidad en un determinado punto
    public static double magnitudVelocidad(double v0,double angulo,double t){
        double seno=Math.sin(Math.toRadians(angulo));
        final double g=9.81;
        double coseno=Math.cos(Math.toRadians(angulo));
        double v0x=v0*coseno;
        double v0y=v0*seno;
        double vy=v0y-(g*t);
        return Math.sqrt((v0x*v0x)+(vy*vy));
    }
    //8. La velocidad en "y" en un determinado tiempo
    public static double velocidadY(double v0,double angulo,double t){
        double seno=Math.sin(Math.toRadians(angulo));
        final double g=9.81;
        double v0y=v0*seno;
        return v0y-g*t;
    }
    //9. el alcance conociendo el tiempo total y la velocidad en x
    public static double alcanceT(double v0,double angulo){
        double coseno=Math.cos(Math.toRadians(angulo));
        double tiT=tiempoTotal(v0,angulo);
        double v0x=v0*coseno;
        return v0x*tiT;
    }
}