package scene;

import elements.AmbientLight;
import elements.Camera;
import geometries.Geometries;
import geometries.Intersectable;
import primitives.Color;

public class Scene {
    private final  String _name;
    private  Color _background;
    private  AmbientLight _ambientLight;
    private  Camera _camera;
    private  double _distance;
    private Geometries _geometries;



    /**
     *
     * @param name
     *
     */
    public Scene(String name) {
        this._name = name;

        this._geometries = new Geometries();
    }



    // ***************** Getters/Setters ********************** //

    /**
     *
     * @return the name of the scene
     */
    public String get_name() {
        return _name;
    }

    /**
     * getter of background
     * @return the background color
     */
    public Color getBackground() {
        return _background;
    }
    /**
     * getter of AmbientLight
     * @return the AmbientLight color
     */
    public AmbientLight getAmbientLight() {
        return _ambientLight;
    }

    /**
     * getter of camera
     * @return the camera
     */
    public Camera getCamera() {
        return _camera;
    }

    /**
     * getter of the distance
     * @return _distande
     */
    public double getDistance() {
        return _distance;
    }

    /**
     * getter of geometries
     * @return _geometries
     */
    public Geometries getGeometries() {
        return _geometries;
    }

    /**
     *
     * @param _background
     */
    public void setBackground(Color _background) {
        this._background = _background;
    }

    /**
     *
     * @param _ambientLight
     */
    public void setAmbientLight(AmbientLight _ambientLight) {
        this._ambientLight = _ambientLight;
    }

    /**
     *
     * @param _camera
     */
    public void setCamera(Camera _camera) {
        this._camera = _camera;
    }

    /**
     *
     * @param _distance
     */
    public void setDistance(double _distance) {
        this._distance = _distance;
    }

    /**
     *
     * @param geometries
     */
    public void addGeometries(Intersectable... geometries){
        _geometries.add(geometries);

    }
    /*public static class SceneBuilder{
        private String _name;
        private Color _background;
        private AmbientLight _ambientLight;
        private Camera _camera;
        private double _distance;
        private Geometries _geometries;

        public SceneBuilder (String name){
            this._name = name;
        }

        public SceneBuilder setBackground(Color background) {
            this._background = background;
            return this;
        }

        public SceneBuilder setAmbientLight(AmbientLight ambientLight) {
            this._ambientLight = ambientLight;
            return this;
        }

        public SceneBuilder setCamera(Camera camera) {
            this._camera = camera;
            return this;
        }

        public SceneBuilder setDistance(double distance) {
            this._distance = distance;
            return this;
        }

        public SceneBuilder setGeometries(Geometries geometries) {
            this._geometries = geometries;
            return this;
        }

        public Scene build(){
            Scene scene = new Scene(_name,_background,_ambientLight,_camera,_distance);
            validateSceneObject(scene);
            return scene;
        }
        private void validateSceneObject(Scene scene){
            //Do some basic validations to check
            //if scene object does not break any assumption of system
        }*
    }*/
}